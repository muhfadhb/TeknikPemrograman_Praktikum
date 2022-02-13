package Datatypes;

import java.util.Scanner; //to use input
import java.lang.Math; //to use power function.


public class Datatypes {
   
    public void CheckDataType(long number) {
        System.out.printf("%d can be fitted in: \n", number);
        if (number >= -(Math.pow(2, 7)) && number <= (Math.pow(2, 7)) - 1) {
            System.out.println("*byte");
        }
        if (number >= -(Math.pow(2, 15)) && number <= (Math.pow(2, 15)) - 1) {
            System.out.println("*short");
        }
        if (number >= -(Math.pow(2, 31)) && number <= (Math.pow(2, 31)) - 1) {
            System.out.println("*integer");
        }
        System.out.println("*long");
    }

    public static void main(String args[]) {
        Datatypes obj = new Datatypes();
        long number;
        // create an object of Scanner
        try (Scanner input = new Scanner(System.in)){
            for (byte i = 0; i <= 5; i++) {
                try {
                    // take input from the user
                    number = input.nextLong();
                    obj.CheckDataType(number);
                } catch (Exception e) {
                    System.out.println("can't be fitted anywhere.");
                    input.nextLine();
                }
            }
        }
    }
}