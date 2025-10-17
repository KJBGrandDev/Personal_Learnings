package Regular_Expressions;

import java.util.Arrays;
import java.util.Scanner;

public class ValidatePasswordStrength {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String regExSymbols = "[@#$%^&+=!]";
        String regExUpper = "[A-Z]";
        String regExLower = "[a-z]";
        String regExNum = "[0-9]";

        String[] regEx = {regExSymbols,regExUpper,regExLower,regExNum};
        Boolean[] regExChecker = {false,false,false,false};

        System.out.print("Give me your password: ");
        String input = scanner.nextLine();

        for(int i = 0; i < input.length();i++){
            for(int j = 0; j < regEx.length; j++){
                if(String.valueOf(input.charAt(i)).matches(regEx[j])){
                    regExChecker[j] = true;
                }
            }
        }
        boolean isValid = Arrays.stream(regExChecker).allMatch(s -> s);

        if(isValid){
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}
