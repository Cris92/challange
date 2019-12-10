package it.challange.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

	private Long id;
	private String name;
	private double price;
	private int quantityAvailable;
	private int quantityAvailableAtStore;
	private int timeDaysToShip;
	private int quantityRequested;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public int getQuantityAvailableAtStore() {
		return quantityAvailableAtStore;
	}

	public void setQuantityAvailableAtStore(int quantityAvailableAtStore) {
		this.quantityAvailableAtStore = quantityAvailableAtStore;
	}

	public int getTimeDaysToShip() {
		return timeDaysToShip;
	}

	public void setTimeDaysToShip(int timeDaysToShip) {
		this.timeDaysToShip = timeDaysToShip;
	}

	public int getQuantityRequested() {
		return quantityRequested;
	}

	public void setQuantityRequested(int quantityRequested) {
		this.quantityRequested = quantityRequested;
	}
}
