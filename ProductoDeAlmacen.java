package practico8;

public class ProductoDeAlmacen extends Producto implements IOpercaionesIva{

	
	private String ProductoDeAlmacen;
		
	ProductoDeAlmacen(String ProductoDeAlmacenint, String marca, int precio){
		super(marca, precio);
		this.setProductoDeAlmacen(ProductoDeAlmacen);
		this.calcularIva(calcularIva);
	}
	
		

	private void calcularIva(double calculariva) {
		
	}



	ProductoDeAlmacen(){
		
	}

	public String getProductoDeAlmacen() {
		return ProductoDeAlmacen;
	}

	public void setProductoDeAlmacen(String productoDeAlmacen) {
		ProductoDeAlmacen = productoDeAlmacen;
	}



	@Override
	public String toString() {
		return "ProductoDeAlmacen [ProductoDeAlmacen=" + ProductoDeAlmacen + ", getProductoDeAlmacen()="
				+ getProductoDeAlmacen() + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	


	
		
	
	

	

	
	
}
