package hu.fizzbuzzwithspring;

public abstract class AbstractNumberTagger implements NumberTagger {
	private int numberToCheck;
	private String tag;

	public AbstractNumberTagger(int numberToCheck, String tag) {
		super();
		this.numberToCheck = numberToCheck;
		this.tag = tag;
	}

	public boolean isToBeTagged(int number) {
		return number % numberToCheck == 0;
	}

	public String getTag() {
		return tag;
	}

}
