package questao3;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Questao3 {

    public static void main(String[] args) {
        try {
            JsonArray jsonArray = (JsonArray) JsonParser.parseReader(new FileReader("dados.json"));
            List<Double> valores = new ArrayList<>();
            
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject dia = jsonArray.get(i).getAsJsonObject();
                double valor = dia.get("valor").getAsDouble();
                if (valor > 0) { 
                    valores.add(valor);
                }
            }

            if (valores.isEmpty()) {
                System.out.println("Não há dados de faturamento.");
                return;
            }
            
            double menor = valores.get(0);
            double maior = valores.get(0);
            double soma = 0;

            for (double valor : valores) {
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > maior) {
                    maior = valor;
                }
                soma += valor;
            }

            double media = soma / valores.size();

            int diasAcimaDaMedia = 0;
            for (double valor : valores) {
                if (valor > media) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menor);
            System.out.println("Maior valor de faturamento: " + maior);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
