package estado;
import personagem.*;
import acao.*;

/**
 * Escreva uma descrição da classe Morto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Morto extends Estado
{
    public Morto(Personagem personagem){
        super(personagem);
        this.getPersonagem().setAtaque(null);
        this.getPersonagem().setVelocidade(null);
        
    }
    
    public void verificarEstado(){
        return;
    }
    
    public  void setLimites(){
        this.setLI(1000000000.0);
        this.setLS(1000000000.0);
    }
}
