package org.ch.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ch.infrastructure.persistent.po.Award;

import java.util.List;

/**
 * @author CH
 * 奖品表
 */
@Mapper
public interface IAwardDAO {

    List<Award> queryAwardList();
}
