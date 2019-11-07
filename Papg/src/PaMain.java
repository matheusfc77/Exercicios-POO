import java.util.Scanner;

public class PaMain {

	public static void main(String[] args) {
		Pa prog = new Pa();
		boolean ok = true;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Deseja importar alguma progressão já gerada? Sim (1)  Não (2)");
		int b = entrada.nextInt();

		switch (b) {
		case 1:
			System.out.println("Digite exatamente o nome do arquivo, sem o tipo (.json)");
			Gravajson gravar = new Gravajson(entrada.next());
			prog = new Pa(gravar.ler());
			System.out.println(prog.pinalterada() + "% inalterado");
			System.out.println(prog);

			System.out.println("Deseja gerar um gráfico com os valores? 1 SIM / 2 NÃO");
			int aux = entrada.nextInt();

			if (aux == 1) {
				gravar.geragrafico();
				System.out.println("Gráfico gerado");
			} else {
				System.out.println("OK");
			}
			break;
		}

		prog = new Pa();
		while (ok) {
			System.out.println("Informe se deseja criar uma PA(1) ou PG(2). SAIR (3) ");
			int a = entrada.nextInt();
			prog = new Pa();
			switch (a) {
			case 1:
				prog.setTipo(Progressoes.aritmetica);
				break;

			case 2:
				prog.setTipo(Progressoes.geometrica);
				break;

			case 3:
				ok = false;
				break;

			default:
				System.out.println("Valor invalido, amor!");
				break;
			}
			if (ok != false) {
				System.out.println("Ok! Agora digite qual será o valor inicial: ");
				prog.setValorinicial(entrada.nextDouble());
				System.out.println("Digite agora a razão: ");
				prog.setRazao(entrada.nextDouble());
				System.out.println("Digite a quantidade de termos desejados: ");
				prog.setQuantidade(entrada.nextDouble());
				System.out.println("Qual será o nome do arquivo gerado?");
				Gravajson grava = new Gravajson(entrada.next());
				prog.geraProg();
				grava.gravar(prog.getValores());
				grava.geragrafico();
			}
			System.out.println("Adeus!");
		}
		entrada.close();
	}

}
