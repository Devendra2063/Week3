import java.util.*;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
     public static void main (String[] args){
        Scanner a=new Scanner(System.in); 
        System.out.println("Enter the first Number");
        float first=a.nextFloat();
        
        System.out.println("Enter the second Number");
        float second=a.nextFloat();
        
        System.out.println("\tAirthematic :");
        System.out.println("Addition : "+ (first+second));
        System.out.println("Substraction :"+ (first-second));
        System.out.println("Muntiplication :"+ (first*second));
        System.out.println("Division :"+ (first/second));
        
        
        
        System.out.println("\n \tUnary");
        System.out.println("Post-increment : "+ (first++));
        System.out.println("After Post-increment : "+ (first));
        System.out.println("Post-increment : "+ (++first));
        System.out.println("After Post-increment : "+ (first));
        
        
        
        
    }
}