package Regular_Expressions;

import java.util.Scanner;

public class Practice_One {
    /*
        Challenge: Validate a product code
        Write a regex that matches a valid product code under these rules:
        It starts with 2 uppercase letters (A–Z).
        Followed by a dash (-).
        Then 3 to 5 digits.
        It may optionally end with another dash and one uppercase letter.
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Give me the pattern: ");
            String input = scanner.nextLine();

            String regEx = "[A-Z]{2}-[0-9]{3,5}(-[A-Z])?";

            if(input.isEmpty()){
                break;
            }

            System.out.print("Did they match: ");
            boolean isValid = input.matches(regEx);
            System.out.println(isValid);
        }
    }
}
