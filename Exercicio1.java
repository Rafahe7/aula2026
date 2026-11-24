import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int [10];

        int quantosPares = 0;
        int quantosImpares = 0;
        int soma = 0;

        for(int i=0; i < numeros.length; i++){
            System.out.printf("\nDigite o %d número: %n", i+1);
            numeros[i] = scan.nextInt();
            
            soma+=numeros[i];

            if(numeros[i] %2 == 0){
                quantosPares++;
            }else{
                quantosImpares++;
            }
        }
        scan.close();
        System.out.printf("\nNúmeros digitados: ");
        for(int i=0; i<numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }
        System.out.printf("\nQuantidade de pares: %d", quantosPares);
        System.out.printf("\nQuantidade de ímpares: %d", quantosImpares);
        System.out.printf("\nSoma de todos números digitados: %d", soma);
           }
    }