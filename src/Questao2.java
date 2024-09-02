/* 
 * Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
 * IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
*/

import java.util.*;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite qualquer coisa (Somente letras):");
        String texto = entrada.nextLine();

        entrada.close();

        // Conta a ocorrência de 'A' e 'a' na string
        for (char caractere : texto.toCharArray()) {
            if (caractere == 'A' || caractere == 'a') {
                contador++;
            }
        }

        
        // Verifica e imprime o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece no texto.");
        }
    }
}