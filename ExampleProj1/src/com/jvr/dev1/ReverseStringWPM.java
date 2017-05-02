package com.jvr.dev1;

import java.util.Scanner;

public class ReverseStringWPM {

  public void reverseString(){
	  
	  String str="Hello World";
	  String reverseStr="";
	  for(int i=str.length()-1;i>=0;--i){
		  reverseStr +=str.charAt(i);
		  
	  }//for
	  System.out.println(reverseStr);
  }//method
	public void reverseStr(){
		
		String str1="JVENKATAREDDY";
		 String str="";
		for(int i=str1.length()-1;i>=0;--i){
			str +=str1.charAt(i);
			
		}//for
		System.out.println(str);
	}//method
  public static void main(String[] args) {
	//Reverse String operation
      ReverseStringWPM rev=new ReverseStringWPM();	  
         
      // rev.reverseString();
       rev.reverseStr();
      
       
       //call reverseName()
        reverseName();  
       
	}//main

     public static void  reverseName(){
    	 Scanner scn=new Scanner(System.in);
    	 System.out.print("Enter Name:");
    	 String name=scn.nextLine();
    	 String rev="";
    	 for(int i=name.length()-1;i>=0;--i){
    		 rev +=name.charAt(i);
    	 }//for
    	 System.out.println(rev);
     }//method
  
  
}//class
