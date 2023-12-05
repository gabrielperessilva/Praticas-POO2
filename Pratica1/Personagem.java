
/**
 * Escreva uma descrição da classe Personagem aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Personagem
{
    private Pulo pulo;
    private Corre corre;
    private Ataque ataque;
    
    public void setPulo(Pulo p){
        this.pulo = p;
    }
    
    public void setCorre(Corre c){
        this.corre = c;
    }
    
    public void setAtaque(Ataque a){
        this.ataque = a;
    }
    
}
