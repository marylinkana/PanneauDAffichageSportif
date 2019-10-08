package sportif;

public class Rugby extends Equipe {

	
	public Rugby(String nom) {
		setNom(nom);
		hibernate.Equipe.addEquipe(super.getNom(), super.getSport(), super.getScore());
	}

	@Override
	public void incrementA() {
		super.incrementScore(2);
	}

	@Override
	public void incrementB() {
		super.incrementScore(3);

	}

	@Override
	public void incrementC() {
		super.incrementScore(5);
	}



	public static void main(String[] args) {
		Baskett racingmetro = new Baskett("racingmetro");
		System.out.println(racingmetro.toString());
		racingmetro.incrementA();
		System.out.println(racingmetro.toString());
		racingmetro.incrementB();
		System.out.println(racingmetro.toString());
		racingmetro.incrementC();
		System.out.println(racingmetro.toString());

	}

}
