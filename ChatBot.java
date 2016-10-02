// import Scanner class
import java.util.Scanner;

/**
 * This is a ChatBox program, that talks with the user
 * @author Darlene Fung
 * @version 1.0
*/

public class ChatBot

{ 
	/** 
	 * This is the main method that the java interpreter calls
	 * @param args (this is a command line argument)
	*/
	public static void main(String[] args)
	{
		// construct/create a Scanner object, kind of like raw_input
		
		
		Scanner kb = new Scanner(System.in); // getting information from keyboard
		System.out.print("Please enter your name: ");
		String name = kb.nextLine(); // stores user input (nextLine puts "cursor: on the next line)
		String loop = "yes";
		
		while (!loop.equals("bye") && !loop.equals("Bye"))
		{
		
			System.out.print("Hi " + name + "! How are you doing today? ");
			String input = kb.nextLine(); // already declared as String
			System.out.println("Your answer is " + input); 
			System.out.print("What is your favorite color? ");
			String color = kb.nextLine();
			System.out.println(color + " is you favorite color!");
			System.out.print("How old are you? Please enter your answer in number form: ");
			int age = kb.nextInt();
			if (age > 30)
			{
				System.out.println(name + ", you are old!");
			}
			else
			{
				System.out.println("nice");
			}
			System.out.print("How tall are you? Please enter your height in feet: ");
			double height = kb.nextDouble(); 
			if (height > 6.0)
			{
				System.out.println(name + ", you are tall! ");
			}
			else if (height > 5.0)
			{
				System.out.println(name + ", you are a good height. ");
			}
			else 
			{
				System.out.println(name + ", you are short!");
			}
			// to get rid of the new line char from the buffer
			kb.nextLine();
			System.out.print("Would you like to keep chatting? If not, enter 'bye' " );
			loop = kb.nextLine();
		}
		
		if (loop.equals("bye")) or (loop
		{
		System.out.println("Bye! Have a nice day!");
		System.exit(0);
		}
		if (loop.equals("Bye")) or (loop
		{
		System.out.println("Bye! Have a nice day!");
		System.exit(0);
		}
	

	}
	

}