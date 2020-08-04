package org.zhxf.sale.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.dao.BaseDao;
import org.zhxf.sale.domain.ItemInfo;
import org.zhxf.sale.service.ItemInfoService;
import org.zhxf.sale.utils.Page;

public class ItemInfoServiceImpl implements ItemInfoService {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<ItemInfo> find(String hql, Class<ItemInfo> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	@Override
	public ItemInfo get(Class<ItemInfo> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	@Override
	public Page<ItemInfo> findPage(String hql, Page<ItemInfo> page, Class<ItemInfo> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	@Override
	public void saveOrUpdate(ItemInfo entity) {
		baseDao.saveOrUpdate(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<ItemInfo> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	@Override
	public void deleteById(Class<ItemInfo> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);// 删除一个对象
	}

	@Override
	public void delete(Class<ItemInfo> entityClass, Serializable[] ids) {
		for (Serializable id : ids) {
			this.deleteById(ItemInfo.class, id);
		}
	}

}
