package pratica01;


/**
 * Escreva uma descrição da classe P03 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class P03 extends Personagem
{
    public P03(){
        setPulo(new PuloBaixo());
        setCorre(new CorreRapido());
        setAtaque(new AtaqueForte());
    }
}
