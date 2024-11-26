public class GestionnaireNotes {

    /**
     * Affiche les notes d'un étudiant et sa moyenne.
     *
     * @param nomEtudiant Le nom de l'étudiant.
     * @param notes       Un tableau contenant les notes de l'étudiant.
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

        // Calcul et affichage de la moyenne
        double moyenne = calculerMoyenne(notes);
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Calcule la moyenne des notes.
     *
     * @param notes Un tableau contenant les notes.
     * @return La moyenne des notes.
     */
    private double calculerMoyenne(int[] notes) {
        if (notes.length == 0) {
            throw new IllegalArgumentException("Le tableau des notes ne peut pas être vide.");
        }

        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }
}
