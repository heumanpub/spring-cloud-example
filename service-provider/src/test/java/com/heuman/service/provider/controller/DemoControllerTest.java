package com.heuman.service.provider.controller;

import com.heuman.service.provider.ServiceProviderApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//@WebMvcTest(DemoController.class) 与@SpringBootTest冲突
public class DemoControllerTest extends ServiceProviderApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sayHelloTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/sayHello"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string("Hello"));
    }


}
