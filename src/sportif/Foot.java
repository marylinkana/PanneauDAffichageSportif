package sportif;

public class Foot extends Equipe {

	
	public Foot(String nom) {
		setNom(nom);
		hibernate.Equipe.addEquipe(super.getNom(), super.getSport(), super.getScore());
	}

	@Override
	public void incrementA() {
		super.incrementScore(1);
	}

	@Override
	public void incrementB() {
		super.incrementScore(1);

	}

	@Override
	public void incrementC() {
		super.incrementScore(1);
	}




	public static void main(String[] args) {
		Baskett barça = new Baskett("barcelone");
		System.out.println(barça.toString());
		barça.incrementA();
		System.out.println(barça.toString());
		barça.incrementB();
		System.out.println(barça.toString());
		barça.incrementC();
		System.out.println(barça.toString());

	}

}
