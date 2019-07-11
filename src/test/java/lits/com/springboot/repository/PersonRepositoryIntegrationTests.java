package lits.com.springboot.repository;

import lits.com.springboot.exception.PersonNotFoundException;
import lits.com.springboot.model.Person;
import lits.com.springboot.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryIntegrationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private  PersonRepository personRepository;

    @Test
    public void whenFindByName_thenReturnPerson() {
        Person person = new Person();
        person.setName("Lviv");
        person.setAge(20);

        entityManager.persist(person);
        entityManager.flush();

        List<Person> found = personRepository.findByNameAndAge(person.getName(), person.getAge());

        assertThat(found.get(1).getName())
                .isEqualTo(person.getName());
        assertThat(found.get(1).getAge())
                .isEqualTo(person.getAge());
    }

    @Test
    public void whenDeleteById_thenDeletingShouldBeSuccessful() {
        Person person = new Person();
        person.setId(1L);
        entityManager.persist(person);
        entityManager.flush();

        personRepository.deleteById(person.getId());
        assertThat(personRepository.count()).isEqualTo(1);
    }

}
