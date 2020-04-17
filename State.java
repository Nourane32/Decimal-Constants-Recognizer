public enum State {
q0(false) {
	@Override
	public State nextState(char input) {
		switch(input) {
		case('0'):
			CalculateOutput.function1(input);
			return q2;
		case('.'):
			return qer;
		default:
			CalculateOutput.function1(input);
		return q1;
		}
	}
},
q1(false) {
	@Override
	public State nextState(char input) {
		switch(input) {
		case('0'):
			CalculateOutput.function1(input);
			return q1;
		case('.'):
			CalculateOutput.function2();
			return q3;
		default:
			CalculateOutput.function1(input);
		return q1;
		}
	}
},
q2(false) {
	@Override
	public State nextState(char input) {
		switch(input) {
		case('0'):
			return qer;
		case('.'):
			CalculateOutput.function2();
			return q3;
		default:
		return qer;
		}
	}
},
q3(false) {
	@Override
	public State nextState(char input) {
		switch(input) {
		case('0'):
			CalculateOutput.function3(input);
			return q4;
		case('.'):
			return qer;
		default:
			CalculateOutput.function3(input);
		return q4;
		}
	}
},
q4(true) {
	@Override
	public State nextState(char input) {
		switch(input) {
		case('0'):
			CalculateOutput.function3(input);
			return q4;
		case('.'):
			return qer;
		default:
			CalculateOutput.function3(input);
		return q4;
		}
	}
},
qer(false) {
	@Override
	public State nextState(char input) {
		return qer;
	}
};
	
private final boolean accepting;

private State( boolean accepting ) {
    this.accepting = accepting;
}

public boolean isFinalStateAccepted()
{
	return this.accepting;
}

public abstract State nextState(char input); 

}
