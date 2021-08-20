public class ArgumentosJava {

    // Argumentos são variáveis especificadas entre parênteses na chamada de um método;
    // e os parâmetros são variáveis declaradas no cabeçalho do método para indicar os valores que o método deve receber quando for chamado.

    public static void main(String[] args) {
        calculate(10, 5);  // 10 e 5 são os ARGUMENTOS
    }

    static void sum(int x, int y) {
        // static void é a declaração padrão
        // sum é o nome da função (geralmente verbos)
        // () para definir o que chegará na função => PARÂMETROS
        // (tipo nomeDaVariavel)
        // {} bloco de código que será executado
    }


    static void calculate(int x, int y){      //
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x-y);
        System.out.println(x/y);

    }

}

