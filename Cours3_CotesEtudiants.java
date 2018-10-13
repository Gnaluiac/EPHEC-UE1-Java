// @Author Gianluca Lucchesi

public class Cours3_CotesEtudiants{
  public static void main (String[] args){
    int psr = 1;
    double resultat1 = 0;
    double resultat2 = 0;
    int nombreEchecsCours1 = 0;
    int nombreEchecsCours2 = 0;
    int nombreEtudiantsSansEchecs = 0;
    double moyenneCours1 = 0;
    double moyenneCours2 = 0;
    int nombreEtudiants = 0;
    
    while (psr != 0) { // Tant que le matricule n'est pas égal à 0 le programme boucle
       System.out.println("Entrez le numéro de matricule de l'étudiant :");
       psr = Clavier.lireInt();
       if (psr == 0) // Si on entre le nombre 0 le programme note les moyennes etc. et s'arrête
       {
         System.out.println("Il y a " + nombreEtudiantsSansEchecs + " élève(s) sans échecs dans la classe.");
         System.out.println("Il y a " + nombreEchecsCours1 + " échecs pour le cours #1.");
         System.out.println("Il y a " + nombreEchecsCours2 + " échecs pour le cours #2.");
         System.out.println("La moyenne pour le cours #1 est de " + String.format("%.2f", (moyenneCours1/nombreEtudiants)) + " sur 20");
         System.out.println("La moyenne pour le cours #2 est de " + String.format("%.2f", (moyenneCours2/nombreEtudiants)) + " sur 20");
       }else{
       nombreEtudiants++;
       System.out.println("Entrez son résultat sur 20 pour le cours #1.");
       resultat1 = Clavier.lireDouble();
       System.out.println("Entrez son résultat sur 20 pour le cours #2.");
       resultat2 = Clavier.lireDouble();
       double moyenne = ((resultat1 + resultat2)/2);
       System.out.println("La moyenne de l'étudiant est de " + moyenne + "/20.");
       moyenneCours1 = (moyenneCours1 + resultat1);
       moyenneCours2 = (moyenneCours2 + resultat2);
      if (resultat1 >= 10 && resultat2 >= 10) // Si l'étudiant n'a aucun échecs
      {
        System.out.println("L'étudiant n'a pas d'échecs.");
        nombreEtudiantsSansEchecs++;
      } else if (resultat1 >= 10 && resultat2 < 10) // Si l'étudiant a un échec pour le cours 2 mais pas pour le cours 1
        {
          System.out.println("L'étudiant a un échec.");
          nombreEchecsCours2++;
      } else if (resultat1 < 10 && resultat2 >= 10) // Si l'étudiant a un échec pour le cours 1 mais pas pour le cours 2
      {
        System.out.println("L'étudiant a un échec.");
        nombreEchecsCours1++;
        } else {
            System.out.println("L'étudiant a deux échecs."); // Si l'étudiant a un échec pour les deux matières
            nombreEchecsCours1++;
            nombreEchecsCours2++;
    }
   }
  }
 }
}