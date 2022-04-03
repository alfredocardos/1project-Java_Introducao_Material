package pacote_introducao.teste;

public class ExercicioBreak {
    public static void main(String[] args) {
        double valorcell = 2500;
        for (int parcela = 1; parcela <= 2500; parcela++) {
            double valordaparcela = valorcell / parcela;
                if (valordaparcela < 60) {
                    break; // para o sistema dada uma determinada função
                }
                    System.out.println( parcela +  " = " + valordaparcela);

            }


            }
        }



