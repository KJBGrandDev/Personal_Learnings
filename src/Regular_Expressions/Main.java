package Regular_Expressions;

public class Main {
    public static void main(String[] args){

        String numWordOne = "12345678";

        //1 followed by 7 numbers which is between 0 and 9;
        String regExOne = "1[0-9]{7}";

        if(numWordOne.matches(regExOne)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String numWordTwo = "0000";

        //Checks if string is either 0000 or 1111
        String regExTwo = "0000|1111";

        if(numWordTwo.matches(regExTwo)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String numWordThree = "cars";

        //Checks both if either the string is car or cars
        String regExThree = "car(|s)";
        // Alternative:
        // String regExThree = "car(s)?";

        if(numWordThree.matches(regExThree)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        String wordFour = "trololololo";

        // Checks if the word is followed by the string lo by zero to infinite times.
        String regExFour = "trolo(lo)*";

        if(wordFour.matches(regExFour)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String ip = "231.254.24.248";
        String[] filteredIP = ip.split("\\.");

        String regExFive = "([0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

        boolean isValid = true;

        for(String i: filteredIP){
            if(i.matches(regExFive)){
                continue;
            } else {
                isValid = false;
                break;
            }
        }

        if(isValid){
            System.out.println(ip + " : is a valid IP address" );
        } else {
            System.out.println(ip + " : is NOT a valid IP address" );
        }
    }
}
