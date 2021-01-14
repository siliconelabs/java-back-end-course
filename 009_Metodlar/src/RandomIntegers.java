import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        // randomNumbers object will produce secure random numbers
        Random randomNumbers = new Random();

        // loop 20 times
        for (int counter = 1; counter <= 20; counter++) {
            // pick random integer from 1 to 6
            int face = 1 + randomNumbers.nextInt(6);
            String g="abcds";


            System.out.printf("face degiskenin degeri= %d -----%s ", face,g); // display generated value


            // if counter is divisible by 5, start a new line of output
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}