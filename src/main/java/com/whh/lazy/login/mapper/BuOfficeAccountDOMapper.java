package com.whh.lazy.login.mapper;

import com.whh.lazy.login.model.BuOfficeAccountDO;
import com.whh.lazy.login.model.BuOfficeAccountDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuOfficeAccountDOMapper {
    long countByExample(BuOfficeAccountDOExample example);

    int deleteByExample(BuOfficeAccountDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BuOfficeAccountDO record);

    int insertSelective(BuOfficeAccountDO record);

    List<BuOfficeAccountDO> selectByExample(BuOfficeAccountDOExample example);

    BuOfficeAccountDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BuOfficeAccountDO record, @Param("example") BuOfficeAccountDOExample example);

    int updateByExample(@Param("record") BuOfficeAccountDO record, @Param("example") BuOfficeAccountDOExample example);

    int updateByPrimaryKeySelective(BuOfficeAccountDO record);

    int updateByPrimaryKey(BuOfficeAccountDO record);
}