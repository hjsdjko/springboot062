package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShangjialeixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangjialeixingView;


/**
 * 商家类型
 *
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
public interface ShangjialeixingService extends IService<ShangjialeixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjialeixingView> selectListView(Wrapper<ShangjialeixingEntity> wrapper);
   	
   	ShangjialeixingView selectView(@Param("ew") Wrapper<ShangjialeixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjialeixingEntity> wrapper);
   	

}

