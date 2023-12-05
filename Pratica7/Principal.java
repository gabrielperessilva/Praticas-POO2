import java.util.ArrayList;

public class Principal{
    
    public static void main(String args[]){
        ArrayList<Component> listaFim1 = new ArrayList<>();
        ArrayList<Component> listaFim2 = new ArrayList<>();
        ArrayList<Component> listaSalas1 = new ArrayList<>();
        ArrayList<Component> listaSalas2 = new ArrayList<>();
        ArrayList<Component> listaSalas3 = new ArrayList<>();
        
        Personagem p = new Personagem("Rambo", 500, 20);
        
        listaFim1.add(new Abismo());
        listaFim1.add(new Saida());
        listaFim1.add(new Abismo());
        
        listaFim2.add(new Abismo());
        listaFim2.add(new Saida());
        listaFim2.add(new Saida());

        listaSalas1.add(new Sala1(listaFim1,"Sala11"));
        listaSalas1.add(new Sala1(listaFim1,"Sala10"));
        listaSalas1.add(new Sala2(listaFim2,"Sala9"));
        
        listaSalas2.add(new Sala2(listaSalas1, "Sala8"));
        listaSalas2.add(new Sala1(listaSalas1, "Sala7"));
        listaSalas2.add(new Sala1(listaSalas1, "Sala6"));
        
        listaSalas3.add(new Sala2(listaSalas1, "Sala5"));
        listaSalas3.add(new Sala1(listaSalas1, "Sala4"));
        listaSalas3.add(new Sala2(listaSalas2, "Sala3"));
        listaSalas3.add(new Sala1(listaSalas1, "Sala2"));
        
        Component labirinto = new Sala2(listaSalas3, "Sala1");
        
        labirinto.jogar(p);
        
    }

}