/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.even.sort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 030112096
 */
public class OddEvenSort {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        long[] resultados;
        
        ArrayList<Elemento> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./src/resource/alunos.csv"))) {
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] valores = line.split(";");
                    Elemento el = new Elemento(valores[1],valores[0]);
                    lista.add(el);
                }
        }
        Elemento[] vet = lista.toArray(new Elemento[lista.size()]);
        lista.clear();
        resultados = Sort.oddEvenSort(vet);
        System.out.println("NOME      | MATRÍCULA");
        System.out.println("---------------------------------------------------");
        for(Elemento e : vet){
            System.out.println(e.getMatricula()+" | "+e.getNome());
        }
        System.out.println("Odd-even Sort | Comparações: "+resultados[0]+" | Trocas: "+resultados[1]);
        
    }
    
}
