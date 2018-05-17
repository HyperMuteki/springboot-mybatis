package com.demo.domain.mapper;

import com.demo.domain.model.Tasktable;

import java.util.List;

public interface TasktableMapper {
    int deleteByPrimaryKey(Long tid);

    int insert(Tasktable record);

    int insertSelective(Tasktable record);

    Tasktable selectByPrimaryKey(Long tid);

    int updateByPrimaryKeySelective(Tasktable record);

    int updateByPrimaryKeyWithBLOBs(Tasktable record);

    int updateByPrimaryKey(Tasktable record);

    List<Tasktable> findAll();

    List<Tasktable>  selectAround(Long tid);

    List<Tasktable>  selectPositionAround(String position);
}