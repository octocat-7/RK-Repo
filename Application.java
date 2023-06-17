import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadAndPrintScores
{
    public static void main(String[] args)
    {	try
	{   Scanner s = new Scanner( new File("scores.dat") );
	    while( s.hasNextInt() )
	    {	System.out.println( s.nextInt() );
	    }
	}
	catch(IOException e)
	{	System.out.println( e );
	}
    #feature202 changes by Prahlad on NewPolicies Module in June2023
	 public static void main(String[] args) {

    int count = 0, num = 123456;

    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
  }
}
}