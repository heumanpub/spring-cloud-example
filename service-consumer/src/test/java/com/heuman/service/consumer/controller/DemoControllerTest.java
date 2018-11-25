package com.heuman.service.consumer.controller;

import com.heuman.service.consumer.ServiceConsumerApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author heuman
 * @date 2018/11/25 19:38
 */
public class DemoControllerTest extends ServiceConsumerApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void sayHelloTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/sayHello"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string("Hello"));
    }

}
