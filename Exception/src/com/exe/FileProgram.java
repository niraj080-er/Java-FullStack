package com.exe;

import java.io.File;

import java.io.IOException;


public class FileProgram {
	public static void main(String[] args) {
		
		File f1=new File("N:\\JSpider Java\\IOFile.sample.text");
		try {
			f1.createNewFile();
		}catch(IOException exp) {
			System.out.println("Insode the catch block");
			exp.printStackTrace();
		}
	}

}
