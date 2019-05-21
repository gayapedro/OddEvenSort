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
public class Elemento implements Comparable {
    
    private String matricula;
    private String nome;
    
    public Elemento(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    
    @Override
    public int compareTo(Object o){
        Elemento e = (Elemento)o;
        return this.matricula.compareTo(e.matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
