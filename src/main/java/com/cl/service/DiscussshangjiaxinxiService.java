package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussshangjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussshangjiaxinxiView;


/**
 * 商家信息评论表
 *
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
public interface DiscussshangjiaxinxiService extends IService<DiscussshangjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshangjiaxinxiView> selectListView(Wrapper<DiscussshangjiaxinxiEntity> wrapper);
   	
   	DiscussshangjiaxinxiView selectView(@Param("ew") Wrapper<DiscussshangjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshangjiaxinxiEntity> wrapper);
   	

}
