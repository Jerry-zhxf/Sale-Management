package org.zhxf.sale.web;

//会员信息

import java.util.List;

import org.zhxf.sale.domain.Vip;
import org.zhxf.sale.service.VipService;
import org.zhxf.sale.utils.Page;

import com.opensymphony.xwork2.ModelDriven;

public class VipdataAction extends BaseAction implements ModelDriven<Vip> {

	private static final long serialVersionUID = -628649677616338668L;
	private Vip model = new Vip();

	@Override
	public Vip getModel() {
		return model;
	}

	// 分页查询
	private Page<Vip> page = new Page<Vip>();
	public Page<Vip> getPage() {
		return page;
	}
	public void setPage(Page<Vip> page) {
		this.page = page;
	}

	private VipService vipService;
	public void setVipService(VipService vipService) {
		this.vipService = vipService;
	}

	/**
	 * 分页查询
	 */
	public String list() throws Exception {
		String hql = "from Vip";
		//System.out.println(vipService);
		vipService.findPage(hql, page, Vip.class, null);  //User是实体

		// 设置分页的url地址
		page.setUrl("vipdataAction_list");

		// 将page对象压入栈顶
		super.push(page);
		return "list";
	}

	/**
	 * 查看
	 */
	public String toview() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		Vip vip = vipService.get(Vip.class, model.getVipNo());

		// 放入栈顶
		super.push(vip);

		// 3.跳页面
		return "toview";
	}

	/**
	 * 进入新增页面
	 */
	public String tocreate() throws Exception {
//		List<Role> roles = roleService.find("from Role", Role.class, null);
		
//		super.put("roles", roles);
		
		return "tocreate";
	}

	/**
	 * 保存
	 */
	public String insert() throws Exception {
		vipService.saveOrUpdate(model);
		return "alist";
	}

	/**
	 * 进入修改页面
	 */
	public String toupdate() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		Vip vip = vipService.get(Vip.class, model.getVipNo());
		super.push(vip);
		
				
		return "toupdate";
	}

	/**
	 * 修改
	 */
	public String update() throws Exception {
		
		// 1.调用业务方法，根据id,得到对象
		Vip vip = vipService.get(Vip.class, model.getVipNo());
		
		vip.setCurrentPoint(model.getCurrentPoint());
		vip.setTotalPoint(model.getTotalPoint());
		
		vipService.saveOrUpdate(vip);
				
		return "alist";
	}

	/**
	 * 删除
	 */
	public String delete() throws Exception {
		String ids[] = model.getVipNo().split(", ");
		
		//调用业务方法，实现批量删除
		vipService.delete(Vip.class, ids);
		
		return "alist";
	}
}

