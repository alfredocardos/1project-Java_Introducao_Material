package pacote_introducao.teste;

public class ExercicioContinue {
    public static void main(String[] args) {
        double valorcarro= 30000;
        for (int parcela = (int)valorcarro; parcela >=1 ; parcela--) { // contador negativo
            double valorparcela = valorcarro / parcela;
            if (valorparcela < 650){
                continue; // serve como um processo de filtragem para localizar um determinado valor ou posição
            }
            System.out.println(parcela + " = "+ valorparcela + "$");

            }

        }
    }

