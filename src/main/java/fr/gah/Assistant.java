package fr.gah;

public class Assistant {

  private Papier boutDePapier;

  public Assistant() {
    boutDePapier = new Papier();
  }

  public void demanderInfosSpectateur(Spectateur spectateur) {
    System.out.println("[Assistant] Bonjour, Spectateur !");
    System.out.println(
        "[Assistant] Veuillez écrire sur ce bout de papier votre âge et la somme d'argent que vous avez en poche.");
    spectateur.écrireInfos(boutDePapier);
    System.out.println("[Assistant] Bien ! Je prends le papier et je le lis silencieusement...");
    // Pour Debug
    // System.out.println("papier : " + boutDePapier);
  }

  public int annoncerIndice() {
    int indice = (boutDePapier.getAge() * 2 + 5) * 50 + boutDePapier.getSommeArgent() - 365;
    System.out.println("[Assistant] J'annonce : " + indice + " !");
    return indice;
  }
}
