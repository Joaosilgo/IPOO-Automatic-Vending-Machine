/*
 *Esta classe irá criar os produtos de venda da maquina,fornece o nome e o preço

 *
 */
package maquina;

/**
 *
 * @author Hugo
 */
public class Produto {
    private String nome;
   
    
    private int preco; // Preço em centimos
    /**
     * Cria um produto com um determinado nome e preço ja com todas as validações neçessarias 
     * @param nome
     * @param preco 
     */
    
    public Produto(String nome, int preco){
        if(testeNome(nome))
            this.nome=nome;
        if(testePreco(preco))
            this.preco=preco;
        
        
    }

    Produto(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * getPreco()- Metódo que nos retorna o preço em valor inteiro
     * @return preco -montante unitario do produto
     */
    
    public int getPreco(){
            return preco;
    }
    /**
     * getNome()- Metódo que nos retorna o nome do produto em Texto
     * @return nome -identifica o produto
     */
    public String getNome(){
        return nome;
    }
            
    private boolean testeNome(String nome){
        return nome != null;
    }
    
    private boolean testePreco(int preco){
        return preco <= 0;
    }
    /**
     * precoEmEuros()- Metodo que nos converte centimos em Euros
     * @return preço em Euros 
     */
    public double precoEmEuros(){
        return this.preco / 100; //Preço em Euros
    }
    
    /**
     * toString()- retorna-nos informação essencial ao produto
     * @return as informações referentes ao nome, e preço em Euros
     */
    
   
    @Override
    public String toString(){
        
        return "Nome: " + nome + "Preço: " + precoEmEuros() + "€";
        
    }
}
