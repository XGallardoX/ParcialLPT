#include <stdio.h>

int main() {
    long long sum = 0;
    for (long long i = 1; i <= 1000000000; i++) {
        sum += i;
    }
    printf("Sum: %lld\n", sum);
    return 0;
}
