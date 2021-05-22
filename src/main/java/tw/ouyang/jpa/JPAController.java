package tw.ouyang.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPAController {

	@Autowired
	private JPARepository jpaRepository;

	@GetMapping("/jpa")
	public void jpa() {
		jpaRepository.test();
	}

}
