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
            double resultado1 = (10 * 7) + (20/4);


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

                //--> ordem de precedencia conta aqui!
                            System.out.println(++ numero);

                            boolean verdadeiro = true;

                            System.out.println("Inverteu " + !verdadeiro);


                //--> x repetição
                            numero = numero + 1; // pode fazer tambem: numero++;

                            System.out.println(numero); // essa operação toda pode ser feita assim: System.out.println( ++ numero);
                            // o incremento e decremento seguem a ordem, então se for ( -- numero) vai decrementar o numero, e se for (numero --) primeiro vai imprimir o numero e depois decrementar, a mesma coisa pro incremento


        //operador ternário

            int a, b;
            a = 6;
            b = 6;
            //String resultado = "";
            // exemplo de condicional utilizando a estrutura if/else
            // if(a==b)
            // resultado = "verdadeiro";
            // else
            // resultado = "falso";

            // mesma condicional, mas dessa vez utilizando o operador condicional ternário
            String resultado = (a==b) ? "verdadeiro" : "falso";

            System.out.println(resultado);


        // operadores relacionais

            int numero1 = 1;
            int numero2 = 2;

            if(numero1 > numero2)
                System.out.println("Numero 1 maior que numero 2");

            if(numero1 < numero2)
                System.out.println("Numero 1 menor que numero 2");

            if(numero1 >= numero2)
                System.out.println("Numero 1 maior ou igual que numero 2");

            if(numero1 <= numero2)
                System.out.println("Numero 1 menor ou igual que numero 2");

            if(numero1 != numero2)
                System.out.println("Numero 1 é diferente de numero 2");

            boolean simNao = numero1 == numero2;

            System.out.println("numero1 é igual a numero2? " + simNao);

            simNao = numero1 != numero2;

            System.out.println("numero1 é diferente de numero2? " + simNao);

                // para objetos é interessante usar o "equals":
            String nomeUm = "MANUELA";
            String nomeDois = new String("MANUELA");

            System.out.println(nomeUm.equals(nomeDois));


        // operadores lógicos

        boolean condicao1=true;

        boolean condicao2=false;

        // Aqui estamos utilizando o operador lógico E para fazer a união de duas expressões. É como se tivesse escrito: "se Condicao1 E Condicao2 forem verdadeiras, executar código"
                if(condicao1 && condicao2)
                    System.out.print("Os dois valores são verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
                if(condicao1 || condicao2)
                    System.out.print("Um dos valores é verdadeiro");
    }
}
