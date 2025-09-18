
import java.util.Scanner;

public class MovieDriver {

	static Scanner keyboard = new Scanner(System.in);

	
	public static void aLoop() {
		Movie movie = new Movie();
		System.out.println("Enter the title of a movie:");
		String title = keyboard.nextLine();
		movie.setTitle(title);
		System.out.println("Enter the movie's rating");
		String rating = keyboard.nextLine();
		movie.setRating(rating);
		System.out.println("Enter the number of tickets sold at a theater.");
		int ticketSold = keyboard.nextInt();
		movie.setSoldTickets(ticketSold); 
		keyboard.nextLine(); 
		System.out.println(movie.toString());
	
	}
	

	public static void main(String[] args) {
		String toContinue;
		
        do{
        	MovieDriver.aLoop();
    		System.out.println("Do you want to enter another? (y or n)");
    		toContinue = keyboard.nextLine();
        } while(toContinue.equalsIgnoreCase("y")); 
        if(toContinue.equalsIgnoreCase("n"))
        {
        	System.out.println("Goodbye");
        }
 
		keyboard.close();
	}

}
