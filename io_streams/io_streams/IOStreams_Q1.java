package io_streams;
import java.util.*;
import java.io.*;
public class IOStreams_Q1 {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		
		System.out.println("Enter the file name");
		String s=sc.nextLine();
		File f=new File(s);
		if(!f.exists()) {
			System.out.println("Not found");
			return;
		}
		System.out.println("Enter the character to be counted");
		char ch=sc.next().toLowerCase().charAt(0);
		FileReader r=new FileReader(f);
		int c;
		while((c=r.read())!=-1) {
			if(Character.toLowerCase((char)c)==ch) {
				count++;
			}
		}
		r.close();
		System.out.println("File"+f+"has"+count+"instances of letter"+ch);
    }

}
