package com.winter.mapper;

import com.winter.model.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}