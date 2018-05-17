package com.demo.service.impl;

import com.demo.domain.mapper.TasktableMapper;
import com.demo.domain.model.Tasktable;
import com.demo.service.TasktableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("tasktableService")
public class TasktableServiceImpl implements TasktableService {

    @Resource
    private TasktableMapper tasktableMapper;

    @Override
    public boolean insertSelective(Tasktable record){
        boolean result = false;
        try {
            tasktableMapper.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Tasktable selectByPrimaryKey(Long tid){ return tasktableMapper.selectByPrimaryKey(tid); }


    @Override
    public  List<Tasktable> findAll(){
        return tasktableMapper.findAll();
    };


    @Override
    public List<Tasktable> selectAround(Long tid){return tasktableMapper.selectAround(tid);};

    @Override
    public List<Tasktable>  selectPositionAround(String position){return tasktableMapper.selectPositionAround(position);}

    @Override
    public void deleteByPrimaryKey(Long tid){tasktableMapper.deleteByPrimaryKey(tid);};
}
