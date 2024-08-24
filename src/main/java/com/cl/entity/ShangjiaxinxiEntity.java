package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商家信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
@TableName("shangjiaxinxi")
public class ShangjiaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangjiaxinxiEntity() {
		
	}
	
	public ShangjiaxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商家名称
	 */
					
	private String shangjiamingcheng;
	
	/**
	 * 商家类型
	 */
					
	private String shangjialeixing;
	
	/**
	 * 商家图片
	 */
					
	private String shangjiatupian;
	
	/**
	 * 招牌菜品
	 */
					
	private String zhaopaicaipin;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 营业时间
	 */
					
	private String yingyeshijian;
	
	/**
	 * 环境设施
	 */
					
	private String huanjingsheshi;
	
	/**
	 * 商家简介
	 */
					
	private String shangjiajianjie;
	
	/**
	 * 经度
	 */
					
	private Double longitude;
	
	/**
	 * 纬度
	 */
					
	private Double latitude;
	
	/**
	 * 地址
	 */
					
	private String fulladdress;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商家名称
	 */
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
	/**
	 * 设置：商家类型
	 */
	public void setShangjialeixing(String shangjialeixing) {
		this.shangjialeixing = shangjialeixing;
	}
	/**
	 * 获取：商家类型
	 */
	public String getShangjialeixing() {
		return shangjialeixing;
	}
	/**
	 * 设置：商家图片
	 */
	public void setShangjiatupian(String shangjiatupian) {
		this.shangjiatupian = shangjiatupian;
	}
	/**
	 * 获取：商家图片
	 */
	public String getShangjiatupian() {
		return shangjiatupian;
	}
	/**
	 * 设置：招牌菜品
	 */
	public void setZhaopaicaipin(String zhaopaicaipin) {
		this.zhaopaicaipin = zhaopaicaipin;
	}
	/**
	 * 获取：招牌菜品
	 */
	public String getZhaopaicaipin() {
		return zhaopaicaipin;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：营业时间
	 */
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
	/**
	 * 设置：环境设施
	 */
	public void setHuanjingsheshi(String huanjingsheshi) {
		this.huanjingsheshi = huanjingsheshi;
	}
	/**
	 * 获取：环境设施
	 */
	public String getHuanjingsheshi() {
		return huanjingsheshi;
	}
	/**
	 * 设置：商家简介
	 */
	public void setShangjiajianjie(String shangjiajianjie) {
		this.shangjiajianjie = shangjiajianjie;
	}
	/**
	 * 获取：商家简介
	 */
	public String getShangjiajianjie() {
		return shangjiajianjie;
	}
	/**
	 * 设置：经度
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * 设置：地址
	 */
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
