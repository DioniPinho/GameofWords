package br.com.gameofwords.mecanic;

import br.com.gameofwords.data.WordBase;
import br.com.gameofwords.data.Main;

public class BestFive implements GameMecanic {

	private int qtdWords = 0, points;
	
	
	
	@Override
	public String getName() {
		
		return "CINCO PALAVRAS";
	}

	@Override
	public String getDescription() {
		
		return "Faça o máximo de pontos com cinco palavras";
	}

	@Override
	public boolean gameOver() {
		
		return qtdWords == 5;
		
	}

	@Override
	public String getWordTime() {
		
		return Main.db.getNextWord();
	}

	@Override
	public String attempts(String word, String answer) {
		
		if (word.equals(answer)) {
			
			points += 100;
			qtdWords++;
			getWordTime();
			return "Acertou! + 100 pontos!";
			
		}else{
			if (points >= 50) {
				points -= 50;
				qtdWords++;
				word = Main.db.getNextWord();
				return "Xiii errou! perdeu 50 pontos";
			}else {
				
				points = 0;
				qtdWords++;
				word = Main.db.getNextWord();
				return "Xiii errou! NÃ£o ganhou nenhum ponto";
			}
			
		}
		
		
	}

	@Override
	public String finalResult() {
		
		return "VocÃª fez " + points + " pontos!";
	}

}
