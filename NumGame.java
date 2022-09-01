import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        check();
    }

    
        static void check() {
            int numAtmpt = 0;
            int ans;
            int max = 10;
            int min = 1;
            int range = max - min + 1;


            double randdom = (Math.random() * range) + 1;
            ans = (int) randdom;

            int userInput = 0;
            

            while (true) {
                //Get Input
                System.out.println("Enter the number in 1 to 10 Range: ");
                Scanner scanner = new Scanner(System.in);
                userInput = scanner.nextInt();
                numAtmpt++;
                System.out.println("anser is "+ans);
                if (ans != userInput) {


                    if (ans < userInput) {

                        System.out.println("Your Number is greater than answer");
                    } else if (ans > userInput) {

                        System.out.println("Your Number is lesser than answer");
                    }


                } else {
                    System.out.println("Congrats Ur Gussed at " + numAtmpt + " attempt");
                    break;
                }


            }
        }

    }
