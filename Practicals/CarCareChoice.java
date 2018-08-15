import java.util.Scanner;

public class CarCareChoice
{
    public static void main(String args[])
    {
        final String[] OPTIONS={"Oil change", "Tire rotation", "Battery check", "Brake inspection"};
        final int[] PRICING={25,22,15,5};
        int userSelection=0;
        String input;
        String output;
        Scanner scanner = new Scanner(System.in);
        boolean isValid;

        output = "Please select one of the following options:";
        for(int i=0;i<OPTIONS.length;++i)
            output+="\n" + OPTIONS[i];
        System.out.println(output);
        input=scanner.nextLine();
        isValid=false;
        for(int i=0;i<OPTIONS.length;++i)
        {
            if(OPTIONS[i].toLowerCase().equals(input.toLowerCase()))
            {
                userSelection=i;
                isValid=true;
            }
        }

        if(isValid)
            System.out.println("The price for " + OPTIONS[userSelection] + " is $" + PRICING[userSelection]);
        else
            System.out.println("Invalid option.");
    }
}
