import java.util.Scanner;

public class Attendance {
    static int[] Array = { 15, 30, 25, 19, 30, 40 };

    public static void main(String[] args) {
// Prints the showArray method.
        showArray();
        Scanner sc = new Scanner(System.in);
// Takes input from user for the numbers to be removed.
        while (!checkArray()) {
            System.out.println("Enter numbers to be removed: \n");
            int num = sc.nextInt();
// Calls in the different methods.
            findelement(num);
            present(num);
            showArray();
        }
        System.out.println("Array has been emptied.");
        sc.close();
    }

// METHODS
// Lists the elements of the array
    static void showArray() {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > 0) {
                System.out.print(" (" + Array[i] + ")");
            }
        }
        System.out.println(" ");
    }

// Checks if the array is empty.
    static void findelement(int num) {
        for (int x = 0; x < Array.length; x++) {
            if (num == Array[x]) {
                Array[x] = 0;
            }
        }
    }

// Checks if the number entered is present in the array.
    static boolean checkArray() {
        int checkArray = 0;
        for (int j = 0; j < Array.length; j++) {
            if (Array[j] != 0) {
                continue;
            } else {
                checkArray++;
            }
        }
        if (checkArray == 6) {
            return true;
        } else {
            return false;
        }
    }

// Checks if the number is present IF not, it asks the user to re-enter.
    static void present(int num) {
        if (!(num == 15 || num == 30 || num == 25 || num == 19 || num == 30 || num == 40)) {
            System.out.println("Error! Please enter a valid number.\n");
        }
    }
}


// We were tasked to remove elements in an array
