package org.ch.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ch.infrastructure.persistent.po.Strategy;

import java.util.List;

@Mapper
public interface IStrategyDAO {
    List<Strategy> queryStrategyList();
}
