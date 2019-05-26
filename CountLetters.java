// ****************************************************************

// CountLetters.java

//

// Reads a words from the standard input and prints the number of

// occurrences of each letter in that word.

//

// ****************************************************************

import java.util.Scanner;

public class CountLetters

{

	public static void main(String[] args)

	{

		int[] counts = new int[26];

		Scanner scan = new Scanner(System.in);

		//get word from user

		System.out.print("Enter a single word (letters only, please): ");

		String word = scan.nextLine();

		//convert to all upper case

		word = word.toUpperCase();


		//count frequency of each letter in string

		for (int i=0; i < word.length(); i++)
		{
			try
			{

				int position = word.charAt(i)-'A';
				counts[position]++;
			}

			catch(ArrayIndexOutOfBoundsException ex) //ex == exception
			{
				String message =ex.getMessage();
				int firstSpace = message.indexOf(' ');
				int secondSpace = message.indexOf(' ', firstSpace + 1);
				String numberString = message.substring(firstSpace + 1, secondSpace);
				int number = Integer.parseInt(numberString);
				char ch = (char)(number + 'A');

				System.out.println("Not a letter: ' " + ch + " ' ");  // Not a letter: " "

			}  
		}

		//print frequencies

		System.out.println();

		for (int i=0; i < counts.length; i++)
		{

			if (counts [i] != 0)

				System.out.println((char)(i +'A') + ": " + counts[i]);
		}

	}

}