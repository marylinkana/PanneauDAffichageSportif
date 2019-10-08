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
		Baskett bar�a = new Baskett("barcelone");
		System.out.println(bar�a.toString());
		bar�a.incrementA();
		System.out.println(bar�a.toString());
		bar�a.incrementB();
		System.out.println(bar�a.toString());
		bar�a.incrementC();
		System.out.println(bar�a.toString());

	}

}
