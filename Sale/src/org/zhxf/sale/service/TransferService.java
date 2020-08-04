package org.zhxf.sale.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.domain.Transfer;
import org.zhxf.sale.utils.Page;

public interface TransferService {
	// 查询所有，带条件查询
	public List<Transfer> find(String hql, Class<Transfer> entityClass, Object[] params);

	// 获取一条记录
	public Transfer get(Class<Transfer> entityClass, Serializable id);

	// 分页查询，将数据封装到一个page分页工具类对象
	public Page<Transfer> findPage(String hql, Page<Transfer> page, Class<Transfer> entityClass, Object[] params);

	// 新增和修改保存
	public void saveOrUpdate(Transfer entity);

	// 批量新增和修改保存
	public void saveOrUpdateAll(Collection<Transfer> entitys);

	// 单条删除，按id
	public void deleteById(Class<Transfer> entityClass, Serializable id);

	// 批量删除
	public void delete(Class<Transfer> entityClass, Serializable[] ids);
}
