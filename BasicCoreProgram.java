package assignments.CorejavaAndFunctionalprogram;

import java.util.Random;


public class BasicCoreProgram {
    public static void main(String[] args) {
        System.out.println("Welcome To Basic Core Programs");
        headsortails(10);
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
}
