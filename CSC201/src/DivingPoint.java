
import java.util.Arrays;
import java.util.Scanner;
 
public class DivingPoint
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double[] point = new double[7];
        double max;
        double sum = 0;
        double difficulty;
        double totalpoint;
        int index;
 
        System.out.println("Enter " + point.length + " scores.");
        point[0] = keyboard.nextDouble();
        max = point[1];
        for (index = 1; index < 7; index++)
        {
        	point[index] = keyboard.nextDouble();
            if (point[index] > max)
                max = point[index];
        }
 
        Arrays.sort(point);
 
        for(int i=0; i < point.length ; i++)
        {
            sum = sum + point[i];
        }
 
        System.out.println("Enter degree of difficulty");
        difficulty = keyboard.nextDouble();
 
     
        totalpoint = ((((sum - point[0]) - point[6]) * difficulty) * 0.6);
 
        System.out.println("final score of diver is " + totalpoint);
    }
}