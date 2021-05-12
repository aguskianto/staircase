package com.staircase;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
			
			// 1. get input
	        input = scanner.nextLine();
	        
	        // 2. check if exit command
	        if (input.equals("exit")) {
	        	break;
	        }
	        
	        // 3. check if input is not a number
	        Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
	        Matcher m = p.matcher(input);
	        
	        if (m.find()) {
	        	System.out.println("Error: ");
				System.out.println("Argument is not a number");
				System.out.println("");
	        } else {
	        	// 4. execute if input is number between 1 - 100
	        	Long max_height = convertStringToLong(input);
		        
		        if (max_height > 0 && max_height <= 100) {
		        	int max_height_value = max_height.intValue();
		        	
		        	IntStream serials = IntStream.range(1, max_height_value + 1);
						
					System.out.println("Output: ");
						
					serials
					.mapToObj(i -> new String(new char[max_height_value - i]).replace('\0', ' ') + new String(new char[i]).replace('\0', '#'))
					.forEach(System.out::println);
						
					System.out.println("");
		        } else {
		        	System.out.println("Error: ");
					System.out.println("Argument must be between 1 to 100");
					System.out.println("");
		        }
	        }
	    } while(!input.equals("exit"));
	}

	private static Long convertStringToLong(String input) {
	    try {
	    	Long result = Long.parseLong(input);
	        return result;
	    } catch(Error e) {
	        return null;
	    }
	}
}
