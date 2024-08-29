package stringProgram;

public class Paranthesis {
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
