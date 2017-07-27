package model.entity;

import main.PlantFlower;

public class Flower extends Plant{
	private boolean necessaryFertilizing; 	//Необходима подкормка 
	private boolean needSupport;			//Необходима поддержка
	private PlantFlower flowerType;			//enum
	private Stems stems;					//enum from Plant

	public Flower(boolean necessaryFertilizing, boolean needSupport, PlantFlower flowerType, int price, Stems stems) {
		this.necessaryFertilizing = necessaryFertilizing;
		this.needSupport = needSupport;
		this.flowerType = flowerType;
		super.price = price;
		this.setStems(stems);
	}

	public boolean getNecessaryFertilizing() {
		return necessaryFertilizing;
	}

	public void setNecessaryFertilizing(boolean necessaryFertilizing) {
		this.necessaryFertilizing = necessaryFertilizing;
	}

	public boolean getNeedSupport() {
		return needSupport;
	}

	public void setNeedSupport(boolean needSupport) {
		this.needSupport = needSupport;
	}

	public PlantFlower getFlowerType() {
		return flowerType;
	}

	public void setFlowerType(PlantFlower flowerType) {
		this.flowerType = flowerType;
	}

	public Stems getStems() {
		return stems;
	}

	public void setStems(Stems stems) {
		this.stems = stems;
	}

	@Override
	public String toString() {
		return String.format("Flower [necessaryFertilizing=%s, needSupport=%s, FlowerType=%s, price=%s, stems=%s]",
				necessaryFertilizing, needSupport, flowerType, price, stems);
	}

}
