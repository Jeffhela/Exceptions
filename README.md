# Exceptions
Java
File CountLetters.java contains a program that reads a word from the user and prints the number of occurrences of each letter in the word. Save it to your directory and study it, then compile and run it to see how it works. In reading the code, note that the word is converted to all upper case first, then each letter is translated to a number in the range 0..25 (by subtracting ‘A’) for use as an index. No test is done to ensure that the characters are in fact letters.

    Run CountLetters and enter a phrase, that is, more than one word with spaces or other punctuation in between. It should throw an ArrayIndexOutOfBoundsException, because a non-letter will generate an index that is not between 0 and 25. It might be desirable to allow non-letter characters, but not count them. Of course, you could explicitly test the value of the character to see if it is between ‘A’ and ‘Z’. However, an alternative is to go ahead and use the translated character as an index, and catch an ArrayIndexOutOfBoundsException if it occurs. Since you want don’t want to do anything when a nonletter occurs, the handler will be empty. Modify this method to do this as follows:

    Put the body of the first for loop in a try.
    Add a catch that catches the exception, but don’t do anything with it.

Compile and run your program.

    Now modify the body of the catch so that it prints a useful message (e.g., “Not a letter”) followed by the exception. Compile and run the program. Although it’s useful to print the exception for debugging, when you’re trying to smoothly handle a condition that you don’t consider erroneous you often don’t want to. In your print statement, replace the exception with the character that created the out of bounds index. Run the program again; much nicer!
