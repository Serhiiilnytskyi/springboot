package lits.com.springboot.repository;

import lits.com.springboot.exception.UserNotFoundException;
import lits.com.springboot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private  UserRepository userRepository;

    @Test
    public void whenFindByName_thenReturnUser() {
        User user = new User();
        user.setEmail("abc@abc.abc");

        entityManager.persist(user);
        entityManager.flush();

        User found = userRepository.findOneByEmail(user.getEmail())
                .orElseThrow(() -> new UserNotFoundException("User not found"));

        assertThat(found.getEmail())
                .isEqualTo(user.getEmail());
    }

    @Test
    public void whenDeleteById_thenDeletingShouldBeSuccessful() {
        User user = new User();
        user.setId(1L);
        entityManager.persist(user);
        entityManager.flush();

        userRepository.deleteById(user.getId());
        assertThat(userRepository.count()).isEqualTo(0);
    }

}
