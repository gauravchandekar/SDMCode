

import java.util.Random;

public class PrintingRandomNumber{
  public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(9000) + 1000;
        System.out.println("Random 4 digit number: " + randomNumber);

    }

}
