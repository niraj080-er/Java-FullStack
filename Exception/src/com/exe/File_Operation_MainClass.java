package com.exe;

import java.io.FileNotFoundException;

public class File_Operation_MainClass {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Main Method Started");
		FileOperation fo=new FileOperation();
		fo.Readfile("N:\\JSpider Java\\IOFile.sample.text");
	}
}
