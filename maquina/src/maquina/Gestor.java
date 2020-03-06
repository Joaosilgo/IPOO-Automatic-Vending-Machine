/*
 * A manutenção da máquina é feita por um gestor que pode adicionar,
 * retirar ou substituir produtos. E é está a funçao desta classe
 */
package maquina;

/**
 *Clsse responsavel pela gestão dos produtos na máquina
 * @author Hugo
 */
public class Gestor {
    
    private MaquinaAutomatica maquina;
    
    /**
     * Recebe a maquina e faza sua validação
     * @param maquina 
     */
    public Gestor(MaquinaAutomatica maquina){
        if (maquina!= null)
            this.maquina=maquina;
        
    }
    
    /**
     * retorna o codigo secreto da macquina
     * @return codigo Secreto da maquina
     */
    public int verCodigoSecreto(){
        return maquina.getCodigo(); 
    }
    /**
     * reiniciarMaquina()- Faz parte do gestor reiniciar a maquina
     */
    public void reiniciarMaquina(){
        maquina.reiniciarMaquina();
    }
    
           
            
    
}
