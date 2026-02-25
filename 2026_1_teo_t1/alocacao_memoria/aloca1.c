#include <stdio.h>
#include <stdlib.h>
int main() {
    int a = 10;
    printf ("valor de a: %d\n", a);
    //uso do operador sizeof -> resolvido em tempo de compilação
    printf ("tamanho do a: %d bytes\n", sizeof(a));
    //uso do operador de referência &
    printf ("endereco de a: %p\n", &a);
    system("pause");
    return 0;
}
