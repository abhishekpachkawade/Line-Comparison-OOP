package com.bl.linecomparison;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		
		//creating object of LengthOfLine class
		LengthOfLine lengthOfLine = new LengthOfLine();
		
		//calling method 
		lengthOfLine.LengthOfLine();
		
	}

}

class LengthOfLine{
	
	public void LengthOfLine(){
	Scanner scan = new Scanner(System.in);
		
		//local variable 
        double x1,x2,y1,y2;
        double lengthOfLine;
        
        //Print statement 
        System.out.println("Calculate the Length of Line");
        
        // ask to user value
        System.out.println("Enter X1 coordinates:");
        
        // store the user value
        x1= scan.nextInt();
        
        // ask to user value
        System.out.println("Enter Y1 coordinates:");
        
        // store the user value        
        y1= scan.nextInt();
        
        
        System.out.println("Enter X2 coordinates:");
        
        // store the user value
        x2= scan.nextInt();
        
        // store to user value
        System.out.println("Enter Y2 coordinates:");
        
        // store the user value
        y2= scan.nextInt();
        scan.close();
        
        lengthOfLine = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("The length of line is :"+lengthOfLine);

	}

}
	

/*
 OUTPUT
 
Calculate the Length of Line
Enter X1 coordinates:
4
Enter Y1 coordinates:
2
Enter X2 coordinates:
6
Enter Y2 coordinates:
1
The length of line is :2.23606797749979

 
 */

