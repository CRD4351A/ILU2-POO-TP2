package controleur;

import villagegaulois.Village;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		if(village.rechercherEtalVide())
		{
			return true;
		}
		return false;
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		//TODO a completer
		if(village.trouverHabitant(nomVendeur)==null)
		{
			return village.donnerNbEtal();
		}
		else
		{
			village.installerVendeur(village.trouverHabitant(nomVendeur), produit, nbProduit);
			return village.donnerNbEtal();
		}
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		if(village.trouverHabitant(nomVendeur)==null)
		{
			return false;
		}
		village.rechercherEtal(village.trouverHabitant(nomVendeur));
		return true;
	}
}
