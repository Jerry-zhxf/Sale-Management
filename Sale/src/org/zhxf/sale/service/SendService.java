package org.zhxf.sale.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.domain.Send;
import org.zhxf.sale.utils.Page;

public interface SendService {
	// 查询所有，带条件查询
	public List<Send> find(String hql, Class<Send> entityClass, Object[] params);

	// 获取一条记录
	public Send get(Class<Send> entityClass, Serializable id);

	// 分页查询，将数据封装到一个page分页工具类对象
	public Page<Send> findPage(String hql, Page<Send> page, Class<Send> entityClass, Object[] params);

	// 新增和修改保存
	public void saveOrUpdate(Send entity);

	// 批量新增和修改保存
	public void saveOrUpdateAll(Collection<Send> entitys);

	// 单条删除，按id
	public void deleteById(Class<Send> entityClass, Serializable id);

	// 批量删除
	public void delete(Class<Send> entityClass, Serializable[] ids);
}
