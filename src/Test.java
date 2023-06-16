package ru.neoflex.practice.controller;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc //создаёт макетный http запрос, чтобы не создавать сервер
public class MockUpTestController {

    @Autowired
    private MockMvc mockMvc;

    //методы тестов
    @Test
    public void Plus() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/plus/2/2") )
                .andExpect(MockMvcResultMatchers.content().string("4"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void Minus() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/minus/5/3") )
                .andExpect(MockMvcResultMatchers.content().string("2"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void MinusMaxValue() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/minus/890/2147483648")) //MaxValue Int
                .andExpect(MockMvcResultMatchers.content().string(""))
                .andDo(MockMvcResultHandlers.print());
    }


    @Test
    public void PlusMinValue() throws Exception {
        this.mockMvc


                .perform(MockMvcRequestBuilders.get("/plus/-2147483828/-388") )
                .andExpect(MockMvcResultMatchers.content().string("2147483080"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void Plus01() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/plus/-120/150") )
                .andExpect(MockMvcResultMatchers.content().string("30"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void Minus01() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/minus/526/695") )
                .andExpect(MockMvcResultMatchers.content().string("-169"))
                .andDo(MockMvcResultHandlers.print());
    }
}


