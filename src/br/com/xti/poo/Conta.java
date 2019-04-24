package br.com.xti.poo;

public class Conta implements java.io.Serializable {

	String cliente;
	 double saldo; //transient não mostra o valor
	
	public Conta() {}
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	public String getCliente() {return cliente;}
	public double getSaldo() {return saldo;}
	
	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
		
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	public void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
