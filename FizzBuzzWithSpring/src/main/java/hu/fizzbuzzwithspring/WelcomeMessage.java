package hu.fizzbuzzwithspring;

public class WelcomeMessage {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println(message);
	}

}
