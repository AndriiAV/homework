package model.entity;

import java.util.Arrays;

import main.*;

// import main.Accessory;

public class Bouquet {
	private Flower[] bouquet;
//	private Accessory accessory;
	private boolean basket;
	private boolean ribbon;
	private boolean wrapper;
	private BouquetAction bouquetAction;
	private BouquetPrice bouquetPrice;
	private BouquetSize bouquetSize;
	private BouquetStems bouquetStems;
	private Freshness freshness;
	
	public Bouquet(Flower[] bouquet, boolean basket, boolean ribbon, boolean wrapper, BouquetAction bouquetAction,
			BouquetPrice bouquetPrice, BouquetSize bouquetSize, BouquetStems bouquetStems, Freshness freshness) {
		this.bouquet = bouquet;
		this.basket = basket;
		this.ribbon = ribbon;
		this.wrapper = wrapper;
		this.bouquetAction = bouquetAction;
		this.bouquetPrice = bouquetPrice;
		this.bouquetSize = bouquetSize;
		this.bouquetStems = bouquetStems;
		this.freshness = freshness;
	}

	public Flower[] getBouquet() {
		return bouquet;
	}
	public void setBouquet(Flower[] bouquet) {
		this.bouquet = bouquet;
	}
	public boolean getBasket() {
		return basket;
	}
	public void setBasket(boolean basket) {
		this.basket = basket;
	}
	public boolean getRibbon() {
		return ribbon;
	}
	public void setRibbon(boolean ribbon) {
		this.ribbon = ribbon;
	}
	public boolean getWrapper() {
		return wrapper;
	}
	public void setWrapper(boolean wrapper) {
		this.wrapper = wrapper;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bouquet [bouquet=");
		builder.append(Arrays.toString(bouquet));
		builder.append(", basket=");
		builder.append(basket);
		builder.append(", ribbon=");
		builder.append(ribbon);
		builder.append(", wrapper=");
		builder.append(wrapper);
		builder.append(", bouquetAction=");
		builder.append(bouquetAction);
		builder.append(", bouquetPrice=");
		builder.append(bouquetPrice);
		builder.append(", bouquetSize=");
		builder.append(bouquetSize);
		builder.append(", bouquetStems=");
		builder.append(bouquetStems);
		builder.append(", freshness=");
		builder.append(freshness);
		builder.append("]");
		return builder.toString();
	}
	
	
}
