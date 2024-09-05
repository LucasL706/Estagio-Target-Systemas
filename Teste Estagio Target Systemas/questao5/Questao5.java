package questao5;

import java.util.Scanner;

public class Questao5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        char[] caracteres = input.toCharArray();
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }
        String stringInvertida = new String(caracteres);
        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }
}
