package br.com.gameofwords.mecanic;

import br.com.gameofwords.data.WordBase;
import br.com.gameofwords.data.Main;

public class NotErr implements GameMecanic {

	private int hits;
	private boolean missed = false;
		
	@Override
	public String getName() {
		
		return "NÃO ERRE!";
	}

	@Override
	public String getDescription() {
		
		return "O jogo termina se você errar!";
	}

	@Override
	public boolean gameOver() {
		
		return missed;
	}

	@Override
	public String getWordTime() {
		
		return Main.db.getNextWord();
	}

	@Override
	public String attempts(String palavra, String resposta) {
		
		if(palavra.equals(resposta)){
			
			hits++;
			return "Acertou! Vamos mais uma vez?!";
			
		}else{
			missed = true;
			return "NÃo foi dessa vez! Tente de novo!";
		}
		
	}

	@Override
	public String finalResult() {
		
		return "Você acertou " + hits + " palavras!";
	}

}
