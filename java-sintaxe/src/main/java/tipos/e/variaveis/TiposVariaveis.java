package tipos.e.variaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal; // o número normal em algum momento pode ser superior aos 32000 que o short comporta (o int comporta mais que o short)
        // casting -> pega um tipo mais abrangente e converte para um tipo mais especifico pois é o tipo correspondente
        int numero = 5;

        int numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
//public class TipoDados {
//	public static void main(String[] args) {
//		byte idade = 123;
//		short ano = 2021;
//		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
//		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
//		float pi = 3.14F;
//		double salario = 1275.33;
//	}
//}
