package br.com.gameofwords.scrambler;

public class ReverseWord implements Scrambler {

	@Override
	public String toScramble(String word) {
		StringBuilder sb = new StringBuilder();
	for(int i = word.length(); i>0; i--){
		sb.append(word.charAt(i-1));
	}
		
		return sb.toString();
	}

}
