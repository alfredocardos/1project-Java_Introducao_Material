package pacote_introducao;

public class AulaSwiit {
    public static void main(String[] args) {
        int entrada = 3;
        switch (entrada) {
            //char, int, byt, short, enum, String
            case 1:
                int valor1 =9;
                String idade = valor1 >18?"entrada autorizada":"voce foi bloqueado";
                System.out.println(idade);
                break;


            default:
                System.out.println("entrada negada");
                break;


        }
    }
}
