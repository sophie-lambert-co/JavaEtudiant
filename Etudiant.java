


// Crée une classe Etudiant avec deux attributs (nom et note), un constructeur pour initialiser ces attributs, et trois méthodes (getNom, getNote, aReussi). La méthode aReussi utilise une structure conditionnelle if-else pour déterminer si l’étudiant a réussi ou non en fonction de sa note. Enfin, dans la classe principale Main, un objet Etudiant est créé et ses informations sont affichées.

public class Etudiant {
    // variable d'instance
    private String nom;
    private double note;


// Constructeur
public Etudiant(String nom, double note){
    this.nom = nom ;
    this.note = note;
}

// Methodes getter et setter
// Methodes getter pour le nom( recuperer )
public String getNom(){
    return this.nom;
}

// Mettre le nom à jour
public void setNom(String nom){
    this.nom = nom;
}

// Methodes getter pour la note ( mettre a jour)
public double getNote(){
    return this.note;
}

// Mettre la note a jour 
public void setNote (double note){
    this.note = note;
}

// Methode Boolean pour savoir si la note est au dessus de 10 ou pas .
public Boolean aReussi(){
    if (note >= 10){
        return true;
    }
    else return false;
}}
