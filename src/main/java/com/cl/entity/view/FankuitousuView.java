package com.cl.entity.view;

import com.cl.entity.FankuitousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 反馈投诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-08 19:44:51
 */
@TableName("fankuitousu")
public class FankuitousuView  extends FankuitousuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FankuitousuView(){
	}
 
 	public FankuitousuView(FankuitousuEntity fankuitousuEntity){
 	try {
			BeanUtils.copyProperties(this, fankuitousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
