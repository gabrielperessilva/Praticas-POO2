
/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem
{
    private String nome;
    private int life;
    
    public Personagem(String nome, int life, int dano){
        this.nome = nome;
        this.life = life;

    }
    
    public String getNome(){return this.nome;}
    
    public int getLife(){return this.life;}  
    
    public void tomaDano(int dano){
        this.life -= dano;
    }
}
