package br.com.xti.poo;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Roberto";
		conta.saldo = 20_000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Jessica";
		destino.saldo = 12_000.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1_500.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
		/*
		conta.saca(1000);
		conta.exibeSaldo();
		
		conta.deposita(500);
		conta.exibeSaldo();
		*/
	}

}
