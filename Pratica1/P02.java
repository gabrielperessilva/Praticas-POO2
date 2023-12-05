
/**
 * Escreva uma descrição da classe P02 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class P02 extends Personagem
{
    public P02(){
        setPulo(new PuloAlto());
        setCorre(new CorreRapido());
        setAtaque(new AtaqueMedio());
    }
}
