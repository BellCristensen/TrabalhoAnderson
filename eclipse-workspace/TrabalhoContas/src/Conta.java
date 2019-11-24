public class Conta {
	int agencia;
	int numeroConta;
	String titular;
	double saldo;
	double tarifa;
	double quantidadeSaque;
	
	public void depositar(double Deposito) {
		this.saldo = Deposito + this.saldo;
	}
	
	public void sacar(double saque) {
		if (saque > this.saldo) {
			System.out.println("Saque indisponível");
		} else {
			this.saldo = this.saldo - saque + quantidadeSaque;

		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void QuantidadeSaque() {
		this.quantidadeSaque = this.quantidadeSaque + 1;
	}
		
		
	public double getQuantidadeSaque() {
		return this.quantidadeSaque;
	}
		
	
}
