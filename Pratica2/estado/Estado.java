package estado;
import personagem.Personagem;

//State
public abstract class Estado {
    
    private Personagem personagem;
    private double limiteInferior;
    private double limiteSuperior;
    
    public Estado(Personagem personagem) {
        this.personagem = personagem;
        setLimites();
    }
    
    public Personagem getPersonagem(){
        return this.personagem;
    }
    
    public abstract void setLimites();
    
    public double getLS(){
        return this.limiteSuperior;
    }    
    
    public double getLI(){
        return this.limiteInferior;
    }    
    
    public void setLS(double limite){
        this.limiteSuperior = limite;
    }    
    
    public void setLI(double limite){
        this.limiteInferior = limite;
    }    
    
    public void perdeLife(double atual,double porcentagem){
        this.personagem.setLife(atual - porcentagem);
        this.verificarEstado();
    }
    
    public void ganhaLife(double atual,double porcentagem){
        this.personagem.setLife(atual + porcentagem);
        this.verificarEstado();
    }
    
    public abstract void verificarEstado();
    
} 