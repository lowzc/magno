package com.magno.dmain;

import java.io.Serializable;


/**
 * 规格表
 * 
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-13 10:41:10
 */
public class SpecificationEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//规范名称
	private String name;
	//排序
	private Integer sortOrder;
    //商户ID
    private Integer merchant_id;

	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：规范名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：规范名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：排序
	 */
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSortOrder() {
		return sortOrder;
	}
	public Integer getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(Integer merchant_id) {
		this.merchant_id = merchant_id;
	}
	
}
