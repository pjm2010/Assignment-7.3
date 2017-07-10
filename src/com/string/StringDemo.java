package com.string;
/*This class will familarise us with the capacity of the StringBuilder Class*/
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("About String Builder");
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb.length()); //Iniatial length of a String Builder 
		System.out.println(sb.capacity()); //Initial capacity of a String Builder 
			
		//Appending within the capacity
		for(int i=1;i<=15;i++){
			sb.append("I");
		}
		System.out.println("After appending within the capacity "+sb.length()); // length of a String Builder 
		System.out.println("After appending  withing the capacity "+sb.capacity()); // capacity of a String Builder 
		
		
		//Appending outside  the capacity
		
		for(int i=1;i<=17;i++){
			sb1.append("I");
		}
		System.out.println("After appending outside the capacity "+sb1.length()); // length of a String Builder 
		System.out.println("After appending  outside the capacity "+sb1.capacity()); // capacity of a String Builder increases with accordance to the formula initial_capacity*2=2
		
		
	}

}
