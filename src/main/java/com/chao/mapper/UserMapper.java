package com.chao.mapper;

import com.chao.bean.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    UserDO selectById(@Param("id") Integer id);

}
