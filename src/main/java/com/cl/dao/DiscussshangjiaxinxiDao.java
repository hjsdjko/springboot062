package com.cl.dao;

import com.cl.entity.DiscussshangjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussshangjiaxinxiView;


/**
 * 商家信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
public interface DiscussshangjiaxinxiDao extends BaseMapper<DiscussshangjiaxinxiEntity> {
	
	List<DiscussshangjiaxinxiView> selectListView(@Param("ew") Wrapper<DiscussshangjiaxinxiEntity> wrapper);

	List<DiscussshangjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshangjiaxinxiEntity> wrapper);
	
	DiscussshangjiaxinxiView selectView(@Param("ew") Wrapper<DiscussshangjiaxinxiEntity> wrapper);
	

}
