package br.pro.ramon.doubles;

public class Program {

    public static void main(String[] args) {
        double p = 0.1;

        for (int limit = 10; limit <= 100000000; limit *= 10) {
            double s = 0;
            for (int i = 0; i < limit; i++) {
                s += p;
            }
            System.out.printf("limit: %9d --> %15f%n", limit, s);
        }
    }

}
