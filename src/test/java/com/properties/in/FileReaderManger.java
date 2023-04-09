package com.properties.in;

public class FileReaderManger {
	//private Constructor 
	public FileReaderManger() {
		
	}
	//current class object Static
	public static FileReaderManger getInstanceFR() {
    FileReaderManger fr=new FileReaderManger();
    return fr;

    }
	//another class method should be non static
	public Config_Reader getInstanceCR() throws Throwable {
     Config_Reader cr=new Config_Reader();
     return cr;
	}

}
