package cn.itcast.dao;

import cn.itcast.domain.Items;

//@Component
public interface ItemsDao {

//    @Select("select * from items where id = #{id}")
    Items findById(int id);
}
