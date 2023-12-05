import pratica01.*;

/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal1
{
    
    public static void main(String[] args)
    {
        Personagem p01 = new P01();
        Personagem p02 = new P02();
        Personagem p03 = new P03();
        
        System.out.println("Atributos de P01");
        p01.pular();
        p01.correr();
        p01.atacar();
         
        System.out.println("\nAtributos de P02");
        p02.pular();
        p02.correr();
        p02.atacar();
        
        System.out.println("\nAtributos de P03");
        p03.pular();
        p03.correr();
        p03.atacar();  

    }
}
