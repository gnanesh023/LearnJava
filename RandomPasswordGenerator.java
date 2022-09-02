import java.util.Random;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        String s = "@#$%&*!()ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefijklmnopqrstuvwxyz1234567890";


        StringBuilder pass = new StringBuilder();
        int passLen = rant(8, 16);
        for (int i = 0; i < passLen; i++) {
            pass.append(s.charAt(rant(0, s.length())));


        }
        System.out.println(pass);

    }


    public static int rant(int min, int max) {
        Random rand = new Random();


        return rand.nextInt((max - min) + 1) + min;


    }
}
