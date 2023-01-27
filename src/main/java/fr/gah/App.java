package fr.gah;

public class App {
  public static void main(String[] args) {
    Assistant assistant = new Assistant();
    Spectateur moi = new Spectateur();
    Mentaliste mentaliste = new Mentaliste();
    assistant.demanderInfosSpectateur(moi);
    int indice = assistant.annoncerIndice();
    mentaliste.révélerGrâceA(indice);
  }
}
