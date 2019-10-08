package sportif;


public class Baskett extends Equipe {

	
	public Baskett(String nom) {
		super.setNom(nom);
		hibernate.Equipe.addEquipe(super.getNom(), super.getSport(), super.getScore());
	}

	@Override
	public void incrementA() {
		super.incrementScore(1);
	}

	@Override
	public void incrementB() {
		super.incrementScore(2);

	}

	@Override
	public void incrementC() {
		super.incrementScore(3);
	}




	public static void main(String[] args) {
		Baskett portland = new Baskett("portland");
//		System.out.println(portland.toString());
//		portland.incrementA();
//		System.out.println(portland.toString());
//		portland.incrementB();
//		System.out.println(portland.toString());
//		portland.incrementC();
//		System.out.println(portland.toString());

	}

}
