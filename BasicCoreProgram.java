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
}
