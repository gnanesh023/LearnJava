import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc1=new Scanner(System.in);
        String givenstr =sc1.nextLine();
        System.out.println("Enter Char");
        Scanner sc2 =new Scanner(System.in);
        String chr =sc2.next();
        int count=0;
        for (int i=0; i < givenstr.length();i++){

            if (givenstr.charAt(i) == chr.charAt(0)){
                count++;
            }

        }
        sc1.close();
        sc2.close();
        System.out.println("The Character '"+chr+"' appears "+count+" times.");
    }
}

