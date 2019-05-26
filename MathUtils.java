// ****************************************************************

// MathUtils.java

//

// Provides static mathematical utility functions.

//

// ****************************************************************

public class MathUtils

{

	//-------------------------------------------------------------

	// Returns the factorial of the argument given

	//-------------------------------------------------------------

	public static int factorial(int n)

	{
		if (n < 1)
			throw new IllegalArgumentException("Number must be positive.");
		
		if (n > 12)
			throw new IllegalArgumentException("Number must be less than 12.");
		
		int fac = 1;

		for (int i=n; i>0; i--)

			fac *= i;

		return fac;

	}
	

}