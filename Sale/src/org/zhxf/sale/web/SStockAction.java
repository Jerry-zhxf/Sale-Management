package org.zhxf.sale.web;

//门店库存
import java.util.List;


import org.zhxf.sale.domain.StoreStockInfo;
import org.zhxf.sale.service.StoreStockInfoService;
import org.zhxf.sale.utils.Page;

import com.opensymphony.xwork2.ModelDriven;

public class SStockAction extends BaseAction implements ModelDriven<StoreStockInfo> {

	private static final long serialVersionUID = -628649677616338668L;
	private StoreStockInfo model = new StoreStockInfo();

	@Override
	public StoreStockInfo getModel() {
		return model;
	}

	// 分页查询
	private Page<StoreStockInfo> page = new Page<StoreStockInfo>();
	public Page<StoreStockInfo> getPage() {
		return page;
	}
	public void setPage(Page<StoreStockInfo> page) {
		this.page = page;
	}

	private StoreStockInfoService ssService;
	public void setSsService(StoreStockInfoService ssService) {
		this.ssService = ssService;
	}
	/**
	 * 分页查询
	 */
	public String list() throws Exception {
		String hql = "from StoreStockInfo";

		ssService.findPage(hql, page, StoreStockInfo.class, null);  //User是实体

		// 设置分页的url地址
		page.setUrl("sstockAction_list");

		// 将page对象压入栈顶
		super.push(page);
		return "list";
	}

	/**
	 * 查看
	 */
	public String toview() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		StoreStockInfo storeStockInfo = ssService.get(StoreStockInfo.class, model.getId());

		// 放入栈顶
		super.push(storeStockInfo);

		// 3.跳页面
		return "toview";
	}

	/**
	 * 进入新增页面
	 */
	public String tocreate() throws Exception {
	//	List<ItemInfo> iteminfo = iteminfoService.find("from ItemInfo", ItemInfo.class, null);
		
	//	super.put("roles", iteminfo); //提交的名字叫“role”
		
		return "tocreate";
	}

	/**
	 * 保存
	 */
	public String insert() throws Exception {
		ssService.saveOrUpdate(model);
		return "alist";
	}

	/**
	 * 进入修改页面
	 */
//	public String toupdate() throws Exception {
//		// 1.调用业务方法，根据id,得到对象
//		StoreStockInfo cpy = ssService.get(StoreStockInfo.class, model.getItemNo());
//		super.push(cpy);
//		
//	//	List<ItemInfo> iteminfo = iteminfoService.find("from ItemInfo", ItemInfo.class, null);
//	//	super.put("roles", iteminfo);
//				
//		return "toupdate";
//	}

	/**
	 * 修改
	 */
//	public String update() throws Exception {
//		
//		// 1.调用业务方法，根据id,得到对象
//		StoreStockInfo cpy = ssService.get(StoreStockInfo.class, model.getItemNo());
//		
//	//	cpy.setStockQty(model.getStockQty());
//		
//		ssService.saveOrUpdate(cpy);
//				
//		return "alist";
//	}

	/**
	 * 删除
	 */
//	public String delete() throws Exception {
//		String ids[] = model.getItemNo().split(", ");
//		
//		//调用业务方法，实现批量删除
//		ssService.delete(StoreStockInfo.class, ids);
//		
//		return "alist";
//	}
}