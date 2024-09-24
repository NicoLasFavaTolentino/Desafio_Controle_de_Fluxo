import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = sc.nextInt();

        try {
            //Chamando o método contendo a lógica de contagem
            contar(primeiroParametro, segundoParametro);
        }catch (ParametrosInvalidosException exception){
            // Imprime a mensagem de erro se a exceção for lançada
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        //Validar se primeiroParametro é Maior que segundoParametro e lançar a exceção
        if (primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }
        int contagem = segundoParametro - primeiroParametro;

        //Realiza o "for" para imprimir os números
        for (int x = 1; x <= contagem; x++){
            System.out.println("Imprimindo o número " + x);
        }

    }
}
