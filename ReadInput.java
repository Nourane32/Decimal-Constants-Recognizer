import java.util.Scanner;

public class ReadInput {
public static  boolean flagToStop=false;
private static String input;	
private static String digits=new String(".0123456789");

public static void scanInput()
{
	System.out.print("Please enter sequence: ");

    Scanner scan = new Scanner(System.in);
    String in = scan.nextLine();
    while(in.length()==0)
    {
    	in = scan.nextLine();
    }
	for(int i=0;i<in.length();i++) {
		char c = in.charAt(i);
		if(digits.indexOf(c)!= -1) {
			input = in;
		}
		else {
			System.out.println("You entered a wrong format!");
			flagToStop = true;
			break;
		}
	}

    

}
public static String getInput()
{
	return input;
}


}
