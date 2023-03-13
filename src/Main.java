public class Main{
    public static void main(String[]args) {
        int a = 38;


        int sum = (a / 10) + (a % 10);
        System.out.println(sum);


        int a = 7;
        int b = 2;

        System.out.println((double) a / (double) b);
        System.out.println(a % b);


        double number = 5.89784;
        int roundedNumber = (int)
                Math.round(number);


        System.out.println(roundedNumber);
    }
}