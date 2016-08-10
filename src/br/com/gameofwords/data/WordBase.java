package br.com.gameofwords.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class WordBase{
	
	
	
	private String[] words;
	
	
	public void loadFile() {
		File file = new File("file-source/dictionary.txt");
		try{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while (br.ready()) {
			words = br.readLine().split(";");
			
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public String getNextWord(){
		Random r = new Random(System.currentTimeMillis());
		int referencia = r.nextInt(words.length),
				indice = referencia;
		
		
		return words[Math.abs(indice)];
	}
}
