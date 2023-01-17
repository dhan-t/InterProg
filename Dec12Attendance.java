import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static ArrayList<String> names = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//NUMBER 1

		System.out.println("Please enter your name: ");
		String Name = sc.next();

		System.out.println("Merry Christmas, " + Name + "!");

		int a = 0;
		int b = 0;

		while (a <= 13) {
			System.out.print(" ");
			while (b < a)
				System.out.println("*");
			a++;
		}

//NUMBER 2

		names.add("Richard");
		names.add("Ashton");
		names.add("Hailey");
		names.add("Yurina");
		names.add("Judith");

		for (int c = 0; c < names.size(); c++) {
			System.out.print("(" + names.get(c) + ")" + ", ");
		}
		System.out.println(" ");

		System.out.println("Enter position to be removed: ");
		int removed = sc.nextInt();

		remover(removed);

	}

//METHOD FOR B (REMOVES THE INDICATED NUMBER)
	static void remover(int removed) {
		for (int d = 0; d < names.size(); d++) {
			switch (removed) {
			case 0:
				System.out.println("Richard Deleted.");
				break;
			case 1:
				System.out.println("Ashton Deleted.");
				break;
			case 2:
				System.out.println("Hailey Deleted.");
				break;
			case 3:
				System.out.println("Yurina Deleted.");
				break;
			case 4:
				System.out.println("Judith Deleted.");
				break;
			default:
				System.out.println("Enter a valid number.");
				break;
			}
		}
	}
//NUMBER 3
	System.out.println("Please enter a word: ");
	String word = sc.next();

	String reverseString = StringUtils.reverseDelimited( StringUtils.reverse(sentence), ' ' );
	if(word==word){
		System.out.println("Your word is a Palindrome");
	}else{
			System.out.println("Your word is not a Palindrome");
		}
	}
}

//NUMBER 4 CLASSES




/*
 * PROBLEMS IN THESE NUMBERS
 * 
 * A> Printing out the xmas tree
 * 
 * B> Algo for re-running the code after entering a position in the arraylist
 * 
 * C> Create a way to reverse the order of the letters of the word.
 * 
 * D> Incomplete
 
 */
