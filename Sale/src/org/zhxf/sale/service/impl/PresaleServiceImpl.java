package org.zhxf.sale.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.dao.BaseDao;
import org.zhxf.sale.domain.Presale;
import org.zhxf.sale.service.PresaleService;
import org.zhxf.sale.utils.Page;

public class PresaleServiceImpl implements PresaleService {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<Presale> find(String hql, Class<Presale> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	@Override
	public Presale get(Class<Presale> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	@Override
	public Page<Presale> findPage(String hql, Page<Presale> page, Class<Presale> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	@Override
	public void saveOrUpdate(Presale entity) {
		baseDao.saveOrUpdate(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<Presale> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	@Override
	public void deleteById(Class<Presale> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);// 删除一个对象
	}

	@Override
	public void delete(Class<Presale> entityClass, Serializable[] ids) {
		for (Serializable id : ids) {
			this.deleteById(Presale.class, id);
		}
	}

}
