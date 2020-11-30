//Need below to create dialog boxes
import java.util.Scanner;
//Need below to do math operations
//Start of Sqrt function 
public class Sqrt {
    //Main function
    public static void main(String[] args) {
    //Get input from user through this dialog
    Scanner scan = new Scanner(System.in);   
    System.out.println("Please enter the positive integer to take the square root of.");
    double userinput = scan.nextDouble(); 
    //need something to ensure that number is positive and an integer 
    do {

        System.out.print("Please enter a positive integer number: "); 
        if (scan.hasNextInt()) {
            userinput = scan.nextInt();

        }
        else {
            System.out.println("I need an int, please try again.");
            scan.nextLine(); 
        }
    } while (userinput <=0);
        double num=userinput; 
        double temp; 
        double sr=num/2; 
       
        //Algo for finding square root
        do{
            temp=sr; 
            sr=(temp+(num/temp))/2;
        }
        while ((temp-sr)!=0); 
        
        //Converting to whole number
        double add = sr+0.5; 
        int result = (int)add;

        //System output
        System.out.println("The Square rooot of " + userinput +" is " + result + " rounded to the nearest whole number.");   
        scan.close(); 
        } 

}


