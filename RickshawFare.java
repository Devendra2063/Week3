import java.util.*;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
         System.out.println("Fee per KM=Rs.100 and per minute=Rs.10");
          System.out.println("charge of night=Rs.1000");
        System.out.println("Enter your distance in KM");
       float Distance=s.nextFloat();
       System.out.println("Enter your time in minutes");
       float time=s.nextFloat();
       float charge=Distance*100+time*10;
       System.out.println("Your fare is Rs."+charge);
       System.out.println("Is the customer travelling in night : press 1 if Yes, 2 if No");
       int a=s.nextInt();
       float finalcharge=(a==1)?charge+1000:charge;
       System.out.println("Total fare is Rs." +finalcharge);
    }
}