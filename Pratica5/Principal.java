import java.util.ArrayList;

public class Principal{
    
    public static void main(String args[]){
        ArrayList<Component> listaFim1 = new ArrayList<>();
        ArrayList<Component> listaFim2 = new ArrayList<>();
        ArrayList<Component> listaSalas1 = new ArrayList<>();
        ArrayList<Component> listaSalas2 = new ArrayList<>();
        ArrayList<Component> listaSalas3 = new ArrayList<>();
        
        Personagem p = new Personagem("Rambo", 500, 20);
        Personagem inimigo1 = new Personagem("Rocky Balboa", 50, 10);
        Personagem inimigo2 = new Personagem("John", 50, 30);
        Personagem inimigo3 = new Personagem("Jack", 50, 20);
        
        listaFim1.add(new Abismo());
        listaFim1.add(new Saida());
        listaFim1.add(new Abismo());
        
        listaFim2.add(new Abismo());
        listaFim2.add(new Saida());
        listaFim2.add(new Saida());

        listaSalas1.add(new Sala(listaFim1,"Sala11", inimigo1));
        listaSalas1.add(new Sala(listaFim1,"Sala10", inimigo2));
        listaSalas1.add(new Sala(listaFim2,"Sala9", inimigo3));
        
        listaSalas2.add(new Sala(listaSalas1, "Sala8", inimigo3));
        listaSalas2.add(new Sala(listaSalas1, "Sala7", inimigo2));
        listaSalas2.add(new Sala(listaSalas1, "Sala6", inimigo1));
        
        listaSalas3.add(new Sala(listaSalas1, "Sala5", inimigo3));
        listaSalas3.add(new Sala(listaSalas1, "Sala4", inimigo1));
        listaSalas3.add(new Sala(listaSalas2, "Sala3", inimigo2));
        listaSalas3.add(new Sala(listaSalas1, "Sala2", inimigo3));
        
        Component labirinto = new Sala(listaSalas3, "Sala1", inimigo1);
        
        labirinto.andar(p);
        
    }

}