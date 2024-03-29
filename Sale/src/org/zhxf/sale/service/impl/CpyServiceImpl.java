package org.zhxf.sale.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.dao.BaseDao;
import org.zhxf.sale.domain.Cpy;
import org.zhxf.sale.service.CpyService;
import org.zhxf.sale.utils.Page;

public class CpyServiceImpl implements CpyService {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<Cpy> find(String hql, Class<Cpy> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	@Override
	public Cpy get(Class<Cpy> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	@Override
	public Page<Cpy> findPage(String hql, Page<Cpy> page, Class<Cpy> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	@Override
	public void saveOrUpdate(Cpy entity) {
		baseDao.saveOrUpdate(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<Cpy> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	@Override
	public void deleteById(Class<Cpy> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);// 删除一个对象
	}

	@Override
	public void delete(Class<Cpy> entityClass, Serializable[] ids) {
		for (Serializable id : ids) {
			this.deleteById(Cpy.class, id);
		}
	}

}
