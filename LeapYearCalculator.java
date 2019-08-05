public class LeapYearCalculator{ //class
	
	public static void isLeapYear(){	//Method isLeapYear
	
	int year = 2016; //variable intenger to define the year
	
	if (year%4 == 0 && year%100 != 0){ 	// condition If: If the year is divisible by 4 and 100, is a Leap year and print it
		System.out.println (year + " Is Leap Year!"); 
	}else if (year%400 == 0){   //If the year is divisible 400, is also a Leap year and print it
		System.out.println (year + " Is a Leap year!");
	}else
		System.out.println (year + " Is not a leap year!"); //if the first and second conditions are false, print "is not a leap year"
	}
	
	public static void displayCalendar(){ //Method displayCalendar
	
	String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	// line above, variable array [] to define the months names
	
	int [] monthsday = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// line above, variable array [] to define the days of each month
	
	for (int m = 0; m <= 11; m++){ // Loop for, to print the months till december
		System.out.println (); // jumping line
		System.out.println (); // jumping line
		System.out.println ("   " + months[m] + " 2016"); // print the months using the array months [] that i define above
		System.out.println ("Su Mo Tu We Th Fr Sa"); // println just to print the week days
					
		for (int day = 1; day <= monthsday[m]; day++){ // Loop for, to define the days of each month using the array [] that i creat above
			if (day%7 == 0){ // condition to jump a line to each 7 days
			System.out.printf ("%2d %n", day); //printf to create space between each day and leave them aligned
			} else {
			System.out.printf ("%2d ", day); //printf to create space between each day and leave them aligned
			}	
		}		
	}
	}
}