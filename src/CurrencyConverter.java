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
        System.out.println("5 UAE Dirham");
        System.out.println("6 KUWAITI Diner");
        System.out.println("7 SWISS Franc");
        System.out.println("8 JAPANESE Yen");
        System.out.println("9 S KOREA Won");





        int fromCurrency = scanner.nextInt();

        System.out.println("Choose the currency you want to convert to");
        System.out.println("1 USD");
        System.out.println("2 EUR");
        System.out.println("3 GBP");
        System.out.println("4 BDT");
        System.out.println("5 UAE Dirham");
        System.out.println("6 KUWAITI Diner");
        System.out.println("7 SWISS Franc");
        System.out.println("8 JAPANESE Yen");
        System.out.println("9 S KOREA Won");




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
                {1.0, 0.95, 0.79, 119.0, 3.67, 0.31, 0.89, 154.72, 1394.50}, // USD to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won
                {1.05, 1.0, 0.84, 126.0, 3.88, 0.32, 0.94, 163.58, 1473.43}, // EUR to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won
                {1.26, 1.20, 1.0, 152.0, 4.62, 0.39, 1.12, 195.48, 1761.72}, // GBP to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won
                {0.0083, 0.0079, 0.0066, 1.0, 32.55, 0.0026, 0.0074, 1.30, 11.66}, // BDT to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won
                {0.27, 0.26, 0.22, 32.55, 1.0, 0.084, 0.24, 42.17, 379.67}, //UAE to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won
                {3.25, 3.08, 2.58, 388.65, 11.94 ,1.0, 2.88, 503.29, 4533.86}, //KUWAITI to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won
                {1.13, 1.07, 0.89, 135.01, 4.15 ,0.35, 1.0, 174.74, 1574.17}, //SWISS Franc to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won
                {0.0065, 0.0061, 0.0051, 0.77, 0.024 ,0.001, 0.0057, 1.0 , 9.00}, //JAPANESE Yen to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won
                {0.00072, 0.00068, 0.00057, 0.086, 0.0026, 0.00022, 0.00064, 0.11, 1.0}, //S KOrea Won to USD, EUR, GBP, BDT, UAE, KUWAITI, SWISS Franc, JAPANESE Yen, S KOrea Won

        };

        return rates[fromCurrency - 1] [toCurrency - 1];
    }
}

