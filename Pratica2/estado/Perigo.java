package estado;
import personagem.*;
import acao.*;

public class Perigo extends Estado  
{
    public Perigo(Personagem personagem){
        super(personagem); 
        this.getPersonagem().setAtaque(new AtaqueFraco());
        this.getPersonagem().setVelocidade(new VelocidadeLenta());
        
        
        if (this.getPersonagem().getLife() <= this.getLI()){
            this.getPersonagem().setEstado(new Morto(this.getPersonagem()));
        }
    }
    
    public void verificarEstado(){
        if (this.getPersonagem().getLife() <= this.getLI()){
            this.getPersonagem().setEstado(new Morto(this.getPersonagem()));
        }
        else if (this.getPersonagem().getLife() >= this.getLI()){
            this.getPersonagem().setEstado(new Normal(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarEstado();
        }
    }
    
    public  void setLimites(){
        this.setLI(0.0);
        this.setLS((0.3)*this.getPersonagem().getMaxLife());
    }
}
