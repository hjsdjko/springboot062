package com.cl.dao;

import com.cl.entity.ShangjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangjiaxinxiView;


/**
 * 商家信息
 * 
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
public interface ShangjiaxinxiDao extends BaseMapper<ShangjiaxinxiEntity> {
	
	List<ShangjiaxinxiView> selectListView(@Param("ew") Wrapper<ShangjiaxinxiEntity> wrapper);

	List<ShangjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangjiaxinxiEntity> wrapper);
	
	ShangjiaxinxiView selectView(@Param("ew") Wrapper<ShangjiaxinxiEntity> wrapper);
	

}
