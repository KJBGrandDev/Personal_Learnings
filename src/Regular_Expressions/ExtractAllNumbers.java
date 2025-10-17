package Regular_Expressions;

import java.util.Scanner;

public class ExtractAllNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a sentence: ");
        String input = scanner.nextLine();

        String[] dividedStr = input.split(" ");
        String regEx = "^[0-9]+$";

        for(String i: dividedStr){
            if(i.matches(regEx)){
                System.out.println(i);
            } else {
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < i.length(); j++){
                    if(String.valueOf(i.charAt(j)).matches(regEx)){
                        sb.append(i.charAt(j));
                    }
                }

                if(!sb.isEmpty()){
                    System.out.println(sb.toString());
                }
            }
        }
    }
}
