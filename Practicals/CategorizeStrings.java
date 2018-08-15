import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings
{
    public static void main(String args[])
    {
        final String END = "END";
        final int LONG = 10;
        String input;
        String output="";
        String[] strings = new String[10];
        ArrayList shortStrings = new ArrayList();
        ArrayList longStrings = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int countInput=0;

        System.out.println("Please input up to 10 strings.\nType " + END + " to end: ");
        input = scanner.nextLine();

        while (!input.equals(END))
        {
            strings[countInput] = input;
            countInput++;

            System.out.println("Please input another string\nType " + END + " to end: ");
            input = scanner.nextLine();
        }

        for(int i=0;i<countInput;++i)
        {
            if(strings[i].length()>LONG)
                longStrings.add(strings[i]);
            else
                shortStrings.add(strings[i]);
        }

        System.out.println("Please input\n1 to see the short strings\n2 to see the long strings\nIf no option is selected, the long strings will be displayed.");
        input = scanner.nextLine();

        if(input.equals("1"))
        {
            if(shortStrings.size()>0) {
                for (int i = 0; i < shortStrings.size(); ++i) {
                    output += shortStrings.get(i) + " ";
                }
            }

            else
            {
                output = "There are no short strings in this list.";
            }
        }

        else
        {
            if(longStrings.size()>0)
            {
                for(int i=0;i<longStrings.size();++i)
                {
                    output+=longStrings.get(i) + " ";
                }
            }

            else
            {
                output="There are no long strings in this list.";
            }
        }

        System.out.println(output);
    }
}
