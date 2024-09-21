/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: This program asks the player to guess whichever color the program
 itself chose 3 times.
 * Due: 09/20/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: David Icaza
*/
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class ESPGame 
{
	public static void main (String [] args) throws IOException
	{
		Scanner stdin = new Scanner(System.in);
		Random rNum = new Random();
		
		//Assigned colors for each color(C) number
		final String C1 = "black";
		final String C2 = "white";
		final String C3 = "gray";
		final String C4 = "silver";
		final String C5 = "maroon";
		final String C6 = "red";
		final String C7 = "purple";
		final String C8 = "fuchsia";
		final String C9 = "green";
		final String C10 = "lime";
		final String C11 = "olive";
		final String C12 = "yellow";
		final String C13 = "navy";
		final String C14 = "blue";
		final String C15 = "teal";
		final String C16 = "aqua";
		
		String filename;
		int number;
		String input;
		int correctGuess = 0;
		String newColor = "";
		
		System.out.println("CMSC203 Assignment1 : Test your ESP skills!");
		
		do
		{
			System.out.print("Enter the filename: ");
		
			filename = stdin.nextLine();
			//Here the file colors.txt is opened so we can start
			//the game
			if(!(filename.equalsIgnoreCase("colors.txt")))
			{
				System.out.println("You have entered the wrong file, "
					+ "please try again.");
			}
		} while(!(filename.equalsIgnoreCase("colors.txt")));
		
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		System.out.println("There are sixteen colors from a file: ");
		
		//This loop helps show all the colors that are available in the colors.txt file
		while(inputFile.hasNext())
		{
			String line = inputFile.nextLine();
			System.out.println(line);
		}
		inputFile.close();
		
		for(int i = 1; i < 4; i++)
		{
			System.out.println();
			System.out.println("Round " + i);
			System.out.println();
			
			System.out.println("I am thinking of a color.");
			System.out.println("Is it one of list of colors above?");
			
			//This do while loop will have the user enter their guess
			//And check if their choice is in the list of colors or not
			do
			{
				System.out.println("Enter your guess:");
				input = stdin.nextLine();
				if (!(input.equalsIgnoreCase(C1) || input.equalsIgnoreCase(C2) || 
						input.equalsIgnoreCase(C3) || input.equalsIgnoreCase(C4) ||
						input.equalsIgnoreCase(C5) || input.equalsIgnoreCase(C6) || 
						input.equalsIgnoreCase(C7) || input.equalsIgnoreCase(C8) ||
						input.equalsIgnoreCase(C9) || input.equalsIgnoreCase(C10) || 
						input.equalsIgnoreCase(C11) || input.equalsIgnoreCase(C12) ||
						input.equalsIgnoreCase(C13) || input.equalsIgnoreCase(C14) || 
						input.equalsIgnoreCase(C15) || input.equalsIgnoreCase(C16)))
				{
					System.out.println("This color is not an option. \nPlease use "
							+ "the list for your choice.");
				}
			}while(!(input.equalsIgnoreCase(C1) || input.equalsIgnoreCase(C2) || 
					input.equalsIgnoreCase(C3) || input.equalsIgnoreCase(C4) ||
					input.equalsIgnoreCase(C5) || input.equalsIgnoreCase(C6) || 
					input.equalsIgnoreCase(C7) || input.equalsIgnoreCase(C8) ||
					input.equalsIgnoreCase(C9) || input.equalsIgnoreCase(C10) || 
					input.equalsIgnoreCase(C11) || input.equalsIgnoreCase(C12) ||
					input.equalsIgnoreCase(C13) || input.equalsIgnoreCase(C14) || 
					input.equalsIgnoreCase(C15) || input.equalsIgnoreCase(C16)));
			
			number = rNum.nextInt(16);
			
			Scanner inputFile2 = new Scanner(file);
			for (int n = 0; n <= number; n++)
			{
				String color = inputFile2.nextLine(); 
				newColor = "";
					
			
				if(n == number)
				{
					if(n >= 10 || n == 9)
					{
						newColor += Character.toUpperCase(color.charAt(3));
						for(int o = 4; o < color.length(); o++)
						{
							newColor += color.charAt(o);
						}
					}
					else if(n <10)
					{
						newColor += Character.toUpperCase(color.charAt(2));
						for(int o = 3; o < color.length(); o++)
						{
							newColor += color.charAt(o);
						}
					}
					System.out.println("I was thinking of " + newColor + ".");
				}
				if (input.equalsIgnoreCase(newColor))
				{
					correctGuess++;
				}
			}
		}
		System.out.println("Game Over");
		System.out.println("\n");
		System.out.println("You guessed " + correctGuess + " out of "
				+ "3 colors correctly.");
		
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		System.out.print("Describe yourself: ");
		String description = stdin.nextLine();
		System.out.println("Due Date: ");
		String dueDate = stdin.nextLine();
		
		System.out.println("User Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Date: " + dueDate);
		
		
		
		
	}
}

