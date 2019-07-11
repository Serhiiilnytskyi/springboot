package lits.com.springboot.repository;

import lits.com.springboot.exception.CityNotFoundException;
import lits.com.springboot.model.City;
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

//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private  PersonRepository personRepository;
//
//    @Test
//    public void whenFindByName_thenReturnEmployee() {
//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();
//
//        person1.setName("John");
//        person2.setName("Joel");
//        person3.setName("Woodie");
//        Person [] personArray = {person1, person2, person3};
//        List<Person> persons = Arrays.asList(personArray);
//        entityManager.persist(persons);
//        entityManager.flush();
//
//        List<Person> found = personRepository.findAllByNameContains("Jo");
//
//        assertThat(found.getName())
//                .isEqualTo(lviv.getName());
//    }
//
//    @Test
//    public void whenDeleteById_thenReturnNull() {
//        City lviv = new City();
//        lviv.setName("Lviv");
//
//        entityManager.persist(lviv);sitoryTest
//        entityManager.flush();
//
//        City found = personRepository.findByName(lviv.getName())
//                .orElseThrow(() -> new CityNotFoundException("City not found"));
//
//        assertThat(found.getName())
//                .isEqualTo(lviv.getName());
//    }

}
