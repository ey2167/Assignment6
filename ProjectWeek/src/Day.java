/*Elohe Yonas
 * Assignment 6
 * 11-19-14
 */


import java.util.Scanner;
public class Day {
		public static void main (String[]args){
			System.out.println("what day of the week is it?(0-6, sun-sat)");
		Scanner keyboard = new Scanner(System.in);
		//type in a day of the week
		int x = keyboard.nextInt(); 
		// X is the placeholder for the current day
		
		
		// have what day that is chosen be represented by integers 0-6
	if ( x == 0){
		System.out.println("It is sunday");
	}
	if (x == 1) {
		System.out.println("It is monday");
	}
	if (x == 2){
		System.out.println("It is tuesday");
	}
	if (x == 3) {
		System.out.println("It is Wednesday");
	}
	if (x == 4) {
		System.out.println("It is Thursday");
	}
	if (x == 5){
		System.out.println("It is Friday");
	}
	if (x == 6){
		System.out.println("It is Saturday");
	}
	//prompt user for how many days they wish to go
	// the x value will hold the day that was listed previously while y value will place the amount of days prompted by the user
	// the z value will have set the y value's remainder by 7 so that the range of days still there
	
	System.out.println ("Fast forward/backward how many days?");
	int y = x + keyboard.nextInt();
	int z = y % 7 ;
	
	System.out.println("Int x= " + x + " int y= " + y + " int z= " + z);
	//now the z integer will account for the 7 days of the week through its remainder,
	if ( z == 0){
		System.out.println("It is sunday");
	}else if (z == 1) {
		System.out.println("It is monday");
	}else if (z == 2){
		System.out.println("It is tuesday");
	}else if (z == 3) {
		System.out.println("It is Wednesday");
	}else if (z == 4) {
		System.out.println("It is Thursday");
	}else if (z == 5){
		System.out.println("It is Friday");
	}else if (z == 6){
		System.out.println("It is Saturday");
	}else{
		System.out.println("Something went wrong");
	}
	
	
		}				
}	

