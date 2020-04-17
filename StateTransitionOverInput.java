
public class StateTransitionOverInput {

	private static State state;
	private static String input;
	
	public static void TransitionOverInput(State state,String input)
	{
		StateTransitionOverInput.state = state;
		StateTransitionOverInput.input = input;
		CalculateOutput.function0();
		System.out.print(state);
		for (int i = 0; i < input.length(); i++){
		    char c = input.charAt(i); 
		    state=state.nextState(c);
		    System.out.print(" -> "+state);
		}
		System.out.println();
		if(state.isFinalStateAccepted())
		{
			System.out.println("Input string is accepted .");
			System.out.println("N = "+CalculateOutput.getN());
		}
		else
		{
			System.out.println("Input string is rejected .");
		}
		
	}
	
	
	
}

