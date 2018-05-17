package com.demo.domain.mapper;

import com.demo.domain.model.Tasktrade;

public interface TasktradeMapper {
    int deleteByPrimaryKey(Long trId);

    int insert(Tasktrade record);

    int insertSelective(Tasktrade record);

    Tasktrade selectByPrimaryKey(Long trId);

    int updateByPrimaryKeySelective(Tasktrade record);

    int updateByPrimaryKey(Tasktrade record);
}