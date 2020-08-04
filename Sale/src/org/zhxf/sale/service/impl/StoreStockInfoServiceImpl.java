package org.zhxf.sale.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.dao.BaseDao;
import org.zhxf.sale.domain.StoreStockInfo;
import org.zhxf.sale.service.StoreStockInfoService;
import org.zhxf.sale.utils.Page;

public class StoreStockInfoServiceImpl implements StoreStockInfoService {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<StoreStockInfo> find(String hql, Class<StoreStockInfo> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	@Override
	public StoreStockInfo get(Class<StoreStockInfo> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	@Override
	public Page<StoreStockInfo> findPage(String hql, Page<StoreStockInfo> page, Class<StoreStockInfo> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	@Override
	public void saveOrUpdate(StoreStockInfo entity) {
		baseDao.saveOrUpdate(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<StoreStockInfo> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	@Override
	public void deleteById(Class<StoreStockInfo> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);// 删除一个对象
	}

	@Override
	public void delete(Class<StoreStockInfo> entityClass, Serializable[] ids) {
		for (Serializable id : ids) {
			this.deleteById(StoreStockInfo.class, id);
		}
	}

}
