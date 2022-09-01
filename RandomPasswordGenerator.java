class Main {
    public static void main(String[] args) {
        String s = "@#$%&*!()ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefijklmnopqrstuvwxyz1234567890";


        StringBuilder pass = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            pass.append(s.charAt(rant(0, s.length())));


        }
        System.out.println(pass);

    }

    public static int rant(int min, int max) {

        int range = max - min + 1;

        return (int) (Math.random() * range) + 1;


    }
}

