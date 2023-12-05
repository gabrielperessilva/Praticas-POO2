
/**
 * Escreva uma descrição da classe P01 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class P01 extends Personagem
{
    public P01(){
        setPulo(new PuloMedio());
        setCorre(new CorreMedio());
        setAtaque(new AtaqueForte());
    }
}
