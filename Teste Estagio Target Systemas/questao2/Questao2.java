package questao2;
import java.util.Scanner;
public class Questao2
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(new Fibonacci().pertence(n));
    }
}
