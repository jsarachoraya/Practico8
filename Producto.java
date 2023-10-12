package practico8;
//Superclase Abstracta
public abstract class Producto {
	//Atributos
	private String marca;
	private int precio;
	
	//Constructor
	Producto(String marca, int precio){
		this.marca = marca;
		this.precio = precio;
	}
	
	//Sobrecarga
	Producto(){
		
	}
	
	//Getters y Setters
	public String getNombre() {
		return this.marca;
	}
	public void setNombre(String nombre) {
		this.marca = nombre;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//To
	public String toString() {
		return "El producto es : " + this.marca + "y el precio es: " + this.precio;
	}
	
	
}
