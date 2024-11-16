import java.util.Scanner;

public class CurrencyConverter {

    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter !!");
        System.out.println("Choose the currency you want to convert from");
        System.out.println("1 USD");
        System.out.println("2 EUR");
        System.out.println("3 GBP");
        System.out.println("4 BDT");



        int fromCurrency = scanner.nextInt();

        System.out.println("Choose the currency you want to convert to");
        System.out.println("1 USD");
        System.out.println("2 EUR");
        System.out.println("3 GBP");
        System.out.println("4 BDT");

        int toCurrency = scanner.nextInt();

        System.out.println("Enter the Amount you want to convert:");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount);
        System.out.println("Converted Amount: " + convertedAmount);




    }

    public static double convertCurrency(int fromCurrency, int toCurrency, double amount){
        double conversionRate = getConversionRate(fromCurrency, toCurrency);
        return amount * conversionRate;
    }

    public static double getConversionRate(int fromCurrency, int toCurrency){
        //Example conversion rates
        double[][] rates = {
                {1.0, 0.95, 0.79, 119.0}, // USD to USD, EUR, GBP, BDT
                {1.05, 1.0, 0.84, 126.0}, // EUR to USD, EUR, GBP, BDT
                {1.26, 1.20, 1.0, 152.0}, // GBP to USD, EUR, GBP, BDT
                {0.0083, 0.0079, 0.0066, 1.0}, // BDT to USD, EUR, GBP, BDT
        };

        return rates[fromCurrency - 1] [toCurrency - 1];
    }
}

