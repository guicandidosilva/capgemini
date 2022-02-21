import java.util.Scanner;


public class escada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Aqui irá imprimir na tela tudo o que está entre aspas
        System.out.print("Digite a quantidade de degraus: ");

        // Aqui a variável qtdDegraus irá receber o número inteiro digitado
        int qtdDegraus = entrada.nextInt();

        //Aqui foi criado as variáveis linha e coluna do tipo inteiro
        int linha, coluna;
        // A variável linha recebe p valor de -1
        linha = 0;
        // Aqui incia o método while: enquanto a variável linha for menor que o número digitado irá
        // reproduzir a sequencia abaixo
        while (linha < qtdDegraus) {
            // A variável coluna recebe o valor de -1
            coluna = -1;
            // Aqui inicia outro método while: enquanto o valor da coluna for menor que o valor da linha
            // irá reproduzir os comandos abaixo
            while (coluna < linha) {
                //Aqui irá imprimir na tela o caracter asterisco
                System.out.printf( "*" );
                //Aqui o valor da variável coluna soma com + 1
                coluna += 1;
            }
            //Aqui irá pular uma linha quando terminar o processo do segundo while
            System.out.printf( "\n" );
            //Aqui o valor da variável linha soma com + 1
            linha += 1;
        }
    }
}
