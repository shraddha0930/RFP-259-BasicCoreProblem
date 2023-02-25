package assignments.CorejavaAndFunctionalprogram;

import java.util.Random;
import java.util.Scanner;


public class BasicCoreProgram {
    public static void main(String[] args) {
        System.out.println("Welcome To Basic Core Programs");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the flip number:");
        headsortails(scanner.nextInt());

        System.out.println("Enter the year:");
        leapyear(scanner.nextInt());

        System.out.println("Enter power value N:");
        poweroftwo(scanner.nextInt());

        System.out.println("Enter Harmonic Value N:");
        harmonicnumber(scanner.nextInt());

        System.out.println("Enter number N:");
        factors(scanner.nextInt());

        System.out.println("Enter Dividend and Divisor number:");
        quotientandremainder(scanner.nextInt(), scanner.nextInt());

        System.out.println("Enter the value of number1 and number2:");
        swap2numbers(scanner.nextInt(), scanner.nextInt());

        System.out.println("Enter Number:");
        evenorodd(scanner.nextInt());

    }
    public static void headsortails(int numberOfTimesToflip){
        int totalTails=0;
        int totalHeads =0;

        for (int i = 1; i <= numberOfTimesToflip; i++) {
            Random random = new Random();
            int flip = random.nextInt(2);
            if ( flip < 0.5)
                totalHeads++;
            else
                totalTails++;
        }
        double percentageOfTails =totalTails/(double)numberOfTimesToflip*100;
        System.out.println("Percentage of Tails :" + percentageOfTails);
        double percentageOfHeads =(numberOfTimesToflip-totalTails)/(double)numberOfTimesToflip*100;
        System.out.println("Percentage of Heads :" + percentageOfHeads);

    }
    public static void leapyear(int year){
        if (((year % 4 == 0) && (year % 100 != 0))|| (year % 400 == 0)){
            System.out.println("Leap year");
        }
        else
            System.out.println("Not a Leap Year");
    }

    public static void poweroftwo(int N){
        int i = 0;                // count from 0 to N
        int powerOfTwo = 1;       // the ith power of two

        // repeat until i equals N
        while (i <= N) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }
    }
    public static void harmonicnumber(int N){

        double harmonicN = 1;

        // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
        for (int i = 1; i <= N; i++) {

            harmonicN = (double) 1 / i;

            System.out.print(harmonicN);
            System.out.print("+ ");
        }

    }

    public static void factors(int N){
        System.out.print("Prime factors of number N are:");
        int c = 2;
        while (N > 1) {
            if (N % c == 0) {
                System.out.print(c + " ");
                N /= c;
            } else
                c++;
        }

    }

    public static void quotientandremainder(int dividend, int divisor){
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }

    public static void swap2numbers(int number1, int number2){
        System.out.println("before swapping numbers: "+number1 +"  "+ number2);

        //swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swapping numbers: "+ number1 +"   " + number2);

    }

    public static void evenorodd(int number){

        if(number % 2 == 0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }

}
