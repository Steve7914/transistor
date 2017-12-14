
public class Transistor {
	boolean input;
	boolean current;
	boolean output;
	public Transistor() {
		input = false;
		current = true;
		output = false;
	}
	public void Update() {
		if (current && input) output = true;
		else output = false;
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
		if (current && input) return true;
		else return false;
	}
}
