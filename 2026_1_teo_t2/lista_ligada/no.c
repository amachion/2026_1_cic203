#include <stdio.h>
#include <stdlib.h>
typedef struct no {
    int info;
    struct no * proximo;
} t_no;

int main () {
    struct no no1;
    t_no no2;
    struct no *p1;
    t_no *p2;
    printf ("no1.info: %d, no1.proximo: %p\n", no1.info, no1.proximo);
    no1.info = 10;
    no1.proximo = &no2;

    printf ("tamanho do no: %d\n", sizeof(t_no));
    printf ("no1.info: %d, no1.proximo: %p\n", no1.info, no1.proximo);
    no1.proximo->info = 20;
    printf ("no2.info: %d, no2.proximo: %p\n", no2.info, no2.proximo);
    printf ("p1: %p\n", p1);
    p1->info = 100;
    printf ("p1->info: %d\n", p1->info);
    printf ("foi");

    p2 = (t_no *) malloc (sizeof(t_no));
    return 0;
}