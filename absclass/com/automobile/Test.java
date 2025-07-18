package com.automobile;
import com.automobile.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hero h=new Hero();
      System.out.println(h.getModelName());
      System.out.println(h.getRegistrationNumber());
      System.out.println(h.getOwnerName());
      System.out.println(h.getSpeed());
      h.radio();
      Honda h1=new Honda();
      System.out.println("------------------");
      System.out.println(h1.getModelName());
      System.out.println(h1.getRegistrationNumber());
      System.out.println(h1.getOwnerName());
      System.out.println(h1.getSpeed());
      h1.cdplayer();
      System.out.println("------------------");
      Logan l=new Logan();
      System.out.println(l.getModelName());
      l.gps();
      Ford f=new Ford();
      System.out.println("------------");
      System.out.println(f.getModelName());
      System.out.println(f.tempControl());
	}

}
