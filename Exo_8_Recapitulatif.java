//@author Gianluca Lucchesi

import java.util.Scanner; 

public class Exo_8_Recapitulatif {
 public static void main (String[] args){
  int [] nbCannettes = new int[8];
  double [] prix = {1.40, 1.40, 1.20, 1.20, 1.10, 1.10, 1, 1}; // on pourrait le faire avec un switch mais ici avec un tableau
  int i = 0;
  int choix = 0; 
  double change = 0;
  double prixBoisson = 0, monnaie = -1, paye = 0;
  boolean programme = true;
  boolean choixb = false;
  double [] pieces = {2, 1, 0.5, 0.2, 0.1};
  double [] nombrePieces = {0, 30, 30, 30, 30};

  do {
   for (i = 0; i < nbCannettes.length; i++){ // On va remplir le distributeur au maximum pour toutes les boissons
   nbCannettes[i] = 30;                      // On aurait pu aussi initialiser tout le tableau à 30
   }

   System.out.println("Inserez votre monnaie et terminez en entrant 0.");
   System.out.println("Pièces acceptées: 2€ - 1€ - 0.50€ - 0.20€ - 0.10€");
   Scanner sc = new Scanner(System.in);
  
   do { // TODO : la pièce correcte insérée après avoir inséré une mauvaise pièce n'est pas comptabilisé dans le montant payé total
    monnaie = sc.nextDouble();
    if (monnaie == 0){
     break;
    }
    if (monnaie == 2 || monnaie == 1 || monnaie == 0.50 || monnaie == 0.20 || monnaie == 0.10){ 
    paye = paye + monnaie;
    System.out.println("Total : " + paye + " EUR.");
    } else {
     System.out.println("Pièce non acceptée. Entrez une autre pièce.");
     monnaie = sc.nextDouble(); 
     }
    if (monnaie == 2){
     nombrePieces[0] = nombrePieces[0]+1;
    } else if (monnaie == 1){
     nombrePieces[1] = nombrePieces[1]+1;
    } else if (monnaie == 0.50){
     nombrePieces[2] = nombrePieces[2]+1;
    } else if (monnaie == 0.20){
     nombrePieces[3] = nombrePieces[3]+1;
    } else {
     nombrePieces[4] = nombrePieces[4]+1;
    }
   } while (monnaie != 0);

   /*
   for (i = 0; i < nombrePieces.length; i++){       // test pour voir le nombre de pièces
   System.out.println(pieces[i] + " EUR : " + nombrePieces[i] + " pièces");
   }
   */

   System.out.println("Entrez un nombre entre 1 et 8 relatif à la boisson de votre choix");
  
   choix = sc.nextInt();

   if (choix == 0){
    programme = false;
    break;
   }

   while (choixb == false){
    if (nbCannettes[choix-1] == 0){
     System.out.println("Votre choix est épuisé. Choissez autre chose.");
     choix = sc.nextInt();
    }
    choixb = true;
   }
   
   nbCannettes[choix-1] = nbCannettes[choix-1]-1;   // TODO: rajouter que le programme continue seulement si paye > prixBoisson
   prixBoisson = prix[choix-1];
   change = (paye-prixBoisson);
  

   System.out.print("Le prix de votre boisson s'élève à ");
   System.out.println(prixBoisson + " EUR. Vous recevrez " + (change) + " EUR de retour.");

   /*
   for (i = 0; i < nbCannettes.length; i++){          // test pour voir le contenu du distributeur
    System.out.print(nbCannettes[i] + ", ");
   }*/


   while (change > 0){                    
       for (i = 0; i < pieces.length; i++){
        if ((change >= pieces[i]) && (nombrePieces[i] >= 1)){
          nombrePieces[i] = nombrePieces[i]-1;
       change = (change-pieces[i]);
           System.out.println("Vous recevez " + pieces[i] + " EUR de retour.");
           i = i-1;
          }
         }
         break;
        }
   
   /*
   for (i = 0; i < nombrePieces.length; i++){       // test pour voir le nombre de pièces
   System.out.println(pieces[i] + " EUR : " + nombrePieces[i] + " pièces");
   }
   */

   System.out.println("Au revoir.");
   System.out.println(" ");
   paye = 0;
   prixBoisson = 0;

  } while (programme == true);
  
  System.out.println("Arrêt de la caisse");
  
 }
}