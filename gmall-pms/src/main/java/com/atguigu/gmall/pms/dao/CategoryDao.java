package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xzw1116
 * @email 33312386@qq.com
 * @date 2020-06-15 15:04:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
