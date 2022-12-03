public class RetailItem {

    private String description;
    private int itemNumber;
    private CostData cost;

    public RetailItem(String desc, int itemNum,
                      double wholesale, double retail)
    {
        description = desc;
        itemNumber = itemNum;
        cost = new CostData(wholesale, retail);
    }
    public String toString()
    {
        String str;

        str = String.format("Description: %s\n" +
                        "Item Number: %d\n" +
                        "Whoesale Cost: $%,.2f\n" +
                        "Retail Price: $%,.2f\n" +
                        description, itemNumber,
                cost.wholesale, cost.retail);
        return str;
    }

    public double getWholesaleCost(){
        return cost.wholesale;
    }

    public double getRetailCost(){
        return cost.retail;
    }

    public void setWholesaleCost(double w){
        cost.wholesale = w;
    }

    public void setRetailCost(double r){
        cost.retail = r;
    }

    private class CostData
    {
        public double wholesale,
                retail;

        public CostData(double w, double r)
        {
            wholesale = w;
            retail = r;
        }
    }
}