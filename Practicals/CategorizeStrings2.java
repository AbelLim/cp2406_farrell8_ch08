import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings2
{
    public static void main(String args[])
    {
        final String END = "END";
        String input;
        String output="";
        String[] strings = new String[10];
        ArrayList noSpaces = new ArrayList();
        ArrayList oneSpaces = new ArrayList();
        ArrayList multiSpaces = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int countInput=0;
        int countSpaces=0;

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
            countSpaces=0;
            for(int j=0;j<strings[i].length();++j)
            {
                if(strings[i].charAt(j)==' ')
                    countSpaces++;
            }
            if(countSpaces==0)
                noSpaces.add(strings[i]);
            else if(countSpaces==1)
                oneSpaces.add(strings[i]);
            else
                multiSpaces.add(strings[i]);

        }

        System.out.println("Please input\n1 to see strings with no spaces.\n2 to see strings with one spaces.\n3 to see strings with more than one spaces.\nIf no option is selected, all strings will be displayed.");
        input = scanner.nextLine();

        if(input.equals("1"))
        {
            for(int i=0;i<noSpaces.size();++i)
                output+=noSpaces.get(i) + " ";
        }

        else if(input.equals("2"))
        {
            for(int i=0;i<oneSpaces.size();++i)
                output+=oneSpaces.get(i) + " ";
        }

        else if(input.equals("3"))
        {
            for(int i=0;i<multiSpaces.size();++i)
                output+=multiSpaces.get(i) + " ";
        }

        else
        {
            for(int i=0;i<countInput;++i)
                output+=strings[i] + " ";
        }

        System.out.println(output);
    }
}
