package lits.com.springboot.controller;

import lits.com.springboot.config.MockConfiguration;
import lits.com.springboot.model.Person;
import lits.com.springboot.model.User;
import lits.com.springboot.repository.PersonRepository;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes ={MockConfiguration.class})
public class PersonControllerTests {

    private static final String API_PERSONS = "/api/persons";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PersonController userController;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void shouldSuccessPerson() throws  Exception {
        Person person = new Person();
        person.setName("somePerson");

        JSONObject userJson = new JSONObject(person);

        mockMvc.perform(post(API_PERSONS)
                .accept("application/json")
                .contentType(MediaType.APPLICATION_JSON)
                .content(person.toString()))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    public void givenPersonWithQueryParameterId_whenMockMVC_thenResponseOK() throws Exception {
        this.mockMvc.perform(get(API_PERSONS)
                .param("id", "1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.name").value("somePerson"));
    }

}
