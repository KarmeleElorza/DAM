#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>

int main()
{
    int n;

    printf("Enter a number:\n");
    scanf("%d", &n);

    if ((n % 2) == 0)
    {
        printf("The number, %d, is even.\n", n);
    }
    else
    {
        printf("The number, %d, is odd.\n", n);
    }

    return 0;
}