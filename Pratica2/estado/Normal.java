package estado;
import personagem.*;
import acao.*;

/**
 * Escreva uma descrição da classe Normal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Normal extends Estado
{
    public Normal(Personagem personagem){
        super(personagem);
        this.getPersonagem().setAtaque(new AtaqueNormal());
        this.getPersonagem().setVelocidade(new VelocidadeMedia());
        
        if (this.getPersonagem().getLife() < this.getLI()){
            this.getPersonagem().setEstado(new Perigo(this.getPersonagem()));
        }
        else if (this.getPersonagem().getLife() > this.getLS()){
            this.getPersonagem().setEstado(new Forte(this.getPersonagem()));
        }
    }
    
    public void verificarEstado(){
        if (this.getPersonagem().getLife() < this.getLI()){
            this.getPersonagem().setEstado(new Perigo(this.getPersonagem()));
        }
        else if (this.getPersonagem().getLife() > this.getLS()){
            this.getPersonagem().setEstado(new Forte(this.getPersonagem()));
        }
    }
    
    public  void setLimites(){
        this.setLI((0.3)*this.getPersonagem().getMaxLife());
        this.setLS((0.7)*this.getPersonagem().getMaxLife());
    }

}
