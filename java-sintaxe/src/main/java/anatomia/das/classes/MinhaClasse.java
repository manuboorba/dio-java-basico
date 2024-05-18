package anatomia.das.classes;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá mundo");

        //variáveis: Tipo NomeBemDefinido = Atribuição (opcional em algus casos)

        int ano = 2021;

        ano = 2022;

        final String BR = "Brasil";

        //BR = "Brazil";

        double PI = 3.14;

        int ESTADOS_BRASILEIROS = 27;

        int ANO_2000 = 2000;

        //A variável toda escrita em maiúsculo supõe que é final, mas além da convenção de nome é preciso usar o "final"

        String meuNome = "Manuela";

        int anoFabricacao = 2022;

        boolean verdadeira = false;

        anoFabricacao = 2018;


        //métodos: TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

        //int somar (int numeroUm, int numero2);

        //String FormatarCep (long cep);   ERRO LINHAS 34 E 36!!!!!!


        // um método pode receber parâmetros de tipos diferentes e a resposta também pode ser de tipo diferente

        String primeiroNome = "Manuela";
        String segundoNome = "Cavalcanti";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto); //vai imprimir a variável que chamou o método que passou dois parâmetros
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
