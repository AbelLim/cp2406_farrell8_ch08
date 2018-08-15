public class Salesperson
{
    private int ID;
    private double salesAmount;
    public Salesperson(int ID, double salesAmount)
    {
        this.ID = ID;
        this.salesAmount = salesAmount;
    }

    public int getID() {
        return ID;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
