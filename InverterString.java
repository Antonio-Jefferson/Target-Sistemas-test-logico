import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string para inverter: ");
        String input = scanner.nextLine();

        String invertedString = inverterString(input);

        System.out.println("String original: " + input);
        System.out.println("String invertida: " + invertedString);

        scanner.close();
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            // Troca os caracteres no início e no fim
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Move os índices
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
