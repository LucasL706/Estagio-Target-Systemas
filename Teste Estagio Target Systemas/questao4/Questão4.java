package questao4;
public class Questão4
{
    public static void main(String[] args){
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;
        Percentual p = new Percentual();
        System.out.println("sp :" + p.percentual(sp, total) + "%");
        System.out.println("rj :" + p.percentual(rj, total)+ "%");
        System.out.println("mg :" + p.percentual(mg, total)+ "%");
        System.out.println("es :" + p.percentual(es, total)+ "%");
        System.out.println("outros :" + p.percentual(outros, total)+ "%");
    }
}
