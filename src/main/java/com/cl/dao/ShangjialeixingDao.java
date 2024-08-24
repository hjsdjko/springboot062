package com.cl.dao;

import com.cl.entity.ShangjialeixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangjialeixingView;


/**
 * 商家类型
 * 
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
public interface ShangjialeixingDao extends BaseMapper<ShangjialeixingEntity> {
	
	List<ShangjialeixingView> selectListView(@Param("ew") Wrapper<ShangjialeixingEntity> wrapper);

	List<ShangjialeixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShangjialeixingEntity> wrapper);
	
	ShangjialeixingView selectView(@Param("ew") Wrapper<ShangjialeixingEntity> wrapper);
	

}
