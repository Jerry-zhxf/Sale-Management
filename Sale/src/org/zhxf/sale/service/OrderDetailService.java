package org.zhxf.sale.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.domain.OrderDetail;
import org.zhxf.sale.utils.Page;

public interface OrderDetailService {
	// 查询所有，带条件查询
	public List<OrderDetail> find(String hql, Class<OrderDetail> entityClass, Object[] params);

	// 获取一条记录
	public OrderDetail get(Class<OrderDetail> entityClass, Serializable id);

	// 分页查询，将数据封装到一个page分页工具类对象
	public Page<OrderDetail> findPage(String hql, Page<OrderDetail> page, Class<OrderDetail> entityClass, Object[] params);

	// 新增和修改保存
	public void saveOrUpdate(OrderDetail entity);

	// 批量新增和修改保存
	public void saveOrUpdateAll(Collection<OrderDetail> entitys);

	// 单条删除，按id
	public void deleteById(Class<OrderDetail> entityClass, Serializable id);

	// 批量删除
	public void delete(Class<OrderDetail> entityClass, Serializable[] ids);
}
