package hu.fizzbuzzwithspring;

public interface NumberTagger {
	public boolean isToBeTagged(int number);

	public String getTag();
}
