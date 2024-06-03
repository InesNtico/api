package com.openclassrooms.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc // pour qu'on puisse utiliser un objet de type mock
public class EmployeeControllerTest {
    //on veut vérifier la récup de la liste de tous les employés

    @Autowired
    public MockMvc mockMvc;

    @Test //pour que la méthode soit détectée comme un test à effectuer
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees")).andExpect(status().isOk()).andExpect(jsonPath("$[0].firstName", is("Laurent"))); //isOK pour vérifier que la requête a bien fonctionné
    } //fonctionne

// 2e andexpect pour vérifier le contenu de la requête
//$[0] : l'expression évaluée est le 1er elmnt de la liste d'employés. Ici on veut évaluer le prénom donc on écrit $[0].firstName
// l'expression à trouver est le prénom du 1er employé de la liste, donc Laurent

    /*@Test
    public void testDeleteEmployee() throws Exception {
        mockMvc.perform(delete("/employee/1")).andExpect(status().isOk());
    }*/ //fonctionne
}