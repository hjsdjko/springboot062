package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ShangjiaxinxiEntity;
import com.cl.entity.view.ShangjiaxinxiView;

import com.cl.service.ShangjiaxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 商家信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
@RestController
@RequestMapping("/shangjiaxinxi")
public class ShangjiaxinxiController {
    @Autowired
    private ShangjiaxinxiService shangjiaxinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangjiaxinxiEntity shangjiaxinxi,
		HttpServletRequest request){
        EntityWrapper<ShangjiaxinxiEntity> ew = new EntityWrapper<ShangjiaxinxiEntity>();

		PageUtils page = shangjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjiaxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangjiaxinxiEntity shangjiaxinxi, 
		HttpServletRequest request){
        EntityWrapper<ShangjiaxinxiEntity> ew = new EntityWrapper<ShangjiaxinxiEntity>();

		PageUtils page = shangjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjiaxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangjiaxinxiEntity shangjiaxinxi){
       	EntityWrapper<ShangjiaxinxiEntity> ew = new EntityWrapper<ShangjiaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangjiaxinxi, "shangjiaxinxi")); 
        return R.ok().put("data", shangjiaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangjiaxinxiEntity shangjiaxinxi){
        EntityWrapper< ShangjiaxinxiEntity> ew = new EntityWrapper< ShangjiaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangjiaxinxi, "shangjiaxinxi")); 
		ShangjiaxinxiView shangjiaxinxiView =  shangjiaxinxiService.selectView(ew);
		return R.ok("查询商家信息成功").put("data", shangjiaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangjiaxinxiEntity shangjiaxinxi = shangjiaxinxiService.selectById(id);
		shangjiaxinxi = shangjiaxinxiService.selectView(new EntityWrapper<ShangjiaxinxiEntity>().eq("id", id));
        return R.ok().put("data", shangjiaxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangjiaxinxiEntity shangjiaxinxi = shangjiaxinxiService.selectById(id);
		shangjiaxinxi = shangjiaxinxiService.selectView(new EntityWrapper<ShangjiaxinxiEntity>().eq("id", id));
        return R.ok().put("data", shangjiaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangjiaxinxiEntity shangjiaxinxi, HttpServletRequest request){
    	shangjiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangjiaxinxi);
        shangjiaxinxiService.insert(shangjiaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangjiaxinxiEntity shangjiaxinxi, HttpServletRequest request){
    	shangjiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangjiaxinxi);
        shangjiaxinxiService.insert(shangjiaxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShangjiaxinxiEntity shangjiaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangjiaxinxi);
        shangjiaxinxiService.updateById(shangjiaxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangjiaxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
