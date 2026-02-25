#include <stdio.h>
int main() {
    int v[1000000]; //estoura a capacidadeda alocação estática
    printf ("v = %p\n", v);
    printf ("tamanho do \"v\": %d bytes\n", sizeof(v));
    return 0;
}
