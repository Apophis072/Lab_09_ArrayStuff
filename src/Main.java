import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int [] dataPoint = {};
        dataPoint = new int[100];
        double sum = 0.0;
        double avg;
        int findValue;
        boolean found = false;
        int timesFound = 0;
        int minValue = 100;
        int maxValue = 0;

        //assigning the values in the set or array and printing them out
        for (int e = 0; e < dataPoint.length; e++)
        {
            dataPoint[e] = rnd.nextInt(100)+1;
        }
        for (int e = 0; e < dataPoint.length; e++)
        {
            System.out.print(dataPoint[e]+ " | ");
            sum += dataPoint[e];
        }

        //printing the average and the sum of the set or array
        avg = sum / dataPoint.length;
        System.out.println("\nThe sum of the random array data points is " + sum);
        System.out.println("The average of the random array data points is " + avg);

        //finding how many times a specific value occurs in the set or array
        findValue = SafeInput.getRangedInt(in, "Enter a value that you'll like to find from the data set", 1,100);
        for (int e = 0; e < dataPoint.length; e++)
        {
         if (dataPoint[e] == findValue)
         {
             found = true;
             timesFound ++;
         }
        }
        if (!found)
        {
            timesFound = 0;
        }
        System.out.println("Your value, " + findValue + " was found in this set " + timesFound + " times.");
        found = false;
        //finding when a specific value first occurs
        findValue = SafeInput.getRangedInt(in, "Enter a value that you'll like to find where it first occurs", 1, 100);
        for (int e = 0; e < dataPoint.length; e++)
        {
            if (dataPoint[e] == findValue)
            {
                found = true;
                System.out.println("The value, " + findValue + ", was found at array index " + e);
                break;
            }
        }
        if (!found)
        {
            System.out.println("The value, " + findValue + ", was not found in the array.");
        }

        //Finding minimum and maximum values
        for (int e = 0; e < dataPoint.length; e++)
        {
            if (dataPoint[e] < minValue)
            {
            minValue = dataPoint[e];
            }
            if (dataPoint[e] > maxValue)
            {
                maxValue = dataPoint[e];
            }
        }
        System.out.println("The minimum value is " + minValue + " and the maximum value is " + maxValue);
        //Getting average for an array of double values
        System.out.println("The average of data points is "  + getAverage(dataPoint) + ".");
    }

    public static double getAverage (int values[])
    {
        double avg;
        int arrayLength;
        Random rnd = new Random();
        double [] dataPoint;
        double sum = 0;

        arrayLength = rnd.nextInt(100)+1;
        dataPoint = new double[arrayLength];
        for (int e = 0; e < arrayLength; e++)
        {
            dataPoint[e] = rnd.nextDouble();
            sum = sum = dataPoint[e];
        }
        avg = sum / arrayLength;

        return avg;
    }


}