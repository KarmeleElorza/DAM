//On the presentation is the 2st exercise of the SwitchStatement part.
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int day;

    printf("Write a number between 1 and 7:");
    scanf("%d", &day);

    switch (day)
    {
    case 1: 
        printf("Monday.\n");
        break;
    case 2:
        printf("Tuesday.\n");
        break;
    case 3:
        printf("Wednesday.\n");
        break;
    case 4:
        printf("Thursday.\n");
        break;
    case 5:
        printf("Friday.\n");
        break;
    case 6:
        printf("Saturday.\n");
        break;
    case 7:
        printf("Sunday.\n");
        break;
    default:
        printf("Enter a number between 1-7.\n");
        break;
    }

    return 0;
}