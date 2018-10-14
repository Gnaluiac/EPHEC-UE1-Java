//@Author Gianluca Lucchesi

import java.util.Scanner; // Il faut passer par la classe Scanner pour les char donc il faut d'abord l'importer
  
public class Cours3_Bridge{
  public static void main (String[] args){
    
   char valeur, couleur;
   int nombreCartes = 0, pointsHonneur = 0, pointsDistri = 0, totalPoints = 0;
   int nCouleurP = 0, nCouleurT = 0, nCouleurC = 0, nCouleurK = 0;
   
   while (nombreCartes < 13) // Change this value for quicker testing
   {
       Scanner sc = new Scanner(System.in); // Faire appel au scanner
       System.out.println("Entrez la valeur de la carte :");
       valeur = sc.next().charAt(0); // entrer la valeur de la variable "valeur"
       System.out.println("Entrez la couleur de la carte :");
       couleur = sc.next().charAt(0); // entrer la valeur de la variable "couleur"
       System.out.println("" + valeur + couleur); // Afficher la concaténation de deux char
       nombreCartes++;
       if (valeur == 'A') // Calcul nombre de points d'honneur
       {
         pointsHonneur = (pointsHonneur + 4);
       } else if (valeur == 'R')
       {
         pointsHonneur = (pointsHonneur + 3);
         System.out.println(pointsHonneur);
         } else if (valeur == 'D')
       {
         pointsHonneur = (pointsHonneur + 2);
         } else if (valeur == 'V')
       {
         pointsHonneur = (pointsHonneur + 1);
         }else{
           pointsHonneur = (pointsHonneur + 0);
         }
         if (couleur == 'P') // Calcul nombre de cartes par couleur
         {
           nCouleurP++;
         } else if (couleur == 'T')
         {
           nCouleurT++;
         } else if (couleur == 'C')
         { 
           nCouleurC++;
         } else if (couleur == 'K')
         {
           nCouleurK++;
         }
  }
   
   if (nCouleurP == 0)
   { pointsDistri = (pointsDistri + 3);
   } else if (nCouleurP == 1)
   { pointsDistri = (pointsDistri + 2);
   } else if (nCouleurP == 2)
   { pointsDistri = (pointsDistri + 1);
  } else if (nCouleurP == 3 || nCouleurP == 4)
    { pointsDistri = (pointsDistri + 0);
  }else if (nCouleurP > 5)
  { pointsDistri = (pointsDistri + (nCouleurP - 5));
  }
  
  if (nCouleurT == 0)
   { pointsDistri = (pointsDistri + 3);
   } else if (nCouleurT == 1)
   { pointsDistri = (pointsDistri + 2);
   } else if (nCouleurT == 2)
   { pointsDistri = (pointsDistri + 1);
  } else if (nCouleurT == 3 || nCouleurP == 4)
    { pointsDistri = (pointsDistri + 0);
  }else if (nCouleurT > 5)
  { pointsDistri = (pointsDistri + (nCouleurT - 5));
  }
  
  if (nCouleurC == 0)
   { pointsDistri = (pointsDistri + 3);
   } else if (nCouleurC == 1)
   { pointsDistri = (pointsDistri + 2);
   } else if (nCouleurC == 2)
   { pointsDistri = (pointsDistri + 1);
  } else if (nCouleurC == 3 || nCouleurP == 4)
    { pointsDistri = (pointsDistri + 0);
  }else if (nCouleurC > 5)
  { pointsDistri = (pointsDistri + (nCouleurC - 5));
  }
  
  if (nCouleurK == 0)
   { pointsDistri = (pointsDistri + 3);
   } else if (nCouleurK == 1)
   { pointsDistri = (pointsDistri + 2);
   } else if (nCouleurK == 2)
   { pointsDistri = (pointsDistri + 1);
  } else if (nCouleurK == 3 || nCouleurP == 4)
    { pointsDistri = (pointsDistri + 0);
  }else if (nCouleurK > 5)
  { pointsDistri = (pointsDistri + (nCouleurK - 5));
  }
   System.out.println("Le nombre de points d'honneur s'élève à " + pointsHonneur + ".");
   System.out.println("Le nombre de points de distribution s'élève à " + pointsDistri + ".");
   totalPoints = (pointsHonneur + pointsDistri);
   System.out.println("Le nombre total de points s'élève à " + totalPoints);
}
}
