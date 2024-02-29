package util;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import dao.impl.departmentDaoimpl;
import model.departments;

    
    public class DataInMysql 
{ 	
    //宣告變數
    public static String selectedLoginId_card;
    public static String selectedId_card;
    public static String selectedDepartment;
    public static String selectedDoctor;
    public static String selectedDate;
    public static String selectedTime;
    public static String selectedNumber;
    private static Map<String, AtomicInteger> dailyHighestNumbers = new ConcurrentHashMap<>();

    //初始化
    static {initializeDailyHighestNumbers();}

    //初始化每日最高號碼
    private static void initializeDailyHighestNumbers() {
        String fileName = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE) + "_highestNumbers.txt";
        File file = new File(fileName);

        if (file.exists())
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) 
            {
                String storedDate = reader.readLine();
                if (storedDate != null && storedDate.equals(LocalDate.now().toString())) {
                    while (true) 
                    {
                        String department = reader.readLine();
                        String count = reader.readLine();
                        if (department != null && count != null) 
                        {dailyHighestNumbers.put(department, new AtomicInteger(Integer.parseInt(count)));} 
                        
                        else {break;}
                    }}} catch (IOException e) {e.printStackTrace();}}} 

    
    
    //生成掛號號碼
    public static String selectedNumber() 
    {
        AtomicInteger counter = dailyHighestNumbers.computeIfAbsent(selectedDepartment, key -> new AtomicInteger(1));
        int currentNumber = counter.getAndIncrement();
        selectedNumber = String.valueOf(currentNumber);  // 將掛號號碼資訊存放到 selectedNumber 變數中
        return selectedNumber;
    }
    
    
    

   //選擇資料
    public static void setSelectedData(String id_card, String department, String doctor, String date, String time, String number) 
    {
        selectedLoginId_card = id_card;
        selectedId_card = id_card;
        selectedDepartment = department;
        selectedDoctor = doctor;
        selectedDate = date;
        selectedTime = time;
        selectedNumber = number;
    }

    
    
    
    //掛號方法
    public static void registration() 
    {
        departments dep = new departments(
            DataInMysql.selectedId_card,
            DataInMysql.selectedDepartment,
            DataInMysql.selectedDoctor,
            DataInMysql.selectedDate,
            DataInMysql.selectedTime,
            DataInMysql.selectedNumber = DataInMysql.selectedNumber()); 

        new departmentDaoimpl().add(dep);
        writeHighestNumbersToFile();
    }


    
    
    
    //寫入當日最高號碼到檔案
    private static void writeHighestNumbersToFile() 
    {
        String fileName = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE) + "_highestNumbers.txt";
        File file = new File(fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
         {
            writer.write(LocalDate.now().toString());
            writer.newLine();
            for (Map.Entry<String, AtomicInteger> entry : dailyHighestNumbers.entrySet()) {
                writer.write(entry.getKey());
                writer.newLine();
                writer.write(String.valueOf(entry.getValue().get()));
                writer.newLine();
            }
        } catch (IOException e) {e.printStackTrace();}
    }
}
