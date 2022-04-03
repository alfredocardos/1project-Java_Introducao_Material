package pacote_introducao.teste;

public class Exercicios_Condicionais {
    public static void main(String[] args) {
      int x= 11;
      int y=13;
      while (x ==0 || y==0) {
          double result = 0;
          if (x % 2 == 0 || y % 2 == 0) {
              result = (x + y) / 2;
          } else {
              System.out.println("irregular");
          }
          System.out.println(result);


      }
    }
}

// double salario = 1500
// String classe = salario <=1200? "sou pobre": salario >1200 && ,=5000?"sou media": "sou rico";
//sout(classe);