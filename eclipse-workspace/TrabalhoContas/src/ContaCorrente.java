public class ContaCorrente extends Conta {
	
	@Override
	public void sacar(double saque) {
		if (saque <= 0 ) {
			System.out.println("Saque indisponível");
		} else {
			if (getQuantidadeSaque() <= 5) {
				tarifa = 28;
				super.sacar(saque + tarifa);

			} else if (getQuantidadeSaque() <= 10) {
				tarifa = 45;
				super.sacar(saque + tarifa);

			} else {
				tarifa = 60;
				super.sacar(saque + tarifa);

			}

		}

	}
}
					

