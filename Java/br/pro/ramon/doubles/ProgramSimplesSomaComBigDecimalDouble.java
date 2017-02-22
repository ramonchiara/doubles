package br.pro.ramon.doubles;

import java.math.BigDecimal;

public class ProgramSimplesSomaComBigDecimalDouble {

    public static void main(String[] args) {
        BigDecimal p = new BigDecimal(0.1);
        System.out.println(p);

        BigDecimal s = new BigDecimal(0.0);
        System.out.println(s);

        for (int i = 0; i < 10; i++) {
            s = s.add(p);
            System.out.println(s);
        }

        System.out.printf("Com printf, ele arredonda: %f%n", s);
        System.out.printf("Mas, cuidado, o valor em memória ainda é incorreto: %.20f%n", s);
    }

}
