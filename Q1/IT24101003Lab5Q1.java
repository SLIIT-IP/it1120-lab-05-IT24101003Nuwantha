import java.util.Scanner;


public class IT24101003Lab5Q1 {

public static void main(String []args){
	
	int min,max;
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the fisrt integer: ");
	int num1 = scanner.nextInt();
	System.out.print("Enter the second integer: ");
	int num2 = scanner.nextInt();
	System.out.print("Enter the third integer: ");
	int num3 = scanner.nextInt();
	
	if(num1 > num2){
		max = num1;
		min = num2;
	}else{
	 max = num2;	
	 min = num1;
	}
	
	if(num3 > max){
		max = num3;
	}else if(num3 < min){
	 min = num3;
	}
	
	System.out.println("User enterd numbers are : "+ num1 + " "+ num2+" "+num3);
	System.out.println("The Smallest number is: " + min);
	System.out.println("The Largest number is: " + max);
	
	
	
	
	
}



}