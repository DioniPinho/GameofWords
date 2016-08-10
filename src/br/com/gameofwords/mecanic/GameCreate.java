package br.com.gameofwords.mecanic;

public class GameCreate {

	private static int module;

	public static GameMecanic get() {

		if (module == 1) {
			return new NotErr();
		} else {
			return new BestFive();
		}
	}

	public static void setModulo(int module) {
		GameCreate.module = module;
	}

}
