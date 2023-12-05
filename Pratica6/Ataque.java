
/**
 * Escreva a descrição da interface Ataque aqui.
 * 
 * @author (seu nome aqui) 
 * @version (um número da versão ou data aqui)
 */

public class Ataque
{
    private String descricao;
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void atacar(){
        System.out.println(getDescricao());
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
