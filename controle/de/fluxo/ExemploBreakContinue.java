public class ExemploBreakContinue {
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }
        /** O break imprime 1 e 2 e para no 3
         *  O continue imprime 1, 2, não imprime o 3, imprime 4 e 5
         */
    
        }
}
