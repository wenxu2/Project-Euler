import java.math.BigInteger;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
*/
public class P3 {
	
	public static int factor(int number)
	{
		int largeFactor = 1;
		
		for(int i = 1 ; i < number; i++)
		{
			if(number % i == 0)
			{
				if(i > largeFactor)
				{
					largeFactor = i;
				}
			}
		}
		
		return largeFactor;
	}

	public static void main(String[] args)
	{
		System.out.println(factor(6));

	}
}
