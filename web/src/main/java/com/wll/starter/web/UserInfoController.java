package com.wll.starter.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wll.starter.dao.UserInfoRepository;
import com.wll.starter.dao.model.UserInfo;

import antlr.collections.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	private UserInfoRepository userRepository;

	@RequestMapping("/list")
	public Iterable<UserInfo> listUser() {
		Iterable<UserInfo> userList = userRepository.findAll();
		return userList;
	}

	/**
	 * 根据id查询User实体
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/{id}")
	public UserInfo getUserById(@PathVariable long id) {
		UserInfo user = userRepository.findOne(id);

		return user;
	}

	/**
	 * 保存user实体
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String insertUser(UserInfo user) {
		userRepository.save(user);

		return "";
	}

	/**
	 * 根据id更新user实体
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String updateUserWithId(@PathVariable long id, HttpServletRequest request) {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		UserInfo updateUser = new UserInfo();
		updateUser.setId(id);
		updateUser.setName(name);
		updateUser.setEmail(email);
		userRepository.save(updateUser);

		return "";
	}

	/**
	 * 根据id删除user实体
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete/{id}")
	public String deleteUserById(@PathVariable long id) {
		userRepository.delete(id);

		return "";
	}

	/**
	 * 查询user实体的总数
	 * 
	 * @return
	 */
	@RequestMapping("/total")
	public Integer getTotal() {
		Integer res = (int) userRepository.count();

		return res;
	}
}
