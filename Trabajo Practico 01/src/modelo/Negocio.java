package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Negocio {
	
	private List<Producto> misProductos;
	private static Negocio n;
	
	private Negocio() {
		
	}
	
	public static Negocio getInstancia() {
		
	}
	
	public boolean addProducto(String codigo, Modelo m, int talle, double precio) {
		
	}
	
	public boolean addProducto(String codigo, int largo, String color, double precio) {
		
	}
	
	public void delAllProductos() {
		
	} 
	
	public List<Producto> getProducto(String parteCodigo){
		
	}
	
	public List<Producto> getProductoOP(String parteCodigo){
		
	}
	
	
	public List<Producto> getProducto(Modelo m){
		
	}
	
	public List<Producto> getProducto(int largoMenorA){
		
	}
	
	public double getTotal(Producto ... lista) {
		
	}
}
