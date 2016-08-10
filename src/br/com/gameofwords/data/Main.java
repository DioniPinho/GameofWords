package br.com.gameofwords.data;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import br.com.gameofwords.mecanic.GameCreate;
import br.com.gameofwords.mecanic.GameMecanic;
import br.com.gameofwords.scrambler.Scrambler;
import br.com.gameofwords.scrambler.ScramblerFactory;

public class Main {

	public static WordBase db = new WordBase();

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		Scanner words = new Scanner(System.in);

		db.loadFile();
		int module;
		System.out.println("\n\t\t=== BEM VINDO(A) AO JOGO DAS PALAVRAS!=== \n"
				+ "\n\tSelecione o modo para jogar: 1-Não Erre! / 2-Cinco Palavras\n\t");

		module = in.nextInt();
		GameCreate.setModulo(module);

		GameMecanic gameMecanic = GameCreate.get();

		System.out
				.println("\n\t :: Modo Jogo: " + gameMecanic.getName() + " ::" + "\n\t Descrição: " + gameMecanic.getDescription());

		while (!gameMecanic.gameOver()) {
			String word = gameMecanic.getWordTime();
			Scrambler scramb = ScramblerFactory.getRandom();
			String scrambled = scramb.toScramble(word);

			System.out.println("\n\nAdivinhe qual a palavra: " + scrambled);
			String answer = words.nextLine().toUpperCase();

			String result = gameMecanic.attempts(word, answer);
			System.out.println(result);
		}

		System.out.println(gameMecanic.finalResult());

	}

}
