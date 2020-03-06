/*
 * Cartao-Esta classe irá ser responsavel pela criação de um cartão porta-moedas que irá
possuir um numero de identificação unico gerado automaticamente, este cartão irá possuir saldo
que pode ser carregado com a quantia a desejar, e é com este objecto que se ira efectuar as compras 
na maquina de vendas automatica
 */
package maquina;

import java.util.Random;

/**
 *@version 1-1-2016
 * @author Hugo e João
 */
public class Cartao {
    
     
    private int dinheiro;
    
    private int identificacao;
    /**
     * Constroi um cartao com uma determinda quantia, onde é gerado automaticamente 
     * um numero de identificação unico maior que 1, irá tambem fazer tdas as validações
     * neçessárias.
     * 
     * @param dinheiro - quantia a carregar para o cartão
     */
    public Cartao(int dinheiro){
        Random sequencia = new Random();
        this.identificacao = sequencia.nextInt(9999)+1;
        if (dinheiro > 0)
            this.dinheiro=dinheiro;
        else
            this.dinheiro = 10000;
        
    }
    /**
     * getDinheiroDisponivel()- Depois do cartão ser criado este metodo irá retornar
     * o seu saldo Disponivel
     * @return dinheiro - Saldo Disponivel
     */
    public int getDinheiroDisponivel(){
        return dinheiro;
    } 
    /**
     * getIdentificacao()- Depois do cartão ser criado este metódo irá retornar
     * o numero de identificaçao gerado para este cartão
     * @return identificação- nº identificador do cartão.
     */
    public int getIdentificacao(){
        return identificacao;
    }
    
   /**
    * Este metódo irá efectuar a operação de compra de um produto, ele recebe o preço do produto
    * e ira subtrair ao saldo do nosso cartão e não ira efectuar a operação se o nosso saldo for isuficiente
    * @param preco - preço unitario do produto
    */
    
    public void pagarComCartao(int preco){
        
        if(preco<=dinheiro)
            dinheiro-=preco;
        else
            System.out.println("Fundos isuficientes");
    }
    
        
    
        /**
         * carregarCartao(int valor)- Este Metódo irá efectuar a operação de carregar um cartao,
         * irá receber um valor e irá juntar ao saldo atual do cartão, se não exceder o valor de 
         * 10000 centimos por cartão
         * 
         * 
         * @param valor - valor a juntar ao cartão
         */
    public void carregarCartao(int valor){
         if(this.dinheiro + valor > 10000)
         System.out.println("O valor excede o maximo permitido de 10€");
        else
        
         this.dinheiro+= valor;
    }
    
}
