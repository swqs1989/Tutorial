/**
 * @author Youqiao Ma
 * @version 1.0.0 3/3/2017
 *
 */
public class Main {
    /**
     * This is the main function which JVM will load and execute.
     * @param args takes arguments as input.
     */
    public static void main(String[] args) {
        practiseString();
    }

    /**
     * This is a practise of String
     */
    public static void practiseString(){

        String str_a = "ABC"; //declare a variable to store string
        String str_b = str_a; //declare another variable to store string
        str_a = "BCD";

        if(str_a == "ABC")
            System.out.println("They are equal.");
        else
            System.out.println("They are not equal.");
    }
}
