package org.zhxf.sale.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.dao.BaseDao;
import org.zhxf.sale.domain.StoreItemsale;
import org.zhxf.sale.service.StoreItemsaleService;
import org.zhxf.sale.utils.Page;

public class StoreItemsaleServiceImpl implements StoreItemsaleService {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<StoreItemsale> find(String hql, Class<StoreItemsale> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	@Override
	public StoreItemsale get(Class<StoreItemsale> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	@Override
	public Page<StoreItemsale> findPage(String hql, Page<StoreItemsale> page, Class<StoreItemsale> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	@Override
	public void saveOrUpdate(StoreItemsale entity) {
		baseDao.saveOrUpdate(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<StoreItemsale> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	@Override
	public void deleteById(Class<StoreItemsale> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);// 删除一个对象
	}

	@Override
	public void delete(Class<StoreItemsale> entityClass, Serializable[] ids) {
		for (Serializable id : ids) {
			this.deleteById(StoreItemsale.class, id);
		}
	}

}
