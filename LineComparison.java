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
        double a1,b1,a2,b2;
        double lengthOfLine1, lengthOfLine2;
        
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
        
        // Ask to user enter the value
        System.out.println("Enter a1 coordinates:");
        //scan the user value
        a1= scan.nextInt();
        
        // Ask to user enter the value
        System.out.println("Enter b1 coordinates:");
        //scan the user value
        b1= scan.nextInt();
        
        // Ask to user enter the value
        System.out.println("Enter a2 coordinates:");
        a2= scan.nextInt();
        
        // Ask to user enter the value
        System.out.println("Enter b2 coordinates:");
        b2= scan.nextInt();
        scan.close();
        
        scan.close();
        
        lengthOfLine1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("The length of line is :"+lengthOfLine1);
        
        //calculating Distance2
        lengthOfLine2 = Math.sqrt((b2 - b1) * (b2 - b1) + (a2 - a1) * (a2 - a1));
        
     // printing the value of length of line is distance2
        System.out.println("The length of line-2 is :"+ lengthOfLine2);
        String myStr1 = Double.toString(lengthOfLine1);
        String myStr2 = Double.toString(lengthOfLine2);
        
        //comparing to MyStr1 to MyStr2
        System.out.println(myStr1.compareTo(myStr2));
        
        //if else condition
        if(myStr1.compareTo(myStr2) ==0){
            System.out.println("The line lengths are equal");
            }
        else //nested if else condition  
        	if(myStr1.compareTo(myStr2) >0) {
            System.out.println("The Line1 length is greater than Line2 length");
        }
        	else {
            System.out.println("The Line1 length is smaller than Line2 length");
        	}

	}

}
	

/*
 OUTPUT
 
Calculate the Length of Line
Enter X1 coordinates:
2
Enter Y1 coordinates:
5
Enter X2 coordinates:
3
Enter Y2 coordinates:
3
Enter a1 coordinates:
2
Enter b1 coordinates:
2
Enter a2 coordinates:
6
Enter b2 coordinates:
6
The length of line is :2.23606797749979
The length of line-2 is :5.656854249492381
-3
The Line1 length is smaller than Line2 length
 
 */

