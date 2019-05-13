/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.even.sort;

/**
 *
 * @author 030112096
 */
public class Sort {
    
    public static long oddEvenSort(Comparable[] vet){
        long compares = 0;
        boolean ordenado = false;
        while(!ordenado){
            ordenado = true;
            for(int i=1;i<vet.length-1;i+=2){
                compares++;
                if(vet[i].compareTo(vet[i+1]) == 1){
                    Comparable aux = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1] = aux;
                    ordenado = false;
                }
            }
            for(int j=0;j<vet.length-1;j+=2){
                compares++;
                if(vet[j].compareTo(vet[j+1]) == 1){
                    Comparable aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                    ordenado = false;
                }
            }
        }
        return compares;
    }
}
