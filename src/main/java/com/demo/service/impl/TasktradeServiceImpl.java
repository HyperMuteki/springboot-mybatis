package com.demo.service.impl;

import com.demo.domain.mapper.TasktradeMapper;
import com.demo.domain.model.Tasktrade;
import com.demo.service.TasktradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("tasktradeService")
public class TasktradeServiceImpl implements TasktradeService {

    @Resource
    private TasktradeMapper tasktradeMapper;

    @Override
    public void deleteByPrimaryKey(Long trId){tasktradeMapper.deleteByPrimaryKey(trId);}

    @Override
    public void insert(Tasktrade record){tasktradeMapper.insert(record);}

    @Override
    public void insertSelective(Tasktrade record){tasktradeMapper.insertSelective(record);}

    @Override
    public Tasktrade selectByPrimaryKey(Long trId){return tasktradeMapper.selectByPrimaryKey(trId);}

    @Override
    public void updateByPrimaryKeySelective(Tasktrade record){tasktradeMapper.updateByPrimaryKeySelective(record);}

    @Override
    public void updateByPrimaryKey(Tasktrade record){tasktradeMapper.updateByPrimaryKey(record);}
}
