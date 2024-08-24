package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShangjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangjiaxinxiView;


/**
 * 商家信息
 *
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
public interface ShangjiaxinxiService extends IService<ShangjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiaxinxiView> selectListView(Wrapper<ShangjiaxinxiEntity> wrapper);
   	
   	ShangjiaxinxiView selectView(@Param("ew") Wrapper<ShangjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiaxinxiEntity> wrapper);
   	

}

