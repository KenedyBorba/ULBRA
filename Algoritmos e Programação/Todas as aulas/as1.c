#include <stdio.h>

int main()
{
    int cod, num=0, casos=0, maior=0, menor=0, cont=0;
    
    do{
        printf("Digite o código do município: ");
        scanf("%i", &cod);
        printf("Digite o número de casos confirmados da doença: ");
        scanf("%i", &casos);
            if(cont==0){
                maior=casos;
                menor=casos;
                cont++;
            }
            else if(cod==0){
                break;
            }
            else if(casos>maior){
                maior=casos;
                }
            else if(casos<menor){
                menor=casos;
                }
            if(casos>=0){
                num=num+1;
                }
            
    }while(cod!=0);
        printf("O número total de municípios pesquisados é: %i", num);
        printf("\nO município %i, teve o maior número de casos confirmados que foi: %i \nO município %i, teve o menor número de casos confirmados que foi: %i", cod, maior, cod, menor);

    return 0;
}