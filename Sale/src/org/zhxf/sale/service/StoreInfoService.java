package org.zhxf.sale.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.domain.StoreInfo;
import org.zhxf.sale.utils.Page;

public interface StoreInfoService {
	// 查询所有，带条件查询
	public List<StoreInfo> find(String hql, Class<StoreInfo> entityClass, Object[] params);

	// 获取一条记录
	public StoreInfo get(Class<StoreInfo> entityClass, Serializable id);

	// 分页查询，将数据封装到一个page分页工具类对象
	public Page<StoreInfo> findPage(String hql, Page<StoreInfo> page, Class<StoreInfo> entityClass, Object[] params);

	// 新增和修改保存
	public void saveOrUpdate(StoreInfo entity);

	// 批量新增和修改保存
	public void saveOrUpdateAll(Collection<StoreInfo> entitys);

	// 单条删除，按id
	public void deleteById(Class<StoreInfo> entityClass, Serializable id);

	// 批量删除
	public void delete(Class<StoreInfo> entityClass, Serializable[] ids);
}
