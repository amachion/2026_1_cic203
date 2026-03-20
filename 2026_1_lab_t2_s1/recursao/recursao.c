#include <stdio.h>

float fatorial (int n) {
    //antes de mais nada: caso base = critério de parada
    if (n <= 1) return 1;
    return n * fatorial(n-1);
}
int fibonacci (int n) {
    if (n <= 1) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
}
int soma (int i, int n) {
    if (i == n) return n;
    return i + soma(i+1, n);
}
int main () {
    printf ("tamanho do float  %d\n", sizeof(float));
    // for (int i=0; i <= 15; i++) {
    //     printf ("fatorial de %d = %.0f\n", i, fatorial(i));
    // }
    // for (int i=0; i <= 40; i++)
    //     printf ("fib(%d) = %d\n", i, fibonacci(i));
    printf ("%d\n", soma(1, 10));
    return 0;
}