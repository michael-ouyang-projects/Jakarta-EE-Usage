package tw.ouyang.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class JPARepository {

	@PersistenceContext
	public EntityManager entityManager;

	@Transactional
	public void test() {
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setFirstName("James");
		customer1.setLastName("McKenzie");
		customer1.setEmail("jamesm@notreal.com");

		Customer customer2 = new Customer();
		customer2.setCustomerId(2);
		customer2.setFirstName("Charles");
		customer2.setLastName("Jonson");
		customer2.setEmail("cjohnson@phony.org");

		entityManager.persist(customer1);
		entityManager.persist(customer2);

		Customer customer3 = entityManager.find(Customer.class, 2);
		customer3.setLastName("Johnson");

		customer1.setFirstName("YES");

//		entityManager.remove(customer1);
	}

	public void callRuntimeException() {
		throw new RuntimeException();
	}

}
