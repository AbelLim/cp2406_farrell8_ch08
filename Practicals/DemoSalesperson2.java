public class DemoSalesperson2
{
    public static void main(String args[])
    {
        Salesperson[] salespeople = new Salesperson[10];
        String output="Salespeople:\n";

        for(int i=0;i<salespeople.length;++i)
        {
            salespeople[i] = new Salesperson(111+i,25000+(i*5000));
            if(salespeople[i].getID() > 120)
                salespeople[i].setID(120);
            if(salespeople[i].getSalesAmount() > 70000)
                salespeople[i].setSalesAmount(70000);
            output += "ID: " + salespeople[i].getID() + " Sales amount: " + salespeople[i].getSalesAmount() + "\n";
        }

        System.out.println(output);
    }
}
