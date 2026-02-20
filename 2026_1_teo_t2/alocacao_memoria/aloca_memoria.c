#include <stdio.h>

int main() {
    int i;
    printf("i = %d\n", i);
    printf("endereco de i: %p\n", &i);
    printf("tamanho do int para este compilador: %d\n", sizeof(i));
    return 0;
}
