public class InputOutput4 {

    public static void main(String[] args){

        int a = 1, b = 10, c = 100;
        // %3d - mostra o valor justificando à direita em três posições (ou colunas) da tela do computador
        System.out.printf("'a' = %3d\n'b' = %3d\n'c' = %3d\n", a, a, c);

        // %8.2f - indica que um número de ponto flutuante será mostrado justificado à direita dentro de um campo de saída
        // de tamanho oito e com duas casas decimais de precisão fazendo arredondamentos
        double d = 135.4528;
        double e = 23050.568;
        double f = 5.0;
        System.out.printf("Variável 'd' = %8.2f\n", d);
        System.out.printf("Variável 'e' = %8.2f\n", e);
        System.out.printf("Variável 'f' = %8.2f\n", f);


    }
}
