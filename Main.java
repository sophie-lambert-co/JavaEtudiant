


public class Main {

    public static void main( String[] args){

        // Crée un objet Etudiant ( une instance de classe)
        Etudiant unEtudiant0 = new Etudiant ( "Terence", 9);
        System.out.println("nom : "+ unEtudiant0.getNom()); // println = affiche la ligne
        System.out.println("note : "+ unEtudiant0.getNote()); // println = affiche la ligne
        System.out.println("A réussi : " + (unEtudiant0.aReussi() ? "a réussi." : "n'a pas réussi."));
        
     // Crée un objet Etudiant ( une instance de classe)
        Etudiant unEtudiant1 = new Etudiant ( "Babar", 12);
        System.out.println("nom : "+ unEtudiant1.getNom()); // println = affiche la ligne
        System.out.println("note : "+ unEtudiant1.getNote()); // println = affiche la ligne
        System.out.println("A réussi : " + (unEtudiant1.aReussi() ? "a réussi." : "n'a pas réussi."));
        
     // Crée un objet Etudiant ( une instance de classe)
        Etudiant unEtudiant2 = new Etudiant ( "Bruno", 15);
        System.out.println("nom : "+ unEtudiant2.getNom()); // println = affiche la ligne
        System.out.println("note : "+ unEtudiant2.getNote()); // println = affiche la ligne
        System.out.println("A réussi : " + (unEtudiant2.aReussi() ? "a réussi." : "n'a pas réussi."));
        
    
    }
   
}

      
        
       
    

  