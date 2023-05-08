package exception;

@SuppressWarnings("serial")
public class BancaException extends Exception {
	String msg;

	public BancaException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

}
