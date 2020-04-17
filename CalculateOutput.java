public class CalculateOutput {

private static float N;
private static float f;

public static float getN() {
	return N;
}


public static void function0()
{
	N=0;
}

public static void function1(char c)
{
	N = 10*N + Character.getNumericValue(c);
}

public static void function2()
{
	f=1;
}

public static void function3(char c)
{
	f=10*f;
	N=N+Character.getNumericValue(c)/f;
}

}