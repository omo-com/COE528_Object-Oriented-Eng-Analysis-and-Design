/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author
 * Oliver Mo
 * 500844905
 * COE 528 - Lab 2
 */
public class Palindrome {

    /**
     * Effects: If string a is null, returns false, else, runs the for loop for the string's length/2. If a is not palindrome, return false.
     *          Else, string a passes all test, returning true.
     */
    public static boolean isPalindrome(String a) {
        if(a.equals(null))
            {
                return false;
            }
        for(int i =0; i<(a.length())/2;i++)
        {
            if(!a.substring(i,i+1).equalsIgnoreCase(a.substring(a.length()-i-1,a.length()-i)))
            {
                return false;
            }
        }
    
        return true;
    }
        public static void main(String[] args) {

        if(args.length == 1) {

            if (args[0].equals("1"))

                System.out.println(isPalindrome(null));

            else if (args[0].equals("2"))

                System.out.println(isPalindrome(""));

            else if (args[0].equals("3"))

                System.out.println(isPalindrome("deed"));

            else if (args[0].equals("4"))

                System.out.println(isPalindrome("abcd"));

        }

    }
    
}
