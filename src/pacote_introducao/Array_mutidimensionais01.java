package pacote_introducao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Array_mutidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[2][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < 2; j++) {
                System.out.print(dias[i][j] +" ");


            }

        }
    }
}

