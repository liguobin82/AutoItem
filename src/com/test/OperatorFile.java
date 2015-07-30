package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class OperatorFile {

	/*
     * Description:该类主要对文件进行读写，包含如下功能：
     * 1、创建文件夹：
     * 2、创建新文件：
     * 3、往文件里面写内容：有两种方法，一种是PrintStream，一种是StringBuffer
     * 4、从文件中读取内容：使用BufferedReader读取文件内容
     */
	
	public void createDir(String path){
		File dir = new File(path);
		if(!dir.exists()){
			dir.mkdir();
		}
	}
	
	public String createFile(String path){
		String filename="test.txt";
		String filepath=null;
		try{
			File file = new File(path+"/"+filename);
			if(!file.exists())
				file.createNewFile();
			    filepath=file.getPath();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return filepath;
	}
	
	public void printStreamFile(String filepath,String context){
		int i;//定义写的行数
		try{
		    FileOutputStream out = new FileOutputStream(filepath);	
		    PrintStream print = new PrintStream(out);
		    for(i=0;i<1;i++)
		    	print.println(context);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		
	}
	
	//使用StringBuffer写没有编写。
	
	public String ReaderContext(String filepath) throws IOException{
		File file = new File(filepath);
		if(!file.exists())
			throw new FileNotFoundException();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String temp=null;
		StringBuffer strbuf = new StringBuffer();
		temp=br.readLine();
		while(temp!=null){
			strbuf.append(temp+" ");
			temp=br.readLine();
		}
		
		return strbuf.toString();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int i;
         OperatorFile ofile = new OperatorFile();
         String dirpath="D:\\filetest";
         String filepath;
         ofile.createDir(dirpath);
         filepath=ofile.createFile(dirpath);
         System.out.println(filepath);
         
         ofile.printStreamFile(filepath, "9900");
         String out=ofile.ReaderContext(filepath);
         i=Integer.valueOf(out.trim()).intValue();
         System.out.println(i);
         System.out.println(String.format("%08d", i));
	}

	
}
