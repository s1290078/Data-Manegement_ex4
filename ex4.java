import java.util.Random;
import java.util.Scanner;

public class ex4{
    public static void main(String[] args){
        Random rand = new Random();
        String[] headOrTails = {"Heads","Tails"};
	
        System.out.println("Tossing a coin...");
        int countHeads = 0;
        int countTails = 0;
        for (int i = 0; i < 3; i++){
            String headOrTail = headOrTails[rand.nextInt(2)];
            System.out.println(headOrTail);
            if (headOrTail == "Heads") countHeads++;
            else if (headOrTail == "Tails") countTails++;
        }
        System.out.println("Heads: " + countHeads + ", " + "Tails: " + countTails);
    }
}