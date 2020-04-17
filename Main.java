
public class Main {

	public static void main(String[] args) {
		ReadInput.scanInput();
		String input= ReadInput.getInput();
		if(!ReadInput.flagToStop)
		StateTransitionOverInput.TransitionOverInput(State.q0,input);
	}

}
