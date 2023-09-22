import java.util.Scanner;


public class TipCalculator
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the tip calculator!");


        Scanner scan = new Scanner(System.in);
        System.out.println("How many people are in your group?: ");
        int people = scan.nextInt();


        System.out.println("What is the tip percentage? (0-100): ");
        int tip = scan.nextInt();


        double cost = 1;


        System.out.print("Enter a cost of a item in dollars and cents, e.g. 12.50 (enter -1 to stop): ");
        double price = scan.nextDouble();
        System.out.println("Enter the item: ");
        String item = scan.nextLine();
        cost = cost + price;


        while(price > -1)
        {
            System.out.print("Enter a cost of a item in dollars and cents, e.g. 12.50 (enter -1 to stop): " );
            price = scan.nextDouble();
            cost = cost + price;
        }


        double tipTotal = cost * (tip / 100.0);
        double perCost = cost / people;
        double perTip = tipTotal / people;


        System.out.println("Tip percentage: " + tip + "%");
        System.out.println("Total bill before tip: $" + cost);
        System.out.println("Total tip: $" + tipTotal);
        System.out.println("Total bill with tip: $" + (cost + tipTotal));
        System.out.println("Per person cost before tip: $" + perCost);
        System.out.println("Tip per person: $" + perTip );
        System.out.println("Total cost per person: $" + (perTip + perCost));
    }
}
