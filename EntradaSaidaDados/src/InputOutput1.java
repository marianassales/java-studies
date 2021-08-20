import java.util.Scanner;

public class InputOutput1 {

    public static void main(String[] args) {

        /* SCANNER CLASS
        Pacote java.util possui a classe scanner, que implementa operações de entrada de dados
        e possui métodos como:
         */

/*        // Instanciar e criar um objeto Scanner usando o dispositivo padraõ de entrada (System.in)
        Scanner ler = new Scanner(System.in);

        // Utilizando métodos da classe Scanner adequados aos tipos de variavéis
        int n;
        double preco;
        String palavra;
        String frase;

        // Lendo um valor inteiro
        System.out.printf("Informe um número:\n");
        n = ler.nextInt();

        // Lendo um valor real
        System.out.printf("Informe o preço:\n");
        preco = ler.nextDouble();

        // Lendo uma string
        System.out.printf("Informe uma palavra:\n");
        palavra = ler.next();

        // Lendo uma string
        System.out.printf("Informe uma frase:\n");
        frase = ler.next();

    }
 */


    Scanner ler = new Scanner(System.in);
    int a, b;

        System.out.printf("Informe o primeiro valor: ");
    a =ler.nextInt();

        System.out.printf("Informe o segundo valor: ");
    b =ler.nextInt();

        System.out.printf("\nResultados:\n");
        System.out.printf("%d + %d = %3d\n",a,b,(a +b));
        System.out.printf("%d - %d = %3d\n",a,b,(a -b ));
        System.out.printf("%d * %d = %3d\n",a,b,(a *b));
        System.out.printf("%d / %d = %3d\n",a,b,(a /b));
        System.out.printf("%d / %d = %6.2f\n",a,b,((double)a /b));

}


}
