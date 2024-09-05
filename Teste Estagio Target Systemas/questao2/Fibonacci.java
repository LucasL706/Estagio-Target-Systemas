package questao2;
public class Fibonacci
{
    int primeiro, segundo;
    Fibonacci(){
        primeiro = 0; segundo = 1;
    }
    
    String pertence(int n){
        if(verificar(primeiro, segundo, n)){
            return "O numero pertence a sequencia de Fibonacci";
        } else {
            return "O numero nao pertence a sequencia de Fibonacci";
        }
    }
    
    boolean verificar(int menorAnterior, int maiorAnterior, int n){
        if(n == maiorAnterior || n == menorAnterior){
            return true;
        } else {
            if(n < menorAnterior && n < menorAnterior){
                return false;
            } else{
                int novoMaior = menorAnterior + maiorAnterior;
                int novoMenor = maiorAnterior;
                return verificar(novoMenor, novoMaior, n);
            }
        }
    }
}
