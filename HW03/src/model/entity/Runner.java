package model.entity;

import main.PlantFlower;
import main.PlantNotFlower;
import model.entity.Plant.Stems;

public class Runner {

	public static void main(String[] args) {
		Flower flower = new Flower(false, false, PlantFlower.MULTICOLOR, 100, Stems.WITHOUT_STEMS);
		System.out.println(flower);
		
		NotFlower notFlower = new NotFlower(PlantNotFlower.BUSH, 50, Stems.WITHOUT_STEMS);
		System.out.println(notFlower);

	}
}
