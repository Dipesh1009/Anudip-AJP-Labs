/**
 * TASK: To create a program to find the closing paranthesis of the given paranthesis
 * in the given string. The paranthesis position is givne with the String value.
 * 
 */

package stringProgram;

/**
 * Paranthesis class is the main class which contains main() and 
 * findClosingParanthesis(String,int) static methods. 
 */
public class Paranthesis {

    /**
     * findClosingParanthesis(String,int) method checks if the given position has
     * opening paranthesis '('.
     * 
     * If '(' is not found on given index, the function terminates returning -1.
     * 
     * After this gets checked, function sets the nestParanthesis(int)
     * and closeIndex(int) as 0.
     * 
     * In for loop, it traverse through the string, checking '(' and ')'.
     * 
     * If loop finds '(', it increments value of nestParanthesis(int) by 1.
     * 
     * If loop finds ')', it checks value of nestParanthesis(int)
     *      If 0, 
     *          sets closeIndex(int) as the value of currentIndex(int) = for loop index
     *          returns the closeIndex(int) and terminates the function.
     *      else,
     *          decrements the value of nestParanthesis(int) by 1. 
     * 
     * If loop does not find the corresponding closing bracket ')', 
     *       loop returns -2 indicating "No closing bracket present for concerned opening bracket"
     * 
     * @param str       Contains the String sentence which is to be checked for closing bracket
     * @param opening   Contains the index of the concerned opening bracket
     * @return          integer value, -1 if the given index (opening(ing)) doesn't have any opening bracket
     * @return          -2 if the loop doesn't find concerned closing bracket
     * @return          (int)closeIndex if loop finds the index of concerned closing bracket
     */
    static int findClosingParanthesis(String str, int opening) {
        if (str.charAt(opening) != '(') {
            return -1;
        }
        int closeIndex = 0;
        int nestParanthesis = 0;
        
        for ( int i = opening + 1; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                nestParanthesis++;
            }
            
            if (str.charAt(i) == ')') {
                if (nestParanthesis == 0) {
                    closeIndex = i;
                    return closeIndex;
                }

                else {
                    nestParanthesis--;
                }
            }
        }
        
        return -2;
    }  

    /**
     * This is main() function
     * Calls the findClosingParanthesis(String,int) and stores the return value.
     * 
     * Checks the returned value and prints the corresponding message.
     * @param args
     */
    public static void main(String[] args) {
        String str = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this 1234567890(and this))) they get quite confusing.";

        int position = findClosingParanthesis(str, 10);
        
        if (position == -1 ) {
            System.out.println("Given position is not of opening paranthesis");
        }
        else if (position == -2) {
            System.out.println("Given String has no corresponding closing paranthesis");
        }
        else {
            System.out.println("Position of closing paranthesis: " + position);
        }
    
    }
}

// End Of Program