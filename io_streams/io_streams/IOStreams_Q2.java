package io_streams;

import java.io.*;
import java.util.*;
public class IOStreams_Q2 {

	public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the input file name");
	String s=sc.nextLine();
	System.out.println("Enter the output file name");
	String s2=sc.nextLine();
	File f1=new File(s);
	File f2=new File(s2);
	FileReader r=new FileReader(f1);
	FileWriter w=new FileWriter(f2);
	int c;
	while((c=r.read())!=-1) {
		w.write(c);
	}
	r.close();
	w.close();
	System.out.println("File is copied");
	}

}
