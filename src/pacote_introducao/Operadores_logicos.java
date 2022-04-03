package pacote_introducao;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Operadores_logicos {

    public static void main(String[] args) {
        // < > <= >= == !=
        boolean isDezDiferenteDeVinte = 10 != 10;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMaiorOuIgualVinte = 10 >= 2;
        System.out.println(isDezDiferenteDeVinte);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMaiorOuIgualVinte);

        // && (and) // (or)  ! (negação)

        //and (e)
        int idade = 25;
        double salario = 5000d;
        boolean isDentroDaLei = salario >= 3500 && idade >= 20;
        System.out.println("voce esta dentro da lei"+isDentroDaLei);

        //or (ou)
        float SalarioDaContaCorrente = 300f;
        float SalarioDaContaPoupanca = 6000f;
        double ValorPlaystationComprar = 5000d;
        boolean isComprarOPlay = SalarioDaContaCorrente > SalarioDaContaPoupanca || SalarioDaContaPoupanca > ValorPlaystationComprar;
        System.out.println(isComprarOPlay);
    }

}









