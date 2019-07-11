package lits.com.springboot.repository;

import lits.com.springboot.exception.PetNotFoundException;
import lits.com.springboot.model.Pet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PetRepositoryIntegrationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private  PetRepository petRepository;

    @Test
    public void whenFindByName_thenReturnPet() {
        Pet pet = new Pet();
        pet.setName("Dog");

        entityManager.persist(pet);
        entityManager.flush();

        List<Pet> found = petRepository.findByName(pet.getName());

        assertThat(found.get(1).getName())
                .isEqualTo(pet.getName());
    }

    @Test
    public void whenDeleteById_thenDeletingShouldBeSuccessful() {
        Pet pet = new Pet();
        pet.setId("aasdfgnbawembvr");
        entityManager.persist(pet);
        entityManager.flush();

        petRepository.deleteById(pet.getId());
        assertThat(petRepository.count()).isEqualTo(0);
    }

}
