package hibernate;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

@Entity
@Table(name = "Equipe")
public class Equipe
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_equipe")
	private int id_equipe;

	
	@Column(name = "nom_equipe")
	private String nom_equipe;
	
	@Column(name = "sport_equipe")
	private String sport_equipe;
	
	@Column(name = "score_equipe")
	private int score_equipe;
	
	Equipe(){}

	public Equipe(String nom_equipe, String sport_equipe, int score_equipe)
	{
		this.nom_equipe = nom_equipe;
		this.sport_equipe = sport_equipe;
		this.score_equipe = score_equipe;

	}
	
	public static Equipe setEquipe(String nom_equipe, String sport_equipe, int score_equipe)
	{
		return new Equipe(nom_equipe, sport_equipe, score_equipe);
	}
	
	@SuppressWarnings("rawtypes")
	public static java.util.List getEquipe() {
		
		try
		{
			Session s = hibernate.data.getSession();
			Query requete = s.createQuery("from Equipe");
			@SuppressWarnings("rawtypes")
			java.util.List result = requete.list();
			s.close();
			return result;
		}
		catch (HibernateException ex)
		{
			throw new RuntimeException("Probleme de configuration : "
					+ ex.getMessage(), ex);
		}
	}
	
	public static void addEquipe(String nom, String sport, int score) {
		 try
	  		{
	  			Session session = hibernate.data.getSession();
	  			Transaction t = session.beginTransaction();
	  			session.persist(hibernate.Equipe.setEquipe(nom, sport, score));
	  			t.commit();
	  			session.close();
	  			
	  		}
	  		catch (HibernateException ex)
	  		{
	  			throw new RuntimeException("Probleme de configuration : "
	  					+ ex.getMessage(), ex);
	  		}
	}
	
	public static void getEquipeById(int id) {
		try { 
  			  Session session = hibernate.data.getSession();
		      Equipe equipe = (Equipe) session.load(Equipe.class, new Integer(id)); 
		      System.out.println("Equipe : " + equipe.getEquipe()); 
		      session.close(); 		    
		  } 
  		  catch (HibernateException ex)
  		  {
  			  throw new RuntimeException("Probleme de configuration : "
  					  + ex.getMessage(), ex);
  		  }
	}
}
