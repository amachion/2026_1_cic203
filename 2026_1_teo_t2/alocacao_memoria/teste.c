#include <stdio.h>
void f1 (int v[]) {
    int t = sizeof(*v) / sizeof(int);
    printf ("%d\n", t);
}
int main () {
    
    int v[10];
    f1(v);
    return 0;
}