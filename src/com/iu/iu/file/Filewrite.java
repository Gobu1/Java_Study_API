package com.iu.iu.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
	
	public void write() throws Exception
	{
		File file = new File("C:\\Study","tesst.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("asssd\r\n");
		
		fw.write("Todayss String\r\n");
		fw.flush();
	}

}
