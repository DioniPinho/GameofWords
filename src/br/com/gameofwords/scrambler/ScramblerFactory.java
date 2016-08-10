package br.com.gameofwords.scrambler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScramblerFactory{

	
	private static List<Scrambler> options = new ArrayList<>();
	
	static{
		options.add(new ReverseWord());
		options.add(new ExchangeLetters());
	}
	
	public static Scrambler getRandom(){
		Random r = new Random(System.currentTimeMillis());
		int reference = r.nextInt();
		int index = reference % options.size();
		return options.get(Math.abs(index));
	}
}
