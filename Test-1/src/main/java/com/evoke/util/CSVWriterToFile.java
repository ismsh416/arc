package com.evoke.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.util.concurrent.SuccessCallback;

import com.evoke.entity.TestData;
import com.opencsv.CSVWriter;
import com.evoke.*;
public class CSVWriterToFile {
	public static void main(String[] args) {
		TestData td = new TestData("GURU","TEJA");
	//	writeDataAtOnce("C:\\Users\\tdevireddy\\Documents\\sts\\Test-1\\src\\bank.csv");
	}
	public static void writeDataAtOnce(String filePath)
	{
	  
	    // first create file object for file placed at location
	    // specified by filepath
	    File file = new File(filePath);
	  
	    try {
	        // create FileWriter object with file as parameter
	        FileWriter outputfile = new FileWriter(file);
	  
	        // create CSVWriter object filewriter object as parameter
	        CSVWriter writer = new CSVWriter(outputfile);
	  
	        // create a List which contains String array
	        List<String[]> data = new ArrayList<String[]>();
	        data.add(new String[] { "TxnId", "Result", "Amount" ,"TxnType" });
	        
	        Random random = new Random(); 
	        for (int i = 0; i < 100; i++) {
	        	String txnId =UUID.randomUUID().toString().replace("-", "");
	        	System.out.println(txnId);
	        	String result = i % 2 == 0?"Success":"Failure";
	        	String txnType = i % 2 == 0?"DEBIT":(i % 3==0?"CREDIT":"BALENQ");
	        	String amount = random.nextInt(10000)+"";   
	        	data.add(new String[] { txnId, result, amount,txnType });
			}
	        writer.writeAll(data);
	  
	        // closing writer connection
	        writer.close();
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}

