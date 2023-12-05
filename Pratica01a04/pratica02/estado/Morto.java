package pratica02.estado;
import pratica02.personagem.*;
import pratica02.acao.*;

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
        this.getPersonagem().setAtaque(new AtaqueMorto());
        this.getPersonagem().setVelocidade(new VelocidadeMorto());
        
    }
    
    public void verificarEstado(){
        return;
    }
    
    public  void setLimites(){
        this.setLI(1000000000.0);
        this.setLS(1000000000.0);
    }
}
