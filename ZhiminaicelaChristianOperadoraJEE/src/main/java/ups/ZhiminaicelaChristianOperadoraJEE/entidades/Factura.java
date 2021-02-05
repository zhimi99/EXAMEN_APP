package ups.ZhiminaicelaChristianOperadoraJEE.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Factura implements Serializable  {

	@Id
	@Column(length = 10)
	private String cedula;
	private String numeroFactura;
	private double valor;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	@Override
	public String toString() {
		return "Factura [cedula=" + cedula + ", numeroFactura=" + numeroFactura + ", valor=" + valor + "]";
	}

	
	
}
