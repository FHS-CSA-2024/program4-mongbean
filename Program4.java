//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("a ");
        int a =  scan.nextInt();
        System.out.println("b ");
        int b =  scan.nextInt();
        System.out.println("c ");
        int c =  scan.nextInt();
        System.out.println("d ");
        int d =  scan.nextInt();
        int sum = a+b+c+d;
        double average = (double)sum/4;
        System.out.println("sum is " + sum + ".");
        System.out.println("average is "+average+".");
    }
}

//Paste console output below:
/*
a 
475
b 
821
c 
369
d 
562
sum is 2227.
average is 556.75.

*/
