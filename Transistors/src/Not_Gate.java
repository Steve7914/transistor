
public class Not_Gate {
	boolean input;
	boolean current;
	boolean output;
	public Not_Gate() {
		input = true;
		current = true;//false;
		output = false;
	}
	public void Update() {
		if (current && input) output = false;
		else output = true;
	}
	public void ChangeInput() {
		input = !input;
		Update();
	}
	public void ChangeCurrent() {
		current = !current;
		Update();
	}
	public boolean GetOutput() {
		if (current && input) return false;
		else return true;
	}
}
