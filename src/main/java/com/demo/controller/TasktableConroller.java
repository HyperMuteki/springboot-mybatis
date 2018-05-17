package com.demo.controller;


import com.demo.domain.model.Tasktable;
import com.demo.service.TasktableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/tasktable")
public class TasktableConroller {

    @Resource
    private TasktableService tasktableService;

    @RequestMapping("/addTask")
    @ResponseBody
    public Tasktable addTask(HttpServletRequest request, Model model){

        Tasktable t = new Tasktable();
        Date currentTime = new Date();
        t.setStime(currentTime);

        t.setTitle(request.getParameter("title"));

        int num = Integer.parseInt(request.getParameter("etime"));
        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.DATE,num);
        Date endTime = ca.getTime();
        t.setEtime(endTime);

        t.setPubId(Integer.parseInt(request.getParameter("pubid")));
        t.setTag(Integer.parseInt(request.getParameter("tag")));
        t.setContent(request.getParameter("content"));
        t.setPic(request.getParameter("pic"));

        String point = request.getParameter("position");
        t.setPosition("point("+point+")");

        t.setReward(Integer.parseInt(request.getParameter("reward")));

        this.tasktableService.insertSelective(t);
        return t;
    }

    @RequestMapping("/findOneTask")
    @ResponseBody
    public String findOneTask(HttpServletRequest request, Model model){
        Long tid = Long.parseLong(request.getParameter("tid"));
        Tasktable task = new Tasktable();
        task = this.tasktableService.selectByPrimaryKey(tid);
        model.addAttribute("task",task);
        return "findOneTask";
    }

    @RequestMapping("/findAllTask")
    @ResponseBody
    public String findAllTask(Model model){
        List<Tasktable> list= tasktableService.findAll();
        model.addAttribute("taskList",list);
        return "findAllTask";
    }

    @RequestMapping("/findAround")  //附近500米task
    @ResponseBody
    public String findAlround(HttpServletRequest request, Model model){
        Long tid = Long.parseLong(request.getParameter("tid"));
        List<Tasktable> list= tasktableService.selectAround(tid);
        model.addAttribute("taskAroundList",list);
        return "findAround";
    }

    @RequestMapping("/deleteTask")
    @ResponseBody
    public String deleteTask(HttpServletRequest request, Model model){
        Long tid = Long.parseLong(request.getParameter("tid"));
        Tasktable task = this.tasktableService.selectByPrimaryKey(tid);
        Tasktable t = new Tasktable();
        if (task == null){
            String info = "不存在此任务";
            t.setInfo(info);
        }else{
            this.tasktableService.deleteByPrimaryKey(tid);
            String info = "删除成功";
            t.setInfo(info);
        }
        model.addAttribute("task",t);
        return "deleteTask";
    }
}
