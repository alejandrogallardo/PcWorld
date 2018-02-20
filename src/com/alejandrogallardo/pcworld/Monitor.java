package com.alejandrogallardo.pcworld;

public class Monitor {
	
	private final int idMonitor;
	private String marca;
	private double size;
	private static int contadorMonitores;
	
	private Monitor() {
		idMonitor = ++contadorMonitores;
	}
	public Monitor (String marca, double size) {
		this();
		this.marca = marca;
		this.size = size;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Monitor {" + "idMonitor: " + idMonitor +", Size: " + size + ", Marca: " + marca + "}";
	}
}
