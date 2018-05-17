package com.demo;

import com.demo.domain.model.Tasktable;
import com.demo.service.TasktableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TasktableTest {


    @Autowired
    private TasktableService tasktableService;

    @Test
    public void testInsert() {                  //插入task
        Tasktable tasktable = new Tasktable();
        tasktable.setTitle("33");
        tasktable.setPosition("point("+"108.9498710632 34.2588125935"+")");         //前端传来的是108.9443349838 34.2595663206格式，要拼接成point类型
        tasktableService.insertSelective(tasktable);
//        logger.debug(pageInfo.toString());
//        logger.debug(JSON.toJSONString(pageInfo));
//        System.out.println(pageInfo.toString());
//        System.out.println(JSON.toJSONString(pageInfo));
    }


    @Test
    public void testFindByTid() {           //tid找某个task
        Long i=2523674864L;
        Tasktable tasktable = new Tasktable();
        tasktable = tasktableService.selectByPrimaryKey(i);
        System.out.println(tasktable.toString());
    }


    @Test
    public void testFindAll() {             //找全部task
        List<Tasktable> list= tasktableService.findAll();
        for(Tasktable tasktable : list){
            System.out.println(tasktable.toString());
        }
    }


    @Test
    public void selectTidAround() {                //附近500米task(传入任务tid）
        Long tid=2523674858L;
        List<Tasktable> list=tasktableService.selectAround(tid);
        for(Tasktable tasktable : list){
            System.out.println(tasktable.toString());
        }
    }

    @Test
    public void selectPositionAround() {                //附近500米task(传入坐标）
        String Position="point("+"108.9498710632 34.2588125935"+")";
        List<Tasktable> list=tasktableService.selectPositionAround(Position);
        for(Tasktable tasktable : list){
            System.out.println(tasktable.toString());
        }
    }


    @Test
    public void deleteByPrimaryKey() {                //根据tid删除
       tasktableService.deleteByPrimaryKey(1L);

    }
}
