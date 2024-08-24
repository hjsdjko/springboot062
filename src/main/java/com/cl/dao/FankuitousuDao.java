package com.cl.dao;

import com.cl.entity.FankuitousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FankuitousuView;


/**
 * 反馈投诉
 * 
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
public interface FankuitousuDao extends BaseMapper<FankuitousuEntity> {
	
	List<FankuitousuView> selectListView(@Param("ew") Wrapper<FankuitousuEntity> wrapper);

	List<FankuitousuView> selectListView(Pagination page,@Param("ew") Wrapper<FankuitousuEntity> wrapper);
	
	FankuitousuView selectView(@Param("ew") Wrapper<FankuitousuEntity> wrapper);
	

}
