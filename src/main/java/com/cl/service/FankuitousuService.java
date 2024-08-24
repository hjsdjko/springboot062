package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FankuitousuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FankuitousuView;


/**
 * 反馈投诉
 *
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
public interface FankuitousuService extends IService<FankuitousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FankuitousuView> selectListView(Wrapper<FankuitousuEntity> wrapper);
   	
   	FankuitousuView selectView(@Param("ew") Wrapper<FankuitousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FankuitousuEntity> wrapper);
   	

}

