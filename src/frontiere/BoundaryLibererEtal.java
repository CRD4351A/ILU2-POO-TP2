package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		//TODO a completer
		
		String[] donneesEtal = new String[5];
		donneesEtal=controlLibererEtal.libererEtal(nomVendeur);
		if(donneesEtal[0]!="true")
		{
			System.out.println("Mais vous n'etes pas inscrit sur notre marché aujourd'hui");
		}
		else
		{
			
			System.out.println("Vous avez vendu"+" "+donneesEtal[4]+" sur "+donneesEtal[3]+"  "+donneesEtal[2]);
			System.out.println("Au revoir "+nomVendeur+" passez une bonne journeé");
		}
	}

}
