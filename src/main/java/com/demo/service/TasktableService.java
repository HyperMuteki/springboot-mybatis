package com.demo.service;

import com.demo.domain.model.Tasktable;

import java.util.List;

public interface TasktableService {
    public boolean insertSelective(Tasktable record);


    public Tasktable selectByPrimaryKey(Long tid);

    public List<Tasktable> findAll();

    public List<Tasktable> selectAround(Long tid);

    List<Tasktable>  selectPositionAround(String position);

    public void deleteByPrimaryKey(Long tid);
}
