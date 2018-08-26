package com.lambert.scw.dao;

import com.lambert.scw.bean.TAuthProcessExample;
import com.lambert.scw.bean.TAuthProcessKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthProcessMapper {
    long countByExample(TAuthProcessExample example);

    int deleteByExample(TAuthProcessExample example);

    int deleteByPrimaryKey(TAuthProcessKey key);

    int insert(TAuthProcessKey record);

    int insertSelective(TAuthProcessKey record);

    List<TAuthProcessKey> selectByExample(TAuthProcessExample example);

    int updateByExampleSelective(@Param("record") TAuthProcessKey record, @Param("example") TAuthProcessExample example);

    int updateByExample(@Param("record") TAuthProcessKey record, @Param("example") TAuthProcessExample example);
}