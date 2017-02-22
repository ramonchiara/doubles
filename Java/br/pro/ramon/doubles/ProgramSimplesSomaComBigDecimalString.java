package br.pro.ramon.doubles;

import java.math.BigDecimal;

public class ProgramSimplesSomaComBigDecimalString {

    public static void main(String[] args) {
        BigDecimal p = new BigDecimal("0.1");
        System.out.println(p);

        BigDecimal s = new BigDecimal(0.0);
        System.out.println(s);

        for (int i = 0; i < 10; i++) {
            s = s.add(p);
            System.out.println(s);
        }

        System.out.printf("Com printf, ele arredonda: %f%n", s);
        System.out.printf("Mas, mesmo assim, como passei 0.1 como String, o valor em memória fica correto: %.20f%n", s);
    }

}
