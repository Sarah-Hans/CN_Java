package demenagement;

public class Demenagement {

	public static void main(String[] args) {
		int ancien_local = 34;
		int capacite_camion = 9;
		int nouveau_local = 0;
		int charge_camion = 0;
		
		while (ancien_local > 0) {
			// on traite le cas quand il reste moins de 9 cartons dans l'ancien local
			if (ancien_local < 9) {
				capacite_camion = ancien_local;
			}
			// on charge tant qu'il y a de la place dans le camion
			while(capacite_camion > 0) {
				ancien_local = ancien_local -1;
				charge_camion = charge_camion +1;
				capacite_camion = capacite_camion -1;
			}
			System.out.println("Un voyage aller de " + charge_camion + " cartons.");
			while(charge_camion != 0) {
				nouveau_local = nouveau_local + 1;
				charge_camion = charge_camion - 1;
				capacite_camion = capacite_camion +1;
			}
			System.out.println("Un voyage retour de " + charge_camion + " cartons.");
		}

	}

}