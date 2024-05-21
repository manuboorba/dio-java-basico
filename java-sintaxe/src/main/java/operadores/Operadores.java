package operadores;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {

        //operador de atribuição

            String nome = "MANUELA";
            int idade = 24;
            double peso = 49.5;
            char sexo = 'F';
            boolean doadorOrgao = true;
            Date dataNascimento = new Date();


        //operador aritmético

            double soma = 10.5 + 15.7;
            int subtração = 113 - 25;
            int multiplicacao = 20 * 7;
            int divisao = 15 / 3;
            int modulo = 18 % 3;
            double resultado = (10 * 7) + (20/4);


            //--> qual o resultado das expressoes abaixo?

                String concatenacao ="?";

                concatenacao = 1+1+1+"1";

                System.out.println(concatenacao);

                concatenacao = 1+"1"+1+1;

                System.out.println(concatenacao);

                concatenacao = 1+"1"+1+"1";

                System.out.println(concatenacao);

                concatenacao = "1"+1+1+1;

                System.out.println(concatenacao);

                concatenacao = "1"+(1+1+1);

                System.out.println(concatenacao);


        //operadores unários

            int numero = 5;

                //--> imprimindo o numero negativo
                            System.out.println(- numero);

                //--> incrementando numero em mais 1 numero, imprime 6
                            numero ++;
                            System.out.println(numero);

                //--> incrementando numero em mais 1 numero, imprime 7
                            System.out.println(numero ++);// errado

                            System.out.println(numero);// agora sim, numero virou 7

                //--> ordem de precedencia conta aqui
                            System.out.println(++ numero);

                            boolean verdadeiro = true;

                            System.out.println("Inverteu " + !verdadeiro);


    }
}
