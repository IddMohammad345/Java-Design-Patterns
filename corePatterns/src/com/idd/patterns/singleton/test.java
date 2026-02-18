package com.idd.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil dateUtil = DateUtil.getInstance();
		DateUtil dateUtil1 = DateUtil.getInstance();
		System.out.println("Lazy singleton "+ (dateUtil == dateUtil1) );
		
		DateUtil_Eager eager1=DateUtil_Eager.getInstance();
		DateUtil_Eager eager2=DateUtil_Eager.getInstance();
		System.out.println("Eager singleton "+(eager1==eager2));
		
		DateUtil_threadSafe_Serialzable dateSafe_Serialzable=DateUtil_threadSafe_Serialzable.getInstance();
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\WORKSPACE\\JavaDesignPattarn\\Design-Pattarn-Summary.docx")));
		outputStream.writeObject(dateSafe_Serialzable);
		
		DateUtil_threadSafe_Serialzable safe_Serialzable=null;
		ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(new File("C:\\WORKSPACE\\JavaDesignPattarn\\Design-Pattarn-Summary.docx")));
		safe_Serialzable=(DateUtil_threadSafe_Serialzable)inputStream.readObject();
		
		outputStream.close();
		inputStream.close();
		
		System.out.println(dateSafe_Serialzable==safe_Serialzable);
	}
}
