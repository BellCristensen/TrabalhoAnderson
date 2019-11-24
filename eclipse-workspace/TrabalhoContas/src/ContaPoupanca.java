public class ContaPoupanca extends Conta {

	@Override
	public void sacar(double saque) {
		if (saque <= 0) {
			System.out.println("Valor Saque indisponivel");
		} else {
			if (getQuantidadeSaque() <= 3) {
				tarifa = 12;
				super.sacar(saque + tarifa);

			} else {
				tarifa = 20;
				super.sacar(saque + tarifa);
			}

		}

	}
}

