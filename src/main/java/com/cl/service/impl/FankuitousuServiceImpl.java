package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.FankuitousuDao;
import com.cl.entity.FankuitousuEntity;
import com.cl.service.FankuitousuService;
import com.cl.entity.view.FankuitousuView;

@Service("fankuitousuService")
public class FankuitousuServiceImpl extends ServiceImpl<FankuitousuDao, FankuitousuEntity> implements FankuitousuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FankuitousuEntity> page = this.selectPage(
                new Query<FankuitousuEntity>(params).getPage(),
                new EntityWrapper<FankuitousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FankuitousuEntity> wrapper) {
		  Page<FankuitousuView> page =new Query<FankuitousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FankuitousuView> selectListView(Wrapper<FankuitousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FankuitousuView selectView(Wrapper<FankuitousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
