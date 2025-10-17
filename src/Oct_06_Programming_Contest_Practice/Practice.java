package Oct_06_Programming_Contest_Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args){
        System.out.println(reverseString("apostrophe"));;
        System.out.println(countVowels("apostrophe"));
        System.out.println(consonantCount("apostrophe"));
        System.out.println(countSpaces("Hello Earth and Mars"));
        System.out.println(reverseStringTwo("apostrophe"));
        System.out.println(countVowelsTwo("apostrophe"));
        System.out.println(consonantCountTwo("apostrophe"));
        System.out.println(countSpacesTwo("Hello Earth and Mars"));
    }

    public static String evenOrOdd(int num){
        if(num % 2 == 0){
            return "even";
        }
        return "odd";
    }

    public static void simpleCalculator(int a,int b){
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = 0;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if(b != 0){
            quotient = a / b;
            System.out.println("Quotient: " + quotient);
        } else{
            System.out.println("Quotient: not divisible by 0!");
        }
    }

    public static Character gradeLetter(int num){
        if(num >= 90 && num <= 100){
            return 'A';
        } else if (num >= 80 && num <= 89){
            return 'B';
        } else if (num >= 70 && num <= 79){
            return 'C';
        } else if (num >= 60 && num <= 69){
            return 'D';
        } else if (num >= 0 && num <= 60){
            return 'F';
        }

        return null;
    }
    //Memorize
    public static String reverseString(String input){
        char[] word = input.toCharArray();
        ArrayList<Character> reverseWord = new ArrayList<>();
        for(int i = word.length - 1; i >= 0; i--){
            reverseWord.add(word[i]);
        }

        StringBuilder convertChar = new StringBuilder();
        for(char i: reverseWord){
            convertChar.append(i);
        }
        return convertChar.toString();
    }

    public static String reverseStringTwo(String word){
        ArrayList<Character> reverseWord = new ArrayList<>();

        for(int i = word.length() - 1; i >= 0; i--){
            reverseWord.add(word.charAt(i));
        }

        StringBuilder builder = new StringBuilder();
        for(char i: reverseWord){
            builder.append(i);
        }

        return builder.toString();
    }

    public static int countVowels(String input){
        String vowel = "^[aeiou]+$";
        int vowelCount = 0;
        for(int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);
            if(String.valueOf(letter).matches(vowel)){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int countVowelsTwo(String word){
        String vowels = "[aeiou]";
        int vowelCount = 0;
        for(int i = 0; i < word.length(); i++){
            if(String.valueOf(word.charAt(i)).matches(vowels)){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int consonantCount(String input){
        String noSpace = input.trim();
        String vowel = "[aeiou]";
        int consonantCount = 0;
        for(int i = 0; i < input.length();i++){
            if(!String.valueOf(noSpace.charAt(i)).matches(vowel)){
                consonantCount++;
            }
        }
        return consonantCount;
    }

    public static int consonantCountTwo(String word){
        String noSpace = word.trim();
        String vowels = "[aeiou]";
        int consonantCount = 0;
        for(int i = 0; i < noSpace.length(); i++){
            if(!String.valueOf(noSpace.charAt(i)).matches(vowels)){
                consonantCount++;
            }
        }
        return consonantCount;
    }

    public static long countSpaces(String word){
        long spaceCount = word.chars().filter(c -> c == ' ').count();

        return spaceCount;
    }

    public static long countSpacesTwo(String word){
        long countSpaces = word.chars().filter(c -> c == ' ').count();

        return countSpaces;
    }
}
