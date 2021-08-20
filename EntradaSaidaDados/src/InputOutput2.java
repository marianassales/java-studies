import java.io.IOException;
import java.util.Scanner;

public class InputOutput2 {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        // Instanciando e criando um objeto scanner

        String nome;
        char sexo;

        System.out.printf("Informe um nome:\n");
        nome = ler.nextLine();
        // Entrada de dados (string)

        System.out.printf("\nInforme o sexo (M/F): ");
        sexo = (char)System.in.read();
        // entrada de dados (caracteres)

        System.out.printf("\nResultado:\n");
        if ((sexo == 'M') || (sexo == 'm'))
             System.out.printf("Seja bem vindo, Sr. \"%s\".\n", nome);
        else System.out.printf("Seja bem vinda, Sra. \"%s\".\n", nome);


    }

}
