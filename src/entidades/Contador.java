package entidades;

public class Contador {

	private int parametroUm;
	private int parametroDois;

	public Contador(int parametroUm, int parametroDois) {
		this.parametroUm = parametroUm;
		this.parametroDois = parametroDois;
	}

	public int getParametroUm() {
		return parametroUm;
	}

	public void setParametroUm(int parametroUm) {
		this.parametroUm = parametroUm;
	}

	public int getParametroDois() {
		return parametroDois;
	}

	public void setParametroDois(int parametroDois) {
		this.parametroDois = parametroDois;
	}

	public int contar() {
		int resultado = parametroDois - parametroUm;
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}
		return resultado;
	}

	public void impressao() {
		for (int i = 1; i <= contar(); i++) {
			System.out.println("Imprimindo o número: " + i);
		}
	}

}
