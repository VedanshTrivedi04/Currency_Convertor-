import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double usdToEur = 0.85;
        double usdToGbp = 0.75;
        double usdToInr = 74.50;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Available conversions:");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to GBP");
        System.out.println("3. USD to INR");
        System.out.println("4. EUR to USD");
        System.out.println("5. GBP to USD");
        System.out.println("6. INR to USD");
        System.out.print("Enter the number of your choice: ");

        int choice = scanner.nextInt();
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEur;
                System.out.printf("%.2f USD is %.2f EUR\n", amount, convertedAmount);
                break;
            case 2:
                convertedAmount = amount * usdToGbp;
                System.out.printf("%.2f USD is %.2f GBP\n", amount, convertedAmount);
                break;
            case 3:
                convertedAmount = amount * usdToInr;
                System.out.printf("%.2f USD is %.2f INR\n", amount, convertedAmount);
                break;
            case 4:
                convertedAmount = amount / usdToEur;
                System.out.printf("%.2f EUR is %.2f USD\n", amount, convertedAmount);
                break;
            case 5:
                convertedAmount = amount / usdToGbp;
                System.out.printf("%.2f GBP is %.2f USD\n", amount, convertedAmount);
                break;
            case 6:
                convertedAmount = amount / usdToInr;
                System.out.printf("%.2f INR is %.2f USD\n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice. Please restart the program and try again.");
        }

        scanner.close();
    }
}
