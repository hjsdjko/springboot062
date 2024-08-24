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


import com.cl.dao.ShangjialeixingDao;
import com.cl.entity.ShangjialeixingEntity;
import com.cl.service.ShangjialeixingService;
import com.cl.entity.view.ShangjialeixingView;

@Service("shangjialeixingService")
public class ShangjialeixingServiceImpl extends ServiceImpl<ShangjialeixingDao, ShangjialeixingEntity> implements ShangjialeixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjialeixingEntity> page = this.selectPage(
                new Query<ShangjialeixingEntity>(params).getPage(),
                new EntityWrapper<ShangjialeixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjialeixingEntity> wrapper) {
		  Page<ShangjialeixingView> page =new Query<ShangjialeixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShangjialeixingView> selectListView(Wrapper<ShangjialeixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjialeixingView selectView(Wrapper<ShangjialeixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
