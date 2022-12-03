import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class TestCashRegister
{
    public static void main(String[] args)
    {
        RetailItem item = new RetailItem("Shirt", 1234, 10.99, 15.99);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity of items being purchased: ");
        int quantity = scanner.nextInt();
        CashRegister register = new CashRegister(item, quantity);
        System.out.println("Subtotal: $" + register.getSubtotal());
        System.out.println("Tax: $" + register.getTax());
        System.out.println("Total: $" + register.getTotal());
        register.createReceipt();
    }
}
