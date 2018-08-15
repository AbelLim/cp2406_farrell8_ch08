public class ArrayMethodDemo
{
    public static void main(String args[])
    {
        int[] integers = {1,2,3,4,5,6,7,8,9,10};
        int VALUE_LESS_THAN = 5;
        displayIntegers(integers);
        displayReverseInteger(integers);
        displaySumInteger(integers);
        displayIntegersLessThan(integers, VALUE_LESS_THAN);
        displayMoreThanAverage(integers);
    }

    public static void displayIntegers(int[] integers)
    {
        String message = "";
        for(int i=0; i<integers.length;++i)
            message += integers[i] + " ";
        System.out.println(message);
    }

    public static void displayReverseInteger(int[] integers)
    {
        String message = "";
        for(int i=integers.length-1; i>=0;--i)
            message += integers[i] + " ";
        System.out.println(message);
    }

    public static void displaySumInteger(int[] integers)
    {
        int total=0;
        for(int i=0;i<integers.length;++i)
            total+=integers[i];
        System.out.println("The sum of the integers is " + total);
    }

    public static void displayIntegersLessThan(int[] integers, int value)
    {
        String message = "";
        for(int i=0; i<integers.length;++i)
        {
            if(integers[i]<value)
                message += integers[i] + " ";
        }
        System.out.println(message);
    }

    public  static void displayMoreThanAverage(int[] integers)
    {
        int total=0;
        for(int i=0;i<integers.length;++i)
            total+=integers[i];
        String message = "";
        for(int i=0; i<integers.length;++i)
        {
            if(integers[i]>total/integers.length)
                message += integers[i] + " ";
        }
        System.out.println(message);
    }
}
