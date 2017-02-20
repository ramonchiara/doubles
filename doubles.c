#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    double p = 0.1;

    for (int limit = 10; limit <= 100000000; limit *= 10) {
        double s = 0;
        for (int i = 0; i < limit; i++) {
            s += p;
        }
        printf("limit: %9d --> %15f\r\n", limit, s);
    }

    return 0;
}
