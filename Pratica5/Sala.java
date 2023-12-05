import java.util.ArrayList;
import java.util.Random;

public class Sala implements Component{

    private ArrayList<Component> caminhos;
    private String nome;
    private Personagem inimigo;
    
    public Sala(ArrayList<Component> c, String nome, Personagem inimigo){
        this.caminhos = c;
        this.nome = nome;
        this.inimigo = inimigo;
    }

    public void andar(Personagem p){
        try{
          Thread.sleep(3000);
        }
        catch(Exception e){
        }    
        System.out.println("--------------------------------------------------------");
        System.out.println("Personagem "+p.getNome()+" com life = "+p.getLife()+" entrou na sala "+this.nome);
        System.out.println("Inimigo "+inimigo.getNome()+" com life = "+inimigo.getLife()+" e dano = "+inimigo.getDano());
        
        while (p.getLife() > 0 && inimigo.getLife() > 0){
            p.tomaDano(inimigo.getDano());
            inimigo.tomaDano(p.getDano());
        }
        
        if(p.getLife() > 0){
            System.out.println("Personagem "+p.getNome()+" venceu a disputa e possui vida: "+p.getLife());
            Random random = new Random();
            int numeroAleatorio = random.nextInt(caminhos.size());
            System.out.println("Personagem "+p.getNome()+" pegou caminho "+ numeroAleatorio); 
            caminhos.get(numeroAleatorio).andar(p);
        }else{
            System.out.println("Personagem "+p.getNome()+" perdeu a disputa e morreu... Fim de Jogo");
        }

        

    }
}
