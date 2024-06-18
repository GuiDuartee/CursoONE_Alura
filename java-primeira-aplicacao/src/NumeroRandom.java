import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        int resposta = -1;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 0 a 100");
        while (resposta != aleatorio) {
            resposta = leitura.nextInt();

            if (resposta != aleatorio) {
                if (resposta > aleatorio) {
                    System.out.println("Tente um número menor");
                } else {
                    System.out.println("Tente um número maior");
                }
            }

            tentativas++;
        }

        System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
    }
}
