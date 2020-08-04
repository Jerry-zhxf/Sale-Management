package org.zhxf.sale.web;

import java.util.List;

import org.zhxf.sale.domain.User;
import org.zhxf.sale.service.UserService;
import org.zhxf.sale.utils.SysConstant;

import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends BaseAction implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	private User model = new User();

	@Override
	public User getModel() {
		return model;
	}

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String login() throws Exception {
		
		if (super.getCurUser() != null) {
			return SUCCESS;
		}
		if (model.getName() != null) {
			String hql = "from User where name=?";
			List<User> list = userService.find(hql, User.class, new Object[] { model.getName() });
			if (list != null) {
				User login = list.get(0);
				if (login != null && login.getPassword().equals(model.getPassword())) {
					super.push(login);
					session.setAttribute(SysConstant.CURRENT_USER_INFO, login); // 记录session
					put("curUser", login);
					return SUCCESS;
				}
			}
		}
		return "login";
	}

	public String logout() throws Exception {
		session.removeAttribute(SysConstant.CURRENT_USER_INFO); // 删除session
		return "logout";
	}

}
