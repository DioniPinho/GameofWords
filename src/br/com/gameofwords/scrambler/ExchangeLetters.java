package br.com.gameofwords.scrambler;

public class ExchangeLetters implements Scrambler {

	@Override
	public String toScramble(String palavra) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < palavra.length(); i++){
		if(i % 2 != 0){
			sb.append(palavra.charAt(i));
			sb.append(palavra.charAt(i-1));
		} else if (i == palavra.length() -1) {
			sb.append(palavra.charAt(i));
			
		}
		}
		return sb.toString();
	}

}
