public class SimplePersonagemFactory extends Game{

     public Personagem createPersonagem(int tipo){
         Personagem p = new Personagem();
         if (tipo == 1){
             p.setAtaque(new AtaqueForte());
             p.setCorre(new CorreRapido());
         }
         else if (tipo == 2){
             p.setAtaque(new AtaqueMedio());
             p.setCorre(new CorreRapido());
         }
         else if (tipo == 3){
             p.setAtaque(new AtaqueFraco());
             p.setCorre(new CorreMedio());
         }
         else if (tipo == 4){
             p.setAtaque(new AtaqueForte());
             p.setCorre(new CorreDevagar());
         }
 
         return p;
     }
}