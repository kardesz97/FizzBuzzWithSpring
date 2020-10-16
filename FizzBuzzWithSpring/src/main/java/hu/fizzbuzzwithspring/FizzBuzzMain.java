package hu.fizzbuzzwithspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FizzBuzzMain {

	public static void main(String[] args) {
		new FizzBuzzMain().run();
	}

	private void run() {
		try {
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcome");
			welcomeMessage.getMessage();
			FizzTagger fizzTagger = new FizzTagger();
			BuzzTagger buzzTagger = new BuzzTagger();
			NumberTagger[] numberTaggers = { fizzTagger, buzzTagger };
			int inputNumber = 100;
			for (int i = 1; i <= inputNumber; i++) {
				System.out.print(i + " ");
				for (NumberTagger number : numberTaggers) {
					if (number.isToBeTagged(i)) {
						System.out.print(number.getTag());
					}
				}
				System.out.println(" ");
			}
			GoodByeMessage goodByeMessage = (GoodByeMessage) context.getBean("goodBye");
			goodByeMessage.getMessage();
		} catch (Exception e) {
		}
	}

}
