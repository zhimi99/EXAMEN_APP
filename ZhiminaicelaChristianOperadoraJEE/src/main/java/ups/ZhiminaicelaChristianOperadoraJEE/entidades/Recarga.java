package ups.ZhiminaicelaChristianOperadoraJEE.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recarga implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String numero;
	private String cedula;
	private int cuenta;
	private double saldo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Recarga [id=" + id + ", numero=" + numero + ", cedula=" + cedula + ", cuenta=" + cuenta + ", saldo="
				+ saldo + "]";
	}
	
	
}
