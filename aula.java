import java.util.Scanner;
import java.util.HashMap;

public class aula{
    public static void main(String[] args) {
      HashMap<Integer, String> tabelaPrecos = new HashMap<>();
 tabelaPrecos.put(81781, "chocolate Preco:  4,50");
       tabelaPrecos.put( 81782, "suco Preco: 2,50");
       tabelaPrecos.put( 81783, "bala Preco: 1,50");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");

        int codigoDigitado = entrada.nextInt();

         if (tabelaPrecos.containsKey(codigoDigitado)) {
           String produtoInfo = tabelaPrecos.get(codigoDigitado);
           System.out.println("Produto localizado!" + produtoInfo);
       } else {
           System.out.println("Código de barras não encontrado, procure um funcionario.");
       }
        
       entrada.close();
    }
} 
