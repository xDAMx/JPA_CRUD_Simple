package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Funcionario;

public class Programa {
	public static void main(String[] args) {
		
		Funcionario f1=new Funcionario(null,"Joao Chimpa","joao@chimpa.com");
		
		Funcionario f2=new Funcionario(null,"Maria Chimpa","maria@chimpa.com");
		
		Funcionario f3=new Funcionario(null,"Aderbal Chimpa","aderbal@chimpa.com");
		
		//System.out.println(f1);
		//System.out.println(f3);
		//System.out.println(f2);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
		System.out.println("ok");
	}
}
