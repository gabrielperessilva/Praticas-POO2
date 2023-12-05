import java.util.ArrayList;

public abstract class Sala implements Component{

    private ArrayList<Component> caminhos;
    private String nome;
    
    public Sala(ArrayList<Component> c, String nome){
        this.caminhos = c;
        this.nome = nome;
    }
    
    public abstract void selecionarCaminho(Personagem p);
    public abstract void lutar(Personagem p);
    

    public final void jogar(Personagem p){
        System.out.println("--------------------------------------------------------");
        System.out.println("Personagem "+p.getNome()+" com life = "+p.getLife()+" entrou na sala "+this.nome);
        this.lutar(p);
    }
    
    public ArrayList<Component> getCaminhos(){
        return this.caminhos;
    }
    
}
