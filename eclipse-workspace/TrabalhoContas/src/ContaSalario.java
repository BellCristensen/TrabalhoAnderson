public class ContaSalario extends Conta {
	
	@Override
	public void sacar(double saque) {
		tarifa = 0;
		if (saque <= 0) {
			System.out.println("Valor Saque indisponivel");
		} else {
			if (getQuantidadeSaque() > 1) {

				tarifa = 50;
				super.sacar(saque + tarifa);
			} else {
				tarifa = 0;
				super.sacar(saque + tarifa);
			}
		}

	}

}

