package aplicacao;

import java.util.Scanner;

import entidades.Contador;
import entidades.ParametrosInvalidosException;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		try {
			System.out.print("Digite o primeiro parâmetro: ");
			int parametroUm = ler.nextInt();
			System.out.print("Digite o segundo parâmetro: ");
			int parametroDois = ler.nextInt();

			Contador contador = new Contador(parametroUm, parametroDois);
			contador.contar();
			contador.impressao();
		} catch (ParametrosInvalidosException e) {
			System.out.println("Parâmetro incorreto: " + e.getMessage());
		}

		ler.close();
	}

}
