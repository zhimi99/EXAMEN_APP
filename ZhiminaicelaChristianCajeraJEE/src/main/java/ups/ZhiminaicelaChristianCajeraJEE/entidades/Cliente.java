package ups.ZhiminaicelaChristianCajeraJEE.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cedula;
	private String nombres;
	private int cuenta;
	private String cedular;
	private double saldo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	public String getCedular() {
		return cedular;
	}
	public void setCedular(String cedular) {
		this.cedular = cedular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cedula=" + cedula + ", nombres=" + nombres + ", cuenta=" + cuenta + ", cedular="
				+ cedular + ", saldo=" + saldo + "]";
	}
	
	
}
