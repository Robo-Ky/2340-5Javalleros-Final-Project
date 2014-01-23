package edu.gatech.oad.antlab.person;
import java.util.Random;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Ruobin Ling
 * @version 1.0
 */
public class Person2 {
    /** Holds the persons real name */
    private String name = "Ruobin Ling";
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person2(String pname) {
        name = pname;
    }
    /**
     * This method should take the string
     * input and return its characters in
     * random order.
     * given "gtg123b" it should return
     * something like "g3tb1g2".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        String output = "";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(input);
        while (sb.length()>0){
            int random = rand.nextInt(sb.length());
            output += sb.charAt(random);
            sb.deleteCharAt(random);
        }
        return output;
    }
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     *         object
     */
    public String toString(String input) {
        return name + calc(input);
    }
}
