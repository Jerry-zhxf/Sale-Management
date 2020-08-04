package org.zhxf.sale.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.zhxf.sale.dao.BaseDao;
import org.zhxf.sale.domain.OrderDetail;
import org.zhxf.sale.service.OrderDetailService;
import org.zhxf.sale.utils.Page;

public class OrderDetailServiceImpl implements OrderDetailService {

	private BaseDao baseDao;

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<OrderDetail> find(String hql, Class<OrderDetail> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	@Override
	public OrderDetail get(Class<OrderDetail> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	@Override
	public Page<OrderDetail> findPage(String hql, Page<OrderDetail> page, Class<OrderDetail> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	@Override
	public void saveOrUpdate(OrderDetail entity) {
		baseDao.saveOrUpdate(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<OrderDetail> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	@Override
	public void deleteById(Class<OrderDetail> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);// 删除一个对象
	}

	@Override
	public void delete(Class<OrderDetail> entityClass, Serializable[] ids) {
		for (Serializable id : ids) {
			this.deleteById(OrderDetail.class, id);
		}
	}

}
