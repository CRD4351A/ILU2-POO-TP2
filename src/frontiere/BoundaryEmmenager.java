package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					int a;
					emmenagerDruide(nomVisiteur);
					a=Clavier.entrerEntier("Quelle est votre force?");
					controlEmmenager.ajouterGaulois(nomVisiteur, a);
					break;

				case 2:
					//TODO a completer
					System.out.println("Bienvenue villageois"+nomVisiteur);
					int d;
					d=Clavier.entrerEntier("Quelle est votre force?");
					controlEmmenager.ajouterGaulois(nomVisiteur, d);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		//TODO a completer
		int a,b,c;
		System.out.println("Bienvenue druide"+nomVisiteur);
		a=Clavier.entrerEntier("Quelle est votre force?");
		b=Clavier.entrerEntier("Quelle est la force de la potion plus faible qui vois produissez?");
		c=Clavier.entrerEntier("Quelle est la force de la potion plus fort qui vois produissez??");
		if(b>c)
		{
			System.out.println("Attention Druide,vous vous ete trompe entre le minimum et le maximum");
		}
		while(b>c)
		{
			b=Clavier.entrerEntier("Quelle est la force de la potion plus faible qui vois produissez?");
			c=Clavier.entrerEntier("Quelle est la force de la potion plus fort qui vois produissez??");
		}
		controlEmmenager.ajouterDruide(nomVisiteur, a, b, c);
	
	}
}
