package org.zhxf.sale.web;

//临时记录表
import java.util.List;

import org.zhxf.sale.domain.LocalTemporaryRecord;
import org.zhxf.sale.domain.Vip;
import org.zhxf.sale.service.LocalTemporaryRecordService;
import org.zhxf.sale.service.VipService;
import org.zhxf.sale.utils.Page;

import com.opensymphony.xwork2.ModelDriven;

public class TemporaryAction extends BaseAction implements ModelDriven<LocalTemporaryRecord> {

	private static final long serialVersionUID = -628649677616338668L;
	private LocalTemporaryRecord model = new LocalTemporaryRecord();

	@Override
	public LocalTemporaryRecord getModel() {
		return model;
	}

	// 分页查询
	private Page<LocalTemporaryRecord> page = new Page<LocalTemporaryRecord>();
	public Page<LocalTemporaryRecord> getPage() {
		return page;
	}
	public void setPage(Page<LocalTemporaryRecord> page) {
		this.page = page;
	}
    
	private LocalTemporaryRecordService localtemporaryrecordService;
	public void setLocaltemporaryrecordService(LocalTemporaryRecordService localtemporaryrecordService) {
		this.localtemporaryrecordService = localtemporaryrecordService;
		//System.out.println(localtemporaryrecordService);
		//System.out.println(this.localtemporaryrecordService);
	}
	private VipService vipService;
	public void setVipService(VipService vipService) {
		this.vipService = vipService;
	}

	/**
	 * 分页查询
	 */
	
	public String list() throws Exception {
		String hql = "from LocalTemporaryRecord";
		//System.out.println(localtemporaryrecordService);
		localtemporaryrecordService.findPage(hql, page, LocalTemporaryRecord.class, null);  //User是实体

		// 设置分页的url地址
		page.setUrl("temporaryAction_list");

		// 将page对象压入栈顶
		super.push(page);
		return "list";
	}

	/**
	 * 查看
	 */
	public String toview() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		LocalTemporaryRecord user = localtemporaryrecordService.get(LocalTemporaryRecord.class, model.getOrderNo());

		// 放入栈顶
		super.push(user);

		// 3.跳页面
		return "toview";
	}

	/**
	 * 进入新增页面
	 */
	public String tocreate() throws Exception {
		List<Vip> vip = vipService.find("from Vip", Vip.class, null);		
		
		super.put("vip", vip);
		
		return "tocreate";
	}

	/**
	 * 保存
	 */
	public String insert() throws Exception {
		localtemporaryrecordService.saveOrUpdate(model);
		return "alist";
	}

	/**
	 * 进入修改页面
	 */
	public String toupdate() throws Exception {
		// 1.调用业务方法，根据id,得到对象
		LocalTemporaryRecord user = localtemporaryrecordService.get(LocalTemporaryRecord.class, model.getOrderNo());
		super.push(user);
		
		//List<Role> roles = roleService.find("from Role", Role.class, null);
		//super.put("roles", roles);
				
		return "toupdate";
	}

	/**
	 * 修改
	 */
	public String update() throws Exception {
		
		// 1.调用业务方法，根据id,得到对象
		LocalTemporaryRecord user = localtemporaryrecordService.get(LocalTemporaryRecord.class, model.getOrderNo());
		
		user.setVipNo(model.getVipNo());
		user.setAccuPoints(model.getAccuPoints());

		localtemporaryrecordService.saveOrUpdate(user);
				
		return "alist";
	}

	/**
	 * 删除
	 */
	public String delete() throws Exception {
		String ids[] = model.getOrderNo().split(", ");
		
		//调用业务方法，实现批量删除
		localtemporaryrecordService.delete(LocalTemporaryRecord.class, ids);
		
		return "alist";
	}
}
