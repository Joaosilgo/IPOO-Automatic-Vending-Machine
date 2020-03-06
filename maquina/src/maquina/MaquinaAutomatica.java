/*
 *A classe MaquinaAutomatica. Esta é uma das classes mais importantes, 
 *pois irá efetuar quase todos os métodos disponíveis da máquina automática.
 *Quando está é criada recebe um número de identificação e é reiniciada, 
 *quando reiniciada, ela cria um novo código secreto e um novo HashMap para guardar as referências dos produtos.
 *@version 1-1-2016
 * @author Hugo e João
 */
package maquina;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Hugo e João
 */
public class MaquinaAutomatica {
    
    private HashMap<String, Produto> produtos;
    
    private int identificacao;
    
    private int codigo;
    
    private int creditosAcumulados;
    
    private String posicao;//String
    
    private boolean confimado;
    

   /**
    * Cria uma Maquina automatica reiniciando-a, criando assim um novo hashmap,
    * um novo codigo, e com uma nova identificçao, fazendo as validaçoes neçessarias
    * @param identificacao 
    */
    public MaquinaAutomatica(int identificacao){
        reiniciarMaquina();
        this.identificacao = testeIdentificacao(identificacao);
        
      
        
    }
    /**
     * textoInicial()- Tramite para o ecra toda a informaçao neçessaria ao utilizador para 
     * adquirir algum Produto.

     */
    private void textoInicial(){
        System.out.println("Selecione primeiro o producto que deseja começando pela prateleira(De A a F) e depois pela coluna(De 0 a 9).");
        System.out.println("Em seguida insira o cartao para pagar.");
        System.out.println("No fim pressione o botão OK para confirmar a compra.");
        System.out.println("Pode pressionar o botão C em qualquer momento para cancelar "
        +" a compra e voltar ao inicio.");
    }
    /**
     * testeIdentificacao(int identificacao)- Faz a valdação do nº de identificação
     * para que este garanta 6 algarismos.
     * @param identificacao
     * @return numero - retorna a identificaçao já validada
     */
    private int testeIdentificacao(int identificacao){
        int numero = 0;
        
        if (identificacao>=100000 && identificacao<=999999)
            numero = identificacao;
        return numero;
    }
    
    /**
     *getCodigo()- metodo que retona o codigo secreto da maquina.
     * @return codigo - codigo gerado aleatorio a partir de outra metodologia
     */
    public int getCodigo(){
        return codigo;
    }
    /**
     * inserirPrateleira(char prateleira)- Metódo que recebe um caracter que significa a prateleira
     * e que faz as validações neçessarias e insere na posição
     * @param prateleira 
     */
    public void inserirPrateleira(char prateleira){
        
        
        if(prateleira< 'A' || prateleira > 'F')
            System.out.println("Por favor insira entre A e F");
        else{
            this.posicao += prateleira;
        System.out.println("Insira agora a coluna entre 0 e 9");
        }
    }
    /**
     * inserirColuna(int coluna)- Recebe o ´nº da coluna faz s validaçoes neçessarias e 
     * e insere na posiçao para ue o utilizador confirma a posiçao ja completa
     * @param coluna 
     */
    public void inserirColuna(int coluna){
        if(posicao.length()<1 || posicao.length()>1)
            System.out.println("Por Favor insira 1º a prateleira");
        else 
            if(coluna<=0 || coluna>9)
                System.out.println("Por favor insira entre 0 e 9");
            else{
                 this.posicao += coluna;
        System.out.println("Confirme agora a posiçao inserida: " + posicao 
                +"o produto é: "+ produtos.get(posicao)+
                " /nSe for esta a posicao desejada pressione ok");
            }
                
    }
    /**
     * ok()- Este metodo confirma a posiçao que o utilizador escolheu
     */
    
    public void ok(){
        if(posicao.length()<2 || posicao.length()>2)
            System.out.println("Isira primeiro a prateleira");
        else{
            confimado = true;
        System.out.println("Insira agora o cartao para pagar /nO preço a pagar é: "+ produtos.get(posicao).precoEmEuros());
        }
    }
    /**
     *  pagar(Cartao cartao)- Metodo que recebe o cartão e faza confirmaçao da posiçao
     * só depois verifica o dinheiro disponivel, e por fim se passar por todas as verficçoes é que desconta o
     * produto do saldo do cartão
     * @param cartao
     * @return produto da posiçao adquirida
     * @return null
     */
    public Produto pagar(Cartao cartao){
        boolean confirmado;//variavel local
        if (confirmado = false)
            System.out.println("Insira primeiro a posiçao e depois pressione OK para confirmar antes de pagar");
        
        else{
            if (cartao.getDinheiroDisponivel() - produtos.get(posicao).getPreco()<0)
            System.out.println("Nao tem dinheiro disponivel no cartao sufeciente para pagar o produto selecionado");
            else{
                cartao.pagarComCartao(produtos.get(posicao).getPreco());
                System.out.println("Pagamento bem sucedido./nObrigado e volte sempre!");
                confirmado=false;
                creditosAcumulados+=produtos.get(posicao).getPreco();
                return produtos.get(posicao);
            }
        }
        return null;
        
        
    }
    /**
     * Cancel()- O botão cancel anula todas as operaçoes mantendo a posição vazia
     * e reinicia todo o processo de escola
     */
    public void Cancel(){
        posicao ="";
        boolean confirmado = false;
        textoInicial();
    }
    /**
     * reiniciarMaquina()- Este metodo reinicia a maquina, criando um novo hashmap
     * e gerando m novo codigo secreto
     */
    
    public void reiniciarMaquina(){
        produtos = new HashMap<>();
        posicao ="";
        creditosAcumulados = 0;
        boolean confirmado = false; 
        codigo =  gerarCodigo();
        textoInicial();
        produtos.put("A",new Produto('A'));
        produtos.put("B",new Produto('B'));
        produtos.put("C",new Produto('C'));
        produtos.put("D",new Produto('D'));
        produtos.put("E",new Produto('E'));
        produtos.put("F",new Produto('F'));
        
    }
    /**
     * gerarCodigo()- gera um codigo secreto aleatorio
     * @return sequecia de 4 algarismos superior a 1
     */
    
    private int gerarCodigo(){
        Random sequencia = new Random();
        return sequencia.nextInt(9999)+1;
    }
    
}
