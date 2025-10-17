package Regular_Expressions;

import java.util.Scanner;

public class ValidEmailAddress {
    /*
    *
        Instruction:
        Create a program that uses regex to check if the given string is a valid email address.
        The email must contain:

        characters before and after “@”

        a domain name ending with a proper extension (like .com, .org, etc.)
    *
    */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String regEx = "^[A-Za-z.-_+]+@[A-Za-z]+\\.(com|org)$";

        while(true){
            System.out.print("Give me your Email address: ");
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            if(input.matches(regEx)){
                System.out.println("Valid.");
            } else {
                System.out.println("NOT valid.");
            }
        }
    }
}
