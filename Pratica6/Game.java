
/**
 * Escreva uma descrição da classe Game aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Game
{
    public abstract Personagem createPersonagem(int tipo);
    
    public final void Jogar(){
        Personagem p1 = createPersonagem(1);
        Personagem p2 = createPersonagem(2);
        Personagem p3 = createPersonagem(3);
        Personagem p4 = createPersonagem(4);
        
        System.out.println("P1 corre");
        p1.correr();
        System.out.println("P1 ataca");
        p1.atacar();
        System.out.println("P2 ataca");
        p2.atacar();
        System.out.println("P3 corre");
        p3.correr();
        System.out.println("P3 ataca");
        p3.atacar();
        System.out.println("P4 ataca");
        p4.atacar();
        
    }
}
