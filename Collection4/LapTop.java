package com.collection4;

public class LapTop 
{
	String brand;
	int price;
	int gb;
	boolean touchscreen;

	public LapTop(String brand, int price, int gb, boolean touchscreen) 
	{
		this.brand=brand;
		this.price=price;
		this.gb=gb;
		this.touchscreen=touchscreen;
	}

	@Override
	public String toString() {
		return "LapTop [brand=" + brand + ", price=" + price + ", gb=" + gb + ", touchscreen=" + touchscreen + "]";
	}

	
}
