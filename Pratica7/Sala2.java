import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sala2 extends Sala
{
    Scanner scanner;
    
    public Sala2(ArrayList<Component> c, String nome)
    {
        super(c, nome);
        this.scanner = new Scanner(System.in);
    }
    
    public void selecionarCaminho(Personagem p){
        Random random = new Random();
        System.out.println("Personagem "+p.getNome()+" venceu a disputa e possui vida: "+p.getLife());
        int valor;
        
        do{
            System.out.println("Digite um numero de 1 a "+ (this.getCaminhos().size()) +" para escolher o caminho");
            valor = scanner.nextInt();
        }
        while(valor > this.getCaminhos().size() || valor < 1);
        System.out.println("Personagem "+p.getNome()+" pegou caminho "+ valor+1); 
        getCaminhos().get(valor-1).jogar(p);
    }
    
    public void lutar(Personagem p){
        Random random = new Random();
        int danoInimigo = random.nextInt(10)+1;
        int valor;
    
        do{
            System.out.println("Digite um numero de 1 a 10 para advinhar quanto de dano sera recebido");
            valor = scanner.nextInt();
        }
        while(valor > 10 || valor < 0);
        
        System.out.println("Inimigo com dano = "+danoInimigo);
        if (valor == danoInimigo){
            System.out.println("Parabéns!!! Você acertou o dano do inimigo, pode agora escolher qual caminho seguir");
            selecionarCaminho(p);
        }else{
            System.out.println("Você errou o dano do inimigo!!!");
            if(p.getLife() > 0){
                selecionarCaminho(p);
            }else{
                System.out.println("Personagem "+p.getNome()+" perdeu a disputa e morreu... Fim de Jogo");
            }
        }
        
        
        
    }

}
