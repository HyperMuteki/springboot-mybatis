package com.demo;

import com.demo.service.TasktradeService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TasktradeTest {

    @Autowired
    private TasktradeService tasktradeService;


}
