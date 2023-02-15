package POO;

import java.util.HashMap;
import java.util.Scanner;

public class TesteNumero {
    public static void main(String[] args) {
        
        Numero n = new Numero();

        boolean continuar = true;

        Scanner scan = new Scanner(System.in);
        while(continuar) {
            double x;
            double y;
            int operacao = 0;


            System.out.println("Digite a operação que deseja realizar: "
            +                   "\n1 para soma"
            +                   "\n2 para subtração"
            +                   "\n3 para multiplicação"
            +                   "\n4 para divisão"
            +                   "\nou 0 para finalizar o programa"
            );

            operacao = scan.nextInt();

            if (operacao == 0){
                continuar = false;
                return;

            }

            System.out.println("Informe o valor do primeiro número: ");   
         x = scan.nextDouble(); 

        System.out.println("Informe o valor do segundo número ");
         y = scan.nextDouble();
        
         switch (operacao) {
            case 1:
                imprimeCauculadora(operacao,n.soma(x, y), x, y);
                break;
            case 2:
                imprimeCauculadora(operacao,n.subtracao(x, y), x, y);
                break;
            case 3:
                imprimeCauculadora(operacao,n.multiplicacao(x, y), x, y);
                break;
            case 4:
                imprimeCauculadora(operacao,n.divisao(x, y), x, y);
                break;
        
                
        }

        }

        
        scan.close();
    }

    static void imprimeCauculadora(int operacao, double resultado, double x, double y)
    {
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, " somado com ");
        mapOperacao.put(2, " subtraido por ");
        mapOperacao.put(3, " multiplicado por ");
        mapOperacao.put(4, " dividido por ");

        System.out.println("\n O resultado de " + x + mapOperacao.get(operacao) + y + 
        " é igual a " + resultado + ".\n1");
    }
    
}
