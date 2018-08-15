import java.util.Scanner;

public class CarCareChoice2
{
    public static void main(String args[])
    {
        final String[] OPTIONS={"Oil change", "Tire rotation", "Battery check", "Brake inspection"};
        final int[] PRICING={25,22,15,5};
        int userSelection=0;
        String input;
        String output;
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        boolean isOptionCode;

        output = "Please select one of the following options:";
        for(int i=0;i<OPTIONS.length;++i)
            output+="\n" + OPTIONS[i];
        System.out.println(output);
        input=scanner.nextLine();
        for(int i=0;i<OPTIONS.length;++i)
        {
            isOptionCode=true;
            for(int j=0;j<3;++j)
            {
                if(OPTIONS[i].toLowerCase().charAt(j)!=(input.toLowerCase().charAt(j)))
                    isOptionCode=false;
            }

            if(isOptionCode)
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
