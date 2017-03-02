using System;

public class Program {

    public static void Main(string[] args) {
        double p = 0.1;

        for (int limit = 10; limit <= 100000000; limit *= 10) {
            double s = 0;
            for (int i = 0; i < limit; i++) {
                s += p;
            }
            Console.WriteLine("limit: {0,9} --> {1,16}", limit, s);
        }
    }

}
