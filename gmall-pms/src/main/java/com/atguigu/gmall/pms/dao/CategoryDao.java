package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lql
 * @email lqlcom@126.com
 * @date 2020-03-11 15:19:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
