#include <stdio.h>
#include <stdlib.h>
int main () {
    int i; // i é um inteiro
    int *v; // v é um ponteiro de inteiros
    printf ("tamanho da variavel v: %d\n", sizeof(v));
    printf ("valor de v: %p\n", v);
    printf ("valor de i: %d\n", i);
    return 0;
}