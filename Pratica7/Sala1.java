import java.util.ArrayList;
import java.util.Random;

public class Sala1 extends Sala
{
    
    public Sala1(ArrayList<Component> c, String nome)
    {
        super(c, nome);
    }
    
    public void selecionarCaminho(Personagem p){
        Random random = new Random();
        System.out.println("Personagem "+p.getNome()+" venceu a disputa e possui vida: "+p.getLife());
        int numeroAleatorio = random.nextInt(getCaminhos().size());
        System.out.println("Personagem "+p.getNome()+" pegou caminho "+ (numeroAleatorio+1)); 
        getCaminhos().get(numeroAleatorio).jogar(p);
    }
    
    public void lutar(Personagem p){
        Random random = new Random();
        int danoInimigo = random.nextInt(10)+1;
        
        System.out.println("Inimigo com dano = "+danoInimigo);
        if(p.getLife() > 0){
            selecionarCaminho(p);
        }else{
            System.out.println("Personagem "+p.getNome()+" perdeu a disputa e morreu... Fim de Jogo");
        }
    }

}
