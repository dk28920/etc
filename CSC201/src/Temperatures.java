import java.util.Scanner;
public class Temperatures
{
public static void main(String[] args)
 {
 Scanner keyboard = new Scanner(System.in);
 System.out.println("How many month in a year??? :)");
int size = keyboard.nextInt( );
double[] temperature = new double[size];
// Read temperatures and compute their average:
 System.out.println("Now, Please Enter " + temperature.length +
 " temperatures of each months step by step from January to December~");
double sum = 0;
for (int index = 0; index < temperature.length; index++)
 {
 temperature[index] = keyboard.nextDouble();
 sum = sum + temperature[index];
 }
double average = sum / temperature.length;
 System.out.println("The average temperature is " +
 average);
// Display each temperature and its relation to the
// average:
 System.out.println("The temperatures for each monthes are listed below this line in an order from January to December:");
for (int index = 0; index < temperature.length; index++)
 {
if (temperature[index] < average)
 System.out.println(temperature[index] +
 " celsius, which is BELOW the average temperature.");
else if (temperature[index] > average)
	 System.out.println(temperature[index] +
			 " celsius, which is ABOVE the average temperature.");
			else //temperature[index] == average
			 System.out.println(temperature[index] +
			 " celsius, which is an AVERAGE temperature. ");
			 }
			 
			 }
			}
