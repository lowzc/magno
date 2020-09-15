package com.magno.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * 部门管理
 *
 * @author liepngjun
 * @email 939961241@qq.com
 * @date 2017-09-17 23:58:47
 */
@Data
public class SysDeptEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//部门ID
	private Long deptId;
	//上级部门ID，一级部门为0
	private Long parentId;
	//部门名称
	private String name;
	//上级部门名称
	private String parentName;
	//排序
	private Integer orderNum;
	/**
	 * ztree属性
	 */
	private Boolean open;

	private List<?> list;
}
