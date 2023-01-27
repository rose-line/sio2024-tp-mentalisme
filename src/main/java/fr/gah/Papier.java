package fr.gah;

public class Papier {
  private int âge;
  private int sommeArgent;

  public void setAge(int âge) {
    this.âge = âge;
  }

  public void setSommeArgent(int sommeArgent) {
    this.sommeArgent = sommeArgent;
  }

  public String toString() {
    String res = "âge : " + âge + " ; somme d'argent : " + sommeArgent;
    return res;
  }

  public int getAge() {
    return âge;
  }

  public int getSommeArgent() {
    return sommeArgent;
  }
}
