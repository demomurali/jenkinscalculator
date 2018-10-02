package com.example.demo.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// added some content
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorResourceTestIT {

	@Autowired
	private MockMvc mockMvc;

    @Test
    public void addMessage() throws Exception {
    	MvcResult result=mockMvc.perform(get("/add/5/4")
    				.contentType(MediaType.TEXT_PLAIN_VALUE)
    			)
    		.andExpect(status().isOk())
        .andDo(print())
        .andReturn();
    		String content = result.getResponse().getContentAsString();
		assertEquals(9,Integer.parseInt(content));
    }
	
}
