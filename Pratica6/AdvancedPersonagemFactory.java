public class AdvancedPersonagemFactory extends Game{

     public Personagem createPersonagem(int tipo){
         Personagem p = new Personagem();
         if (tipo == 1){
             p.setAtaque(new PoderDeFogo(new AtaqueMedio()));
             p.setCorre(new CorreRapido());
         }
         else if (tipo == 2){
             p.setAtaque(new PoderDeFogo(new AtaqueMedio()));
             p.setCorre(new CorreRapido());
         }
         else if (tipo == 3){
             p.setAtaque(new PoderDeGelo(new AtaqueFraco()));
             p.setCorre(new CorreMedio());
         }
         else if (tipo == 4){
             p.setAtaque(new PoderDeGelo(new AtaqueForte()));
             p.setCorre(new CorreDevagar());
         }
 
         return p;
     }
}
