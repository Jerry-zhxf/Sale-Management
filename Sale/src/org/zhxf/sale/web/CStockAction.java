package org.zhxf.sale.web;

//公司库存
import java.util.List;

import org.zhxf.sale.domain.Cpy;
import org.zhxf.sale.domain.ItemInfo;
import org.zhxf.sale.service.CpyService;
import org.zhxf.sale.service.ItemInfoService;
import org.zhxf.sale.utils.Page;

import com.opensymphony.xwork2.ModelDriven;

public class CStockAction extends BaseAction implements ModelDriven<Cpy> {

	private static final long serialVersionUID = -628649677616338668L;
	private Cpy model = new Cpy();

	@Override
	public Cpy getModel() {
		return model;
	}

	// 分页查询
	private Page<Cpy> page = new Page<Cpy>();
	public Page<Cpy> getPage() {
		return page;
	}
	public void setPage(Page<Cpy> page) {
		this.page = page;
	}

	private CpyService cpyService;
	public void setCpyService(CpyService cpyService) {
		this.cpyService = cpyService;
	}
	private ItemInfoService iteminfoService;
	public void setItemInfoService(ItemInfoService iteminfoService) {
		this.iteminfoService = iteminfoService;
	}

	/**
	 * 分页查询
	 */
	public String list() throws Exception {
		String hql = "from Cpy";

		cpyService.findPage(hql, page, Cpy.class, null);  //User是实体

		// 设置分页的url地址
		page.setUrl("cstockAction_list");

		// 将page对象压入栈顶
		super.push(page);
		return "list";
	}

	/**
	 * 查看
	 */
	public String toview() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		Cpy cpy = cpyService.get(Cpy.class, model.getItemNo());

		// 放入栈顶
		super.push(cpy);

		// 3.跳页面
		return "toview";
	}

	/**
	 * 进入新增页面
	 */
	public String tocreate() throws Exception {
		List<ItemInfo> iteminfo = iteminfoService.find("from ItemInfo", ItemInfo.class, null);
		
		super.put("roles", iteminfo); //提交的名字叫“role”
		
		return "tocreate";
	}

	/**
	 * 保存
	 */
	public String insert() throws Exception {
		cpyService.saveOrUpdate(model);
		return "alist";
	}

	/**
	 * 进入修改页面
	 */
	public String toupdate() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		Cpy cpy = cpyService.get(Cpy.class, model.getItemNo());
		super.push(cpy);
		
		List<ItemInfo> iteminfo = iteminfoService.find("from ItemInfo", ItemInfo.class, null);
		super.put("roles", iteminfo);
				
		return "toupdate";
	}

	/**
	 * 修改
	 */
	public String update() throws Exception {
		
		// 1.调用业务方法，根据id,得到对象
		Cpy cpy = cpyService.get(Cpy.class, model.getItemNo());
		
		cpy.setStockQty(model.getStockQty());
		
		cpyService.saveOrUpdate(cpy);
				
		return "alist";
	}

	/**
	 * 删除
	 */
	public String delete() throws Exception {
		String ids[] = model.getItemNo().split(", ");
		
		//调用业务方法，实现批量删除
		cpyService.delete(Cpy.class, ids);
		
		return "alist";
	}
}
