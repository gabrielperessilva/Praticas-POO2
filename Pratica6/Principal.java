
/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{
    public static void main(String args[]){
        System.out.println("Jogo 1:");
        Game game1 = new SimplePersonagemFactory();
        game1.Jogar();
        System.out.println("######################################");
        System.out.println("Jogo 2:");
        Game game2 = new AdvancedPersonagemFactory();
        game2.Jogar();

    }

}
