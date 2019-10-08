package sportif;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Représente une Equipe. C'est-à-dire un ensemble de personnes pouvant 
 * s'inscrire à une compétition.
 * 
 */

public abstract class Equipe 
{
	private String sport, nom;
	private int score = 0;
	
	public String toStringScore() {
		return "score= [" + score + "]";
	}

	public String getSport() {
		return this.getClass().getSimpleName();
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void incrementScore(int score) {
		this.score += score;
	}
	
	
	@Override
	public String toString() {
		return "Equipe [sport=" + this.getClass().getSimpleName() + ", nom=" + nom + ", score=" + score + "]\n";
	}
	
	public abstract void incrementA();
	
	
	public abstract void incrementB();
	
	
	public abstract void incrementC();
	
}


