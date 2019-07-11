package lits.com.springboot.controller;

import lits.com.springboot.config.MockConfiguration;
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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes ={MockConfiguration.class})
public class PersonControllerTests {

//    private static final String SIGN_UP_URL = "/api/persons";
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private PersonController userController;
//
//    @Autowired
//    private PersonRepository personRepository;
//
//    @Test
//    public void shouldSuccessUser() throws  Exception {
//
//
//
//        User user = new User();
//        user.setEmail("someUser");
//        user.setPassword("some pass");
//
//        //personRepository.save(user);
//
//        JSONObject userJson = new JSONObject(user);
//        System.out.println();
//        mockMvc.perform(post(SIGN_UP_URL)
//                .accept("aplication/json")
//                .contentType(MediaType.ALL)
//                .content(userJson.toString()))
//                .andDo(MockMvcResultHandlers.print()
//                );
//
//    }

}
