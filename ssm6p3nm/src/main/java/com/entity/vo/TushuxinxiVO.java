package com.entity.vo;

import com.entity.TushuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 图书信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 13:51:38
 */
public class TushuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图书分类
	 */
	
	private String tushufenlei;
		
	/**
	 * isbn
	 */
	
	private String isbn;
		
	/**
	 * 图书作者
	 */
	
	private String tushuzuozhe;
		
	/**
	 * 出版社
	 */
	
	private String chubanshe;
		
	/**
	 * 图书封面
	 */
	
	private String tushufengmian;
		
	/**
	 * 图书概要
	 */
	
	private String tushugaiyao;
		
	/**
	 * 实体价格
	 */
	
	private Integer shitijiage;
		
	/**
	 * 电子版价格
	 */
	
	private Integer dianzibanjiage;
				
	
	/**
	 * 设置：图书分类
	 */
	 
	public void setTushufenlei(String tushufenlei) {
		this.tushufenlei = tushufenlei;
	}
	
	/**
	 * 获取：图书分类
	 */
	public String getTushufenlei() {
		return tushufenlei;
	}
				
	
	/**
	 * 设置：isbn
	 */
	 
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * 获取：isbn
	 */
	public String getIsbn() {
		return isbn;
	}
				
	
	/**
	 * 设置：图书作者
	 */
	 
	public void setTushuzuozhe(String tushuzuozhe) {
		this.tushuzuozhe = tushuzuozhe;
	}
	
	/**
	 * 获取：图书作者
	 */
	public String getTushuzuozhe() {
		return tushuzuozhe;
	}
				
	
	/**
	 * 设置：出版社
	 */
	 
	public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
	}
	
	/**
	 * 获取：出版社
	 */
	public String getChubanshe() {
		return chubanshe;
	}
				
	
	/**
	 * 设置：图书封面
	 */
	 
	public void setTushufengmian(String tushufengmian) {
		this.tushufengmian = tushufengmian;
	}
	
	/**
	 * 获取：图书封面
	 */
	public String getTushufengmian() {
		return tushufengmian;
	}
				
	
	/**
	 * 设置：图书概要
	 */
	 
	public void setTushugaiyao(String tushugaiyao) {
		this.tushugaiyao = tushugaiyao;
	}
	
	/**
	 * 获取：图书概要
	 */
	public String getTushugaiyao() {
		return tushugaiyao;
	}
				
	
	/**
	 * 设置：实体价格
	 */
	 
	public void setShitijiage(Integer shitijiage) {
		this.shitijiage = shitijiage;
	}
	
	/**
	 * 获取：实体价格
	 */
	public Integer getShitijiage() {
		return shitijiage;
	}
				
	
	/**
	 * 设置：电子版价格
	 */
	 
	public void setDianzibanjiage(Integer dianzibanjiage) {
		this.dianzibanjiage = dianzibanjiage;
	}
	
	/**
	 * 获取：电子版价格
	 */
	public Integer getDianzibanjiage() {
		return dianzibanjiage;
	}
			
}
