import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int [] dataPoint = {};
        dataPoint = new int[100];
        double sum = 0.0;
        double avg;

        for (int e = 0; e < dataPoint.length; e++)
        {
            dataPoint[e] = rnd.nextInt(100)+1;
        }
        for (int e = 0; e < dataPoint.length; e++)
        {
            System.out.print(dataPoint[e]+ " | ");
            sum += dataPoint[e];
        }
        avg = sum / dataPoint.length;
        System.out.println("\nThe sum of the random array data points is " + sum);
        System.out.println("The average of the random array data points is " + avg);

    }
}