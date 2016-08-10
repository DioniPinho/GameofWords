package br.com.gameofwords.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gameofwords.scrambler.ReverseWord;
import br.com.gameofwords.scrambler.ExchangeLetters;

public class ScramblersTest {

	@Test
	public void reverseTest() {
		ReverseWord rw = new ReverseWord();
		String result = rw.toScramble("Peace");
		assertEquals("ecaeP", result);
	}
	
	@Test
	public void parImparTest(){
		ExchangeLetters el = new ExchangeLetters();
		String result = el.toScramble("Peace");
		assertEquals("ePcai", result);
	}
}
