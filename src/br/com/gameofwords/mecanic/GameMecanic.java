package br.com.gameofwords.mecanic;

import java.io.IOException;

public interface GameMecanic {

	String getName();
	
	String getDescription();

	boolean gameOver();

	String getWordTime() throws IOException;

	String attempts(String palavra, String resposta);

	String finalResult();

}
