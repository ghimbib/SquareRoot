//Need below to create dialog boxes
import javax.swing.JOptionPane;
//Need below to do math operations
import java.lang.Math;
//Start of Sqrt function 
public class Sqrt {
    //Main function
    public static void main(String[] args) {
    //Get input from user through this dialog
        String input1string =
                JOptionPane.showInputDialog(null, 
                "Enter your number", 
                "Taking the square root of a number!", 
                JOptionPane.QUESTION_MESSAGE);

    Double input1 = Double.parseDouble(input1string);
    //Math Operation - stored into result 1 variable
    Double result1 = Math.sqrt(input1);
    //Convert to whole number 
    int round1= (int)Math.round(result1);
    //Print result into system
                JOptionPane.showMessageDialog(null, 
                "The square root of " + input1 + " is " + round1, 
                "Taking the square root of a number!", 
                JOptionPane.INFORMATION_MESSAGE);      
    }
//trying again to see if dev branch will push
Double input2

}

