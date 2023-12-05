import pratica02.personagem.*;

/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal2
{
    
    public static void main(String[] args)
    {
        Personagem p01 = new Personagem(100.0);
        
        System.out.println("Vida incial do personagem: "+p01.getLife());
        System.out.print("Ataque: ");
        p01.atacar();
        System.out.print("Velocidade: ");
        p01.velocidade();
        
        p01.perdeLife(41.0);// Personagem perde 41 de vida
        System.out.println("\nVida atual: "+p01.getLife());
        System.out.print("Ataque: ");
        p01.atacar();
        System.out.print("Velocidade: ");
        p01.velocidade();
        
        p01.ganhaLife(41.0);
        System.out.println("\nVida atual: "+p01.getLife());
        System.out.print("Ataque: ");
        p01.atacar();
        System.out.print("Velocidade: ");
        p01.velocidade();
        
        p01.ganhaLife(1.0);
        System.out.println("\nVida atual: "+p01.getLife());
        System.out.print("Ataque: ");
        p01.atacar();
        System.out.print("Velocidade: ");
        p01.velocidade();
        
        p01.perdeLife(100.0);
        System.out.println("\nVida atual: "+p01.getLife());
        System.out.print("Ataque: ");
        p01.atacar();
        System.out.print("Velocidade: ");
        p01.velocidade();
        
        p01.perdeLife(100.0);
        System.out.println("\nVida atual: "+p01.getLife());
        System.out.print("Ataque: ");
        p01.atacar();
        System.out.print("Velocidade: ");
        p01.velocidade();
    }
}
