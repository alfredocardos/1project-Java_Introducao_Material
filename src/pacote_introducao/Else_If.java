package pacote_introducao;

public class Else_If {
    public static void main(String[] args) {
        // idade < 15 juvenil
        // idade >12 e <18 base
        // >18 profissional
        int idade = 15;
        String categoria;
        if (idade <15) {
            categoria = "juvenil";
            break;
        }

        else if (idade>=15 && idade <18){
               categoria = "base";
                break;
                 }

        else{
                categoria = "profissional";
            
              }
            System.out.println("parabens sua categoria é: "+ categoria);
             }
    }

    // METODOD TERNARIO PARA STRINGS -

       //int idade = 30;
        // String categoria = idade <18 ?"categoria juvenil": idade >=18 && idade<25 ? "categorial profissional" : "uefa";
       // System.out.println(categoria);


