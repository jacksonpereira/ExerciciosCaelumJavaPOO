package capitulo4;

public class Conta {
	
//	Properties
	private String nomeTitular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;
	
//	Getters and setters
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Data getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
//	Methods
	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", dataAbertura=" + dataAbertura + "]";
	}
	
	public void saca(double valor) {
		if((this.saldo-valor)>=00.00) {
			this.saldo-=valor;
			System.out.println("Saque realizado!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void deposita(double valor) {
		this.saldo+=valor;
		System.out.println("Depósito realizado!");
	}
	
	public double calcularRendimento() {
		return this.saldo*0.1;
	}
	
	public String recuperarDadosParaImpressao() {
		return this.dataAbertura.formatada();
	}
	
}
