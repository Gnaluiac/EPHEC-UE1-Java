// @Author Gianluca Lucchesi

public class Exo_6b_tableau_simple{
  public static void main(String [] args){
    
    int nombre = 1, i = 0;
    int tableau[] = new int[10];
    /* int max = tableau[0], min = tableau[0];    --> en Java on ne peut pas initialiser un entier sur base de la valeur du tableau 
                                                      avant avoir d'avoir rempli le tableau */
    
    System.out.println("Entrez un entier différent que 0");
     
    for (i = 0; i <= 9 && nombre != 0 ; i++) // On ne sait apparemment pas utiliser tableau.length parce qu'il est vide à ce stage
    { 
      nombre = Clavier.lireInt();
      tableau[i] = nombre;
    }
    
    int max = tableau[0]; // On initialise seulement ici sinon la valeur initiale de max sera 0
    int indiceMax = 0;
    
    for (i = 0; i < tableau.length; i++){
    if (max < tableau[i])
    { max = tableau[i];
      indiceMax = i;
    }
    }
    
     int min = tableau[0]; /* On initialise seulement ici sinon la valeur initiale de max sera 0 et donc toujours la plus 
                              petite et prendra pas la valeur la plus petite de tableau*/
     int indiceMin = 0;
    
    for (i = 0; i < tableau.length; i++)
    if (min > tableau[i])
    { min = tableau[i];
      indiceMin = i;
    }
    
    /*for(i = 0; i < tableau.length; i++)                // Cette boucle affiche toutes les valeurs de i à titre indicatif
    {
      System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tableau[i]);
    }*/
    
    System.out.println("La valeur la plus grande est " + max + " et se trouve à l'endroit " + indiceMax + " et la plus petite est " + min + " qui se trouve à l'endroit " + indiceMin + ".");   
 
    nombre = Clavier.lireInt();
    
    for (i = 0; i < tableau.length && nombre != tableau[i]; i++);
    if (nombre == tableau[i])
    { System.out.println("Le nombre se trouve à l'endroit " + tableau[i]);
    }else{ System.out.println("Le nombre se trouve à l'endroit -1");
    }
  }
 }