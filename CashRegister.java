import java.io.BufferedWriter;
import java.io.FileWriter;

public class CashRegister
{
    private int quantity;
    private RetailItem item;

    public CashRegister(RetailItem item, int quantity)
    {
        this.item = item;
        this.quantity = quantity;
    }

    public double getSubtotal()
    {
        return quantity * item.getRetailCost();
    }

    public double getTax()
    {
        return getSubtotal() * 0.06;
    }

    public double getTotal()
    {
        return getSubtotal() + getTax();
    }

    public void createReceipt()
    {
        try
        {
            FileWriter writer = new FileWriter("receipt.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("SALES RECEIPT");
            bw.newLine();
            bw.write("Unit Price: $" + item.getRetailCost());
            bw.newLine();
            bw.write("Quantity: " + quantity);
            bw.newLine();
            bw.write("Subtotal: $" + getSubtotal());
            bw.newLine();
            bw.write("Sales Tax: $" + getTax());
            bw.newLine();
            bw.write("Total: $" + getTotal());
            bw.newLine();
            bw.close();
            System.out.println("Receipt created successfully!");
        }
        catch(Exception e)
        {
            System.out.println("Error writing to file!");
        }
    }
}