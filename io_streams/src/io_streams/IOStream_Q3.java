package io_streams;
import java.io.*;
import java.util.*;

public class IOStream_Q3 {

	public static void main(String[] args) throws IOException {
	if(args.length<2) {
		System.out.println("Invalid");
		return;
	}
	String in=args[0];
	String out=args[1];
	Map<String,Integer> count=new TreeMap<>();
	String line;
	BufferedReader br=new BufferedReader(new FileReader(in));
	while((line=br.readLine())!=null){
		String[] words=line.split("\\s+");
		for(String word:words) {
			count.put((word+1),0);
		}
	}
	BufferedWriter bw=new BufferedWriter(new FileWriter(out));
	for(Map.Entry<String, Integer> entry:count.entrySet()) {
		bw.write(entry.getKey()+":"+entry.getValue());
		bw.newLine();
	}
	System.out.println("Word count written to"+out);
	}

}
