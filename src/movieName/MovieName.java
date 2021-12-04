package movieName;

import java.util.Scanner;

public class MovieName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[EASY] 3. Get a number as input from user and print the name of the movie.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Movie Number: ");

		int movieName = input.nextInt();
		input.close();

		switch(movieName) {
		case 1:
			System.out.println("Harry Potter and the philosopher's Stone");
			break;
		case 2:
			System.out.println("Harry Potter and the Chamber of Secrets");
			break;
		case 3:
			System.out.println("Harry Potter and the Prisoner of Azkaban");
			break;
		case 4:
			System.out.println("Harry Potter and the Goblet of Fire");
			break;
		case 5:
			System.out.println("Harry Potter and the Order of the Phoenix");
			break;
		case 6:
			System.out.println("Harry Potter and the Half-Blood Prince");
			break;
		case 7:
			System.out.println("Harry Potter and the Deathly Hallows – Part 1");
			break;
		case 8:
			System.out.println("Harry Potter and the Deathly Hallows – Part 2");
			break;
		default:
			System.out.println("Oh-No!! You DO NOT have a movie number!!");
			
			
		}//End of switch 

	}//End of main

}//End of class
