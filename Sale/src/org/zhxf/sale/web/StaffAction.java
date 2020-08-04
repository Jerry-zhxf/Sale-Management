package org.zhxf.sale.web;


import java.util.List;

import org.zhxf.sale.domain.StoreInfo;
import org.zhxf.sale.service.StoreInfoService;
import org.zhxf.sale.domain.StaffInfo;
import org.zhxf.sale.service.StaffInfoService;
import org.zhxf.sale.utils.Page;

import com.opensymphony.xwork2.ModelDriven;

public class StaffAction extends BaseAction implements ModelDriven<StaffInfo> {

	private static final long serialVersionUID = -628649677616338668L;
	private StaffInfo model = new StaffInfo();

	@Override
	public StaffInfo getModel() {
		return model;
	}

	// 分页查询
	private Page<StaffInfo> page = new Page<StaffInfo>();
	public Page<StaffInfo> getPage() {
		return page;
	}
	public void setPage(Page<StaffInfo> page) {
		this.page = page;
	}

	private StaffInfoService staffInfoService;
	public void setStaffInfoService(StaffInfoService staffInfoService) {
		this.staffInfoService = staffInfoService;
	}
	private StoreInfoService storeInfoService;
	public void setStoreInfoService(StoreInfoService storeInfoService) {
		this.storeInfoService = storeInfoService;
	}

	/**
	 * 分页查询
	 */
	public String list() throws Exception {
		String hql = "from StaffInfo";

		staffInfoService.findPage(hql, page, StaffInfo.class, null);

		// 设置分页的url地址
		page.setUrl("staffAction_list");

		// 将page对象压入栈顶
		super.push(page);
		return "list";
	}

	/**
	 * 查看
	 */
	public String toview() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		StaffInfo staffInfo = staffInfoService.get(StaffInfo.class, model.getStaffNo());

		// 放入栈顶
		super.push(staffInfo);

		// 3.跳页面
		return "toview";
	}

	/**
	 * 进入新增页面
	 */
	public String tocreate() throws Exception {
		List<StoreInfo> storeInfo = storeInfoService.find("from StoreInfo", StoreInfo.class, null);
		
		super.put("storeInfo", storeInfo);
		
		return "tocreate";
	}

	/**
	 * 保存
	 */
	public String insert() throws Exception {
		staffInfoService.saveOrUpdate(model);
		return "alist";
	}

	/**
	 * 进入修改页面
	 */
	public String toupdate() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		StaffInfo staffInfo = staffInfoService.get(StaffInfo.class, model.getStaffNo());
		super.push(staffInfo);
		
		List<StoreInfo> storeInfo = storeInfoService.find("from StoreInfo", StoreInfo.class, null);		
		super.put("storeInfo", storeInfo);
				
		return "toupdate";
	}

	/**
	 * 修改
	 */
	public String update() throws Exception {
		
		// 1.调用业务方法，根据id,得到对象
		StaffInfo staffInfo = staffInfoService.get(StaffInfo.class, model.getStaffNo());
		
		staffInfo.setStoreInfo(model.getStoreInfo());
		staffInfo.setStaffName(model.getStaffName());
		staffInfo.setBasicSalary(model.getBasicSalary());
		staffInfo.setCommission(model.getCommission());

		staffInfoService.saveOrUpdate(staffInfo);
				
		return "alist";
	}

	/**
	 * 删除
	 */
	public String delete() throws Exception {
		String ids[] = model.getStaffNo().split(", ");
		
		//调用业务方法，实现批量删除
		staffInfoService.delete(StaffInfo.class, ids);
		
		return "alist";
	}
}
