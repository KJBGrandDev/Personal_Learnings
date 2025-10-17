package Codewars_Java;

import java.util.*;
public class RemoveFirstAndLastCharacter {
    public static void main(String[] args){
        remove("apostrophe");
    }

    public static String remove(String string){
        if(string.length() == 2){
            System.out.printf("%s: ''",string);
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < string.length() - 1;i++){
                sb.append(string.charAt(i));
            }
            System.out.printf("%s: %s\n",string,sb.toString());
            return sb.toString();
        }
    }
}

/*
* The most efficient approach
* return str.substring(1, str.length() -1);
*
* returns a substring starting from str.charAt[1] till before the last char str.charAt[str.length()-1]
* */
