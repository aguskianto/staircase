package com.staircase;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class main {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		String input = "";
		
	    do{
	    	System.out.println("###################################################");
			System.out.println("                Staircase Program                  ");
			System.out.println("###################################################");
			System.out.println("");
			
	    	System.out.println("Please input a number between 1 to 100 to continue.");
			System.out.println("To quit the program type exit or press Ctrl + C");
			System.out.println("");
			
	        input = scanner.nextLine();
	        
	        try {
	        	int max_height = Integer.parseInt(input);
		        
		        if (max_height > 0 && max_height <= 100) {
					IntStream serials = IntStream.range(1, max_height + 1);
					
					System.out.println("Output: ");
					
					serials
					.mapToObj(i -> new String(new char[max_height - i]).replace('\0', ' ') + new String(new char[i]).replace('\0', '#'))
					.forEach(System.out::println);
					
					System.out.println("");
				} else {
					System.out.println("Error: ");
					System.out.println("Argument must be between 1 to 100");
					System.out.println("");
				}
	        } catch (Error err) {
	        	System.out.println("Error: ");
	        	System.out.println("Input is not a number");
	        	System.out.println("");
	        }
	    } while(!input.equals("exit"));
	}

}
