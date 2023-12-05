
/**
 * Escreva uma descrição da classe Personagem aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Personagem
{    
    private Corre corre;
    private Ataque ataque;
 
    public void setCorre(Corre c){
        this.corre = c;
    }
    
    public void setAtaque(Ataque a){
        this.ataque = a;
    }
    
    public void correr(){
        this.corre.correr();
    }
    
    public void atacar(){
        this.ataque.atacar();
    }
}
