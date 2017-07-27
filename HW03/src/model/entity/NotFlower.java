package model.entity;

import main.PlantNotFlower;

public class NotFlower extends Plant{
	private PlantNotFlower notFlowerType;			//enum
	private Stems stems;					//enum from Plant

	public NotFlower(PlantNotFlower notFlowerType, int price, Stems stems) {
		this.notFlowerType = notFlowerType;
		super.price = price;
		this.setStems(stems);
	}

	public PlantNotFlower getNotFlowerType() {
		return notFlowerType;
	}

	public void setNotFlowerType(PlantNotFlower notFlowerType) {
		this.notFlowerType = notFlowerType;
	}

	public Stems getStems() {
		return stems;
	}

	public void setStems(Stems stems) {
		if (stems==Stems.WITHOUT_STEMS) {
			System.out.println("Minimum length is "+Stems.SHORT_STEMS);
			this.stems = Stems.SHORT_STEMS;
		} else
		this.stems = stems;
	}

	@Override
	public String toString() {
		return String.format("NotFlower [NotFlowerType=%s, price=%s, stems=%s]",
				notFlowerType, price, stems);
	}
}
