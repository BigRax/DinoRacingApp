package app.importers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import app.objects.*;

public class DinoImporter {

	public ArrayList<Dino> loadDinos() {
		ArrayList<Dino> dinos = new ArrayList<Dino>();
		try {
			File file = new File("resources/Dinos.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				//TODO populate dino  from string
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return dinos;
		
	}
	public void saveDinos(ArrayList<Dino> dinos) {
		//TODO Save dinos
	}
	
	private Dino convertStringToDino(String s) {
		Dino d = new Dino();
		
		
		return d;
	}
}
