package org.ch.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ch.infrastructure.persistent.po.StrategyAward;

import java.util.List;

@Mapper
public interface IStrategyAwardDAO {
    List<StrategyAward> queryStrategyAwardList();
}
