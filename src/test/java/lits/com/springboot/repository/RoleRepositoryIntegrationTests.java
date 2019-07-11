package lits.com.springboot.repository;

import com.google.common.collect.Lists;
import lits.com.springboot.exception.RoleNotFoundException;
import lits.com.springboot.model.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RoleRepositoryIntegrationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private  RoleRepository roleRepository;

    @Test
    public void whenFindAll_thenReturnRoles() {
        Role role = new Role();
        role.setName("USER");

        entityManager.persist(role);
        entityManager.flush();

        List<Role> found = Lists.newArrayList(roleRepository.findAll());

        assertThat(found.get(1).getName())
                .isEqualTo(role.getName());
    }

    @Test
    public void whenDeleteById_thenDeletingShouldBeSuccessful() {
        Role role = new Role();
        role.setId(1L);
        entityManager.persist(role);
        entityManager.flush();

        roleRepository.deleteById(role.getId());
        assertThat(roleRepository.count()).isEqualTo(0);
    }

}
