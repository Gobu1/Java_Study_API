package com.iu.iu.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileReadMain 
{

	public static void main(String[] args) 
	{
		FileRead fr = new FileRead();
		Filewrite fw = new Filewrite();
		try {
			fr.read();
			fw.write();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
