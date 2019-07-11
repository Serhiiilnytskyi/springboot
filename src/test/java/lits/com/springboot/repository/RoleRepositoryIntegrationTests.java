package lits.com.springboot.repository;

import lits.com.springboot.exception.CityNotFoundException;
import lits.com.springboot.model.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class RoleRepositoryIntegrationTests {

//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private  CityRepository cityRepository;
//
//    @Test
//    public void whenFindByName_thenReturnEmployee() {
//        City lviv = new City();
//        lviv.setName("Lviv");
//
//        entityManager.persist(lviv);
//        entityManager.flush();
//
//        City found = cityRepository.findByName(lviv.getName())
//                .orElseThrow(() -> new CityNotFoundException("City not found"));
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
//        City found = cityRepository.findByName(lviv.getName())
//                .orElseThrow(() -> new CityNotFoundException("City not found"));
//
//        assertThat(found.getName())
//                .isEqualTo(lviv.getName());
//    }

}
