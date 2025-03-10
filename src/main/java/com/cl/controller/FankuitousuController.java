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

import com.cl.entity.FankuitousuEntity;
import com.cl.entity.view.FankuitousuView;

import com.cl.service.FankuitousuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 反馈投诉
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
@RestController
@RequestMapping("/fankuitousu")
public class FankuitousuController {
    @Autowired
    private FankuitousuService fankuitousuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FankuitousuEntity fankuitousu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fankuitousu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FankuitousuEntity> ew = new EntityWrapper<FankuitousuEntity>();

		PageUtils page = fankuitousuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fankuitousu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FankuitousuEntity fankuitousu, 
		HttpServletRequest request){
        EntityWrapper<FankuitousuEntity> ew = new EntityWrapper<FankuitousuEntity>();

		PageUtils page = fankuitousuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fankuitousu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FankuitousuEntity fankuitousu){
       	EntityWrapper<FankuitousuEntity> ew = new EntityWrapper<FankuitousuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fankuitousu, "fankuitousu")); 
        return R.ok().put("data", fankuitousuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FankuitousuEntity fankuitousu){
        EntityWrapper< FankuitousuEntity> ew = new EntityWrapper< FankuitousuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fankuitousu, "fankuitousu")); 
		FankuitousuView fankuitousuView =  fankuitousuService.selectView(ew);
		return R.ok("查询反馈投诉成功").put("data", fankuitousuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FankuitousuEntity fankuitousu = fankuitousuService.selectById(id);
		fankuitousu = fankuitousuService.selectView(new EntityWrapper<FankuitousuEntity>().eq("id", id));
        return R.ok().put("data", fankuitousu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FankuitousuEntity fankuitousu = fankuitousuService.selectById(id);
		fankuitousu = fankuitousuService.selectView(new EntityWrapper<FankuitousuEntity>().eq("id", id));
        return R.ok().put("data", fankuitousu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FankuitousuEntity fankuitousu, HttpServletRequest request){
    	fankuitousu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fankuitousu);
        fankuitousuService.insert(fankuitousu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FankuitousuEntity fankuitousu, HttpServletRequest request){
    	fankuitousu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fankuitousu);
        fankuitousuService.insert(fankuitousu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FankuitousuEntity fankuitousu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fankuitousu);
        fankuitousuService.updateById(fankuitousu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fankuitousuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
