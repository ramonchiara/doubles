package br.pro.ramon.doubles;

import java.math.BigDecimal;

public class ProgramComBigDecimalDouble {

    public static void main(String[] args) {
        BigDecimal p = new BigDecimal(0.1);

        for (int limit = 10; limit <= 100000000; limit *= 10) {
            BigDecimal s = new BigDecimal(0);
            for (int i = 0; i < limit; i++) {
                s = s.add(p);
                System.out.println(s);
            }
            System.out.printf("limit: %9d --> %15f%n", limit, s);
        }
    }

}
