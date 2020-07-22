package com.couyis.common.web;

import com.couyis.common.web.bean.PageBean;

public interface IService<T> {
	/**
	 * 保存当前实体
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void save(T t);

	/**
	 * 更新当前实体
	 * 
	 * @param t
	 */
	public void update(T t);

	/**
	 * 根据主键ID获取当前实体
	 * 
	 * @param id
	 * @return
	 */
	public T findById(String id);

	/**
	 * 更具主键删除当前数据
	 * 
	 * @param id
	 */
	public void delete(String id);

	/**
	 * 分页查询
	 * 
	 * @param pageBean
	 * @return
	 */
	public PageBean findPage(PageBean pageBean);
}
