public class Main
{
    public static void main(String args[]) {
        double sum = 0;
        double num = 3;
        while (num < 1000) {
            if ((num % 3 == 0) || (num % 5 == 0)) {
                sum = sum + num;
            }
            num = num + 1;
            System.out.println(sum);
        }
    }
}
