
/**
 * Write a description of class DefaultValueCheceker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValueCheceker
{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
public static void main(String[] args){
    DefaultValueCheceker df=new DefaultValueCheceker();
System.out.println("Default value of byte is "+df.a);
 System.out.println("Default value of short is "+df.b);
 System.out.println("Default value of int is "+df.c);
 System.out.println("Default value of long is "+df.d);
 System.out.println("Default value of float is "+df.e);
 System.out.println("Default value of double is "+df.f);
 System.out.println("Default value of char is "+df.g);
 System.out.println("Default value of String is "+df.h);
 //This wont work for local variables because they dont get local values
}
}