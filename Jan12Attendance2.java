import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class attendance1 {

//Makes the names list in ArrayList form    
    static ArrayList<String> names = new ArrayList<String>() {
        {
            add("Juwan");
            add("Limbo");
            add("Al Joseph");
            add("Laure");
        }};

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//Scrapped idea. Adds the index of the name and attaches it to the name itself        
        int Juwan = 0;
        int Limbo = 1;
        int AlJoseph = 2;
        int Laure = 3;

//Initialization of found to false, to be used later on if condition is met.        
        boolean found = false;

//Prompts user to input a name and check if it is present in the text file.        
        System.out.println("See if name is present: ");
        String toFind = in.next();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Testing.txt"));

//Prints out the ArrayList of names in the text file.            
            writer.write("These are the names available in the file" + "\n");
            for (int i = 0; i < names.size(); i++) {
                writer.write("(" + names.get(i) + "), ");
            }
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

//Checks if the ArrayList contains the user inputted name, attached to the variable "toFind."
//Sets the boolean found to true if condition is met, otherwise it remains.
        if (names.contains(toFind)) {
            found = true;
        }

//If found is changed to true, second part runs.        
        if (found) {

//Prints out the toFind variable and removes the same name from the ArrayList.            
            System.out.println('"' + toFind + '"' + " is found \n");
            names.remove(toFind);

//Adds a new name to the ArrayList and attaches it to the variable "replace."            
            System.out.println("Enter a new name to replace it with: ");
            String replace = in.next();
            names.add(replace);

//Prints out the updated ArrayList with the use for loop.            
            System.out.println("This is the new list of names: ");
            for (int i = 0; i < names.size(); i++) {
                System.out.print("(" + names.get(i) + "), ");
            }

//Prints out "Invalid text" if the user input does not match values in the ArrayList.            
        } else {
            System.out.println("Invalid text");
        }
    }
}

//Unfinished code. Needs to be replaced at the original index of the to be replaced name.
