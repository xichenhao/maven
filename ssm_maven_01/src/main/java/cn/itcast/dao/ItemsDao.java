package cn.itcast.dao;

import cn.itcast.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

//@Component
public interface ItemsDao {

//    @Select("select * from items where id = #{id}")
    Items findById(int id);
}
