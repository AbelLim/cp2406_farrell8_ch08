import java.util.Scanner;

public class DistanceFromAverage
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        final double EXIT = 99999;
        double input;
        double total=0;
        double[] numbers = new double[20];
        int count=0;

        System.out.println("Please input a number.\nInput " + EXIT + " to exit.");
        input = scanner.nextDouble();

        while(!(input==EXIT))
        {
            numbers[count] = input;
            count++;
            total+=input;
            System.out.println("Please input another number.\nInput " + EXIT + " to exit.");
            input = scanner.nextDouble();
        }

        if(count == 0)
            System.out.println("You did not input any numbers.");

        for(int i=0;i<count;++i)
        {
            System.out.println(numbers[i] + " is " + Math.abs((total/count-numbers[i])) + " from the average.");
        }
    }
}
