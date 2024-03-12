import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Você pode informar o número manualmente ou permitir a entrada do usuário
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean verificarFibonacci(int num) {
        if (num < 0) {
            return false; // A sequência de Fibonacci começa com 0, então números negativos não são considerados.
        }

        int a = 0;
        int b = 1;

        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == num;
    }
}
