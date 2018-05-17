package com.demo.service;

import com.demo.domain.model.Tasktrade;

public interface TasktradeService {

    public void deleteByPrimaryKey(Long trId);

    public void insert(Tasktrade record);

    public void insertSelective(Tasktrade record);

    public Tasktrade selectByPrimaryKey(Long trId);

    public void updateByPrimaryKeySelective(Tasktrade record);

    public void updateByPrimaryKey(Tasktrade record);
}
