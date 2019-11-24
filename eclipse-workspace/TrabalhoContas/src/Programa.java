public class Programa {
	public static void main(String[] args) {
		
		//Conta Corrente//
		ContaCorrente Anderson = new ContaCorrente();
		Anderson.agencia = 111;
		Anderson.numeroConta = 111;
		Anderson.titular = "Anderson";
		Anderson.depositar(100);
		Anderson.sacar(10);
		System.out.println(Anderson.titular + ", o saldo da sua conta corrente: é " + Anderson.getSaldo());
		
		//Conta Salario//
		ContaSalario Cristina = new ContaSalario();
		Cristina.agencia = 222;
		Cristina.numeroConta = 222;
		Cristina.titular = "Cristina";

		Cristina.depositar(1000);
		Cristina.sacar(500);
		System.out.println(Cristina.titular + ", o saldo da sua conta salario: é " + Cristina.getSaldo());
		
		//Conta Poupanca//	
		ContaPoupanca Maria = new ContaPoupanca();
		Maria.agencia = 333;
		Maria.numeroConta = 333;
		Maria.titular = "Maria";

		Maria.depositar(2000);
		Maria.sacar(20);
		System.out.println(Maria.titular + ", o saldo da sua conta poupança: é " + Maria.getSaldo());
	}
}
