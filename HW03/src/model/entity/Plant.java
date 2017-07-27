package model.entity;

public abstract class Plant {
	public int price;
	public enum Stems {
		WITHOUT_STEMS,	//Без стеблей
		SHORT_STEMS,	//Короткие стебли
		MIDDLE_STEMS,	//Средние стебли
		LONG_STEMS		//Длинные стебли
		}		
}
