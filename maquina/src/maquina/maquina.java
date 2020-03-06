/*
 * Esta classe é responsavel por ler os dados que o utilizador insere
 */
package maquina;

import java.util.Scanner;

/**
 *@version 1-1-2016
 * @author Hugo e João
 *Está classe é responsável pela utilização do Scanner
 * para ler os dados que o utilizador insere na maquina.
 */
public class maquina {
    
    
    private  Scanner leitor;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /**
     * maquina()- neste constrotor é criado um leitor, para ler o teclado
     */
    
   
    public maquina(){
        leitor = new Scanner(System.in);
    }
    
    
    /**
     * O leitor lle a o numero inteiro que o utilizador marcou
     * @param pergunta recebe a ergunta sobre a coluna
     * @return 
     */
    public int getColuna(String pergunta){
        if(pergunta == null)
            pergunta="";
        pergunta+=">";
        System.out.println(pergunta);
        
        int coluna = leitor.nextInt();
        return coluna;
    }
    
    
    /**
     * valida a pergunta e lé o caracter
     * @param pergunta
     * @return 
     */
    public char getPrateleira(String pergunta){
        if(pergunta == null)
            pergunta="";
        pergunta+=">";
        System.out.println(pergunta);
        
        char prateleira = leitor.next().trim().toLowerCase().charAt(0);//assegurar que le de qualquer das maneiras
        return prateleira;
    }
}
