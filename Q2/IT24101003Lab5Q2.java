import java.util.Scanner;


public class IT24101003Lab5Q2 {

public static void main(String []args){
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number of new numbers introduced: ");
	int introducedMembers = scanner.nextInt();
	if(introducedMembers <0){
		System.out.print("Input must be a number 0 or greater");
		System.exit(1);
	}
	
	switch(introducedMembers){
		case 0:
			System.out.print("Price is a : No Price");
			break;
		case 1:
			System.out.print("Price is a : Pen");
			break;
		case 2:
			System.out.print("Price is a : Umbrella");
			break;		
		case 3:
			System.out.print("Price is a : Bag");
			break;
		case 4:
			System.out.print("Price is a : Travelling Chair");
			break;	
		default:
			System.out.print("Price is a : Headphone ");
	}
	
	
}



}