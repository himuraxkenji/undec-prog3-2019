package modelo;

public class Zapato extends Producto{

	private int miTalle;
	private Modelo miModelo;

	public Zapato(String codigo, Modelo m, int talle, double precioInicial) {

		super (codigo);
		this.cambiarPrecio(precioInicial);
		this.miTalle=talle;
		this.miModelo=m;


	}

	public Zapato(String codigo, Modelo m, double precioInicial) {
		super (codigo);
		this.miModelo=m;
		this.cambiarPrecio(precioInicial);
		this.miTalle=-1;
	}

	public boolean modificarPrecio(double valor) {
		return super.cambiarPrecio(valor);



	}



	public Modelo getMiModelo() {

		return miModelo;
	}

	@Override
	public String toString() {
		if (this.miModelo.equals(Modelo.Nautico)) {
			if (this.miTalle>=0&& this.miTalle<=9) {
				return "ZN"+this.getCodigo()+"t0"+this.miTalle+" "+this.getLastPrecio();
			}else {
				if (this.miTalle>9) {
					return "ZN"+this.getCodigo()+"t"+this.miTalle+" "+this.getLastPrecio();
				}else {
					if (this.miTalle<0) {
						return "ZN"+this.getCodigo()+"tST"+" "+this.getLastPrecio();
					}

				}
			}
		}else {
			if (this.miModelo.equals(Modelo.Bota)) {
				if (this.miTalle>=0&& this.miTalle<=9) {
					return "ZB"+this.getCodigo()+"t0"+this.miTalle+" "+this.getLastPrecio();
				}else {
					if (this.miTalle>9) {
						return "ZB"+this.getCodigo()+"t"+this.miTalle+" "+this.getLastPrecio();
					}else {
						if (this.miTalle<0) {
							return "ZB"+this.getCodigo()+"tST"+" "+this.getLastPrecio();
						}

					}
				}

			}else {
				if (this.miModelo.equals(Modelo.Sandalia)) {
					if (this.miTalle>=0&& this.miTalle<=9) {

						return "ZZ"+this.getCodigo()+"t0"+this.miTalle+" "+this.getLastPrecio();
					}else {
						if (this.miTalle>9) {
							return "ZZ"+this.getCodigo()+"t"+this.miTalle+" "+this.getLastPrecio();
						}else {
							if (this.miTalle<0) {
								return "ZZ"+this.getCodigo()+"tST"+" "+this.getLastPrecio();
							}

						}
					}
				}
			}
		}
		return "";

	}

}
