#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    long double p = 0.1;

    for (long limit = 10; limit <= 1000000000; limit *= 10) {
        long double s = 0;
        for (int i = 0; i < limit; i++) {
            s += p;
        }
        printf("limit: %11ld --> %17Lf\r\n", limit, s);
    }

    return 0;
}
