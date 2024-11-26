public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

    // Appliquer la réduction spécifique au type de produit
    double reductionType = getReductionParType(typeProduit);
    total -= total * reductionType;

    // Appliquer une réduction supplémentaire pour les montants supérieurs à 1000
    if (total > 1000) {
        total -= total * 0.05; // Réduction supplémentaire de 5%
    }

    return total;
}
/**
 * Récupère le pourcentage de réduction applicable en fonction du type de produit.
 *
 * @param typeProduit Le type du produit (Alimentaire, Electronique, Luxe, etc.)
 * @return Le pourcentage de réduction sous forme décimale (0.05 pour 5%).
 */
private double getReductionParType(String typeProduit) {
    switch (typeProduit) {
        case "Alimentaire":
            return 0.05; // Réduction de 5%
        case "Electronique":
            return 0.10; // Réduction de 10%
        case "Luxe":
            return 0.15; // Réduction de 15%
        default:
            return 0.0; // Pas de réduction pour les autres types
    }
}
}
