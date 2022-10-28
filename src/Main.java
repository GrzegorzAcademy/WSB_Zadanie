import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MONTH_OF_TEAR = 12;
        final int PROCENT = 100;

        System.out.println("Principal :");
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();


        System.out.println("Annual interst rate :");
        float rate = sc.nextFloat();
        double annualInterstRate = rate / PROCENT / MONTH_OF_TEAR;


        System.out.println("Years :");
        int years = sc.nextInt();
        int numberOfPAyments = years * MONTH_OF_TEAR;


        Double monthlyRate = principal * annualInterstRate * Math.pow(1 + annualInterstRate, numberOfPAyments)
                / (Math.pow(1 + annualInterstRate, numberOfPAyments) - 1);

        String numberFormated = NumberFormat.getCurrencyInstance(Locale.US).format(monthlyRate);
        System.out.println(numberFormated);


    }
}