package com.yang.springboottest;

import com.yang.springboottest.mapper.BlogMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DbTest {

    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;

    @Autowired
    private BlogMapper blogMapper;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();  //构造MockMvc
    }


    @Test
    public void dbTest() {
        System.out.println( blogMapper.selectBlog(1));
    }
}
