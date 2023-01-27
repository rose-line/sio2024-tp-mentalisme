package fr.gah;

import java.util.Scanner;

public class Spectateur {
  private int âge;
  private int sommeArgent;

  public Spectateur() {
    Scanner clavier = new Scanner(System.in);
    System.out.print("[Spectateur] J'entre mon âge : ");
    âge = clavier.nextInt();
    sommeArgent = 0;
    while (sommeArgent <= 0 || sommeArgent > 99) {
      System.out.print("[Spectateur] J'entre la somme d'argent que j'ai en poche (max 99) : ");
      sommeArgent = clavier.nextInt();
    }
    // Pour Debug
    // System.out.println("Age = " + âge);
    // System.out.println("Somme = " + sommeArgent);
    clavier.close();
  }

  public void écrireInfos(Papier boutDePapier) {
    System.out
        .println("[Spectateur] J'écris les informations et je donne le papier à l'assistant.");
    boutDePapier.setAge(âge);
    boutDePapier.setSommeArgent(sommeArgent);
  }
}
