import java.util.Scanner;

public class Main {


    /**
     * @author Dell
     */

    public static class MoodAnalyser {

        /*
         * Method to check message contain sad word or not
         */
        public String analyseMood(String message) {

            if (message.contains("sad")) {
                return "SAD";
            }

            return "HAPPY";
        }

        /**
         * This is main method of program
         *
         * @param args
         */
        public static void main(String[] args) {

            MoodAnalyser mood = new MoodAnalyser();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your message");

            String message = sc.next();

            /*
             * To call method with MoodAnalyser object
             */
            System.out.println(mood.analyseMood(message));
        }

    }
}

