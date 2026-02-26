#include <stdio.h>
#include <stdlib.h>
int a;
int main () {
    int *v;
    while ((v = (int *)malloc(50000000 * sizeof(int))) != NULL) 
        printf ("passou: v = %p\n", v);
    return 0;
}