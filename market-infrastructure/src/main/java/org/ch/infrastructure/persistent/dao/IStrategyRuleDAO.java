package org.ch.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ch.infrastructure.persistent.po.StrategyRule;

import java.util.List;

@Mapper
public interface IStrategyRuleDAO {
    List<StrategyRule> queryStrategyRuleList();

}
