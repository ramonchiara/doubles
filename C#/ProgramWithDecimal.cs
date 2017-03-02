using System;

public class ProgramWithDecimal {

    public static void Main(string[] args) {
        decimal p = 0.1M;

        for (int limit = 10; limit <= 100000000; limit *= 10) {
            decimal s = 0;
            for (int i = 0; i < limit; i++) {
                s += p;
            }
            Console.WriteLine("limit: {0,9} --> {1,16}", limit, s);
        }
    }

}
