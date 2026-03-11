#include <stdio.h>
#include <stdlib.h>

typedef struct no {
    int info;
    struct no * proximo;
} t_no;

int main () {
    t_no no1, no2;
    printf ("tamanho da estrutura no: %d\n", sizeof(t_no));

    no1.info = 10;
    no1.proximo = &no2;
    no2.info = 20;
    no2.proximo = NULL;

    printf ("no1: info = %d, proximo = %p\n", no1.info, no1.proximo);
    no1.proximo->info = 50;
    printf ("no2: info = %d, proximo = %p\n", no2.info, no2.proximo);

    struct no * p_no1;
    t_no * p_no2;

    
    p_no1 = (t_no *) malloc (sizeof(t_no));
    p_no1->info = 27;
    printf ("endereco onde foi alocado o novo no: %p\n", p_no1);
    printf ("informacao aramazenada la: %d\n", p_no1->info);
    printf ("e o ponteiro para o proximo? %p\n", p_no1->proximo);
    return 0;
}