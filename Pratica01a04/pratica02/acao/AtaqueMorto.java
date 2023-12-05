package pratica02.acao;


/**
 * Escreva uma descrição da classe CorrerDevagar aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AtaqueMorto implements Ataque
{
    public void atacar(){
        System.out.println("O personagem esta morto, nao possui ataque");
    }
}
