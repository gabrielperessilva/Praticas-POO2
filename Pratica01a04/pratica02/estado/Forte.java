package pratica02.estado;
import pratica02.personagem.*;
import pratica02.acao.*;

/**
 * Escreva uma descrição da classe Forte aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Forte extends Estado
{
    public Forte(Personagem personagem){
        super(personagem);
        this.getPersonagem().setAtaque(new AtaqueForte());
        this.getPersonagem().setVelocidade(new VelocidadeRapida());
    }
    
    public void verificarEstado(){
        if (this.getPersonagem().getLife() <= this.getLI()){
            this.getPersonagem().setEstado(new Normal(this.getPersonagem()));
        }
    }
    
    public  void setLimites(){
        this.setLI((0.7)*this.getPersonagem().getMaxLife());
        this.setLS(10000000.0);
    }
}
