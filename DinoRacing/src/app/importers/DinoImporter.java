package app.importers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import app.enums.DinoBreed;
import app.enums.Operation;
import app.objects.*;

/**
 * RacedID|Dino name|Breed|Active|OddsOperation|oddsvalue
 * 
 * @author SKalmes Home
 *
 */
public class DinoImporter {
	private File file = new File("resources/Dinos.txt");

	public ArrayList<Dino> loadDinos() {
		ArrayList<Dino> dinos = new ArrayList<Dino>();
		try {

			FileReader fileReader = new FileReader(file);
			StringTokenizer tokenizer;
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				tokenizer = new StringTokenizer(line, "|");
				Dino d = new Dino();
				d.setRaceNumber(Integer.getInteger(tokenizer.nextToken()));
				d.setDinoName(tokenizer.nextToken());
				d.setBreed(findBreed(tokenizer.nextToken()));

				if (tokenizer.nextToken().equalsIgnoreCase("T")) {
					d.setActive(true);
				} else {
					d.setActive(false);
				}
				DinoOdds odds = new DinoOdds();
				if (tokenizer.nextToken().equalsIgnoreCase("*")) {
					odds.setOperation(Operation.MULTIPLY);
				} else {
					odds.setOperation(Operation.DIVIDE);
				}

				odds.setValue(Integer.getInteger(tokenizer.nextToken()));
				d.setOdds(odds);
				dinos.add(d);
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dinos;

	}

	private DinoBreed findBreed(String b) {
		switch (b) {
		case "Young Allosaurus":
			return DinoBreed.YoungAllosaurus;
		case "Deinonychus":
			return DinoBreed.Deinonychus;
		case "Dimetrodon":
			return DinoBreed.Dimetrodon;
		case "Hadrosaurus":
			return DinoBreed.Hadrosaurus;
		case "Other":
			return DinoBreed.Other;
		case "Young Triceratops":
			return DinoBreed.YoungTriceratops;
		case "Young Tyrannosaurus":
			return DinoBreed.YoungTyrannosaurus;
		default:
			return null;
		}
	}

	public void saveDinos(ArrayList<Dino> dinos) {
		String line = "";

		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			for (Dino d : dinos) {
				line = d.getFileLine();
				bw.write(line);
				bw.newLine();
			}

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
