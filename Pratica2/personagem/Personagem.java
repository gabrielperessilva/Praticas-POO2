package personagem;
import acao.*;
import estado.*;

/**
 * Escreva uma descrição da classe Personagem aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem
{
    private Velocidade velocidade;
    private Ataque ataque;
    private double life;
    private double maxLife;
    private Estado estado;
    
    public Personagem(double maxLife){
        this.maxLife = maxLife;
        this.life = maxLife*(0.7);
        this.estado = new Normal(this);  
    }
    
    public void ganhaLife(double life) {
        this.estado.ganhaLife(this.life, life);  
    }
    
    public void perdeLife(double life) {
        this.estado.perdeLife(this.life, life);  
    }
    
    public void setLife(double life) {
        this.life = life;
    }
    
    public void setVelocidade(Velocidade velocidade){
        this.velocidade = velocidade;
    }
    
    public void setAtaque(Ataque a){
        this.ataque = a;
    }
       
    public void atacar(){
        if (this.velocidade == null)
            System.out.println("Personagem está morto");
        else 
            this.ataque.atacar();
    }
    
    public void velocidade(){
        if (this.velocidade == null)
            System.out.println("Personagem está morto");
        else 
            this.velocidade.velocidade();
    }
    
    public double getLife(){
        return this.life;
    }
    
    public double getMaxLife(){
        return this.maxLife;
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    public Estado getEstado(){
        return this.estado;
    }
}
