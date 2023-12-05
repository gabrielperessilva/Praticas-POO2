import personagem.*;

/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{
    
    public static void main(String[] args)
    {
        Personagem p01 = new Personagem(100.0);
        
        System.out.println(p01.getLife());
        p01.perdeLife(41.0);
        p01.atacar();
        p01.velocidade();
        
        System.out.println(p01.getLife());
        p01.ganhaLife(41.0);
        p01.atacar();
        p01.velocidade();
        
        System.out.println(p01.getLife());
        p01.ganhaLife(1.0);
        p01.atacar();
        p01.velocidade();
        
        System.out.println(p01.getLife());
        p01.perdeLife(100.0);
        p01.atacar();
        p01.velocidade();
        
        System.out.println(p01.getLife());
        p01.perdeLife(100.0);
        p01.atacar();
        p01.velocidade();
    }
}
