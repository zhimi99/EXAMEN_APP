package ups.ZhiminaicelaChristianCajeraJEE.entidades;


public class Recarga {
	
	private String numero;
	private String cedula;
	private int cuenta;
	private double saldo;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	@Override
	public String toString() {
		return "Recarga [numero=" + numero + ", cedula=" + cedula + ", cuenta=" + cuenta + ", saldo=" + saldo + "]";
	}

}
