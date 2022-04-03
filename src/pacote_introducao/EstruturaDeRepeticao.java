package pacote_introducao;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        /*
        int contador = 0;
        while (contador <=10){            while
        sout (contador) }
        contador++


 int contador = 0;
        do {
        sout (contador)}
       while (contador <=10);      do while
        contador++;

         */

        int tabuada = 5;
        for (int x = 1; x <= 10; x++) { //contador positivo
           int result = tabuada * x;
           if (result > 40){
               break;
           }
            System.out.println(tabuada+" x "+ x+ "="+ result);


        }




    }
    }

