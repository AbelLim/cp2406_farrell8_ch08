public class DemoSalesperson
{
    public static void main(String args[])
    {
        Salesperson[] salespeople = new Salesperson[10];
        String output="Salespeople:\n";

        for(int i=0;i<salespeople.length;++i)
        {
            salespeople[i] = new Salesperson(9999,0);
            output += "ID: " + salespeople[i].getID() + " Sales amount: " + salespeople[i].getSalesAmount() + "\n";
        }

        System.out.println(output);
    }
}
