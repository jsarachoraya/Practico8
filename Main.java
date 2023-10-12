package practico8;

import java.util.HashSet;

public class Main {


	public static void main(String[] args) {
		
		HashSet<String>ProductoDeAlmacen = new HashSet<>();
		 ProductoDeAlmacen.add("Azucar Ledesma $453");
		 ProductoDeAlmacen.add("Yerba Mate Rosamonte $530");
		 ProductoDeAlmacen.add("Harina Blancaflor $365");
		 ProductoDeAlmacen.add("Leche La Serenisima $655");
		 ProductoDeAlmacen.add("Queso Cremoso La Paulina $986");
		 ProductoDeAlmacen.add("Galletas Saladas Express $223");
		
		ProductoDeAlmacen.forEach((item) -> System.out.println(item));
		
		
	}

	

	
}
