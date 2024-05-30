package com.changgou.goods.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SpecMapper {

    @Select("SELECT name,options FROM tb_spec WHERE template_id IN ( SELECT template_id FROM tb_category WHERE NAME=#{categoryName}) order by seq")
    public List<Map> findListByCategoryName(@Param("categoryName") String categoryName);
}
