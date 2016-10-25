package com.citibank.memfis.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/***
 * 用户功能Controller类 2016.9.30
 * @author kd90303
 *
 */
@RestController
public class LoginUserController {

	LoginUserImpl lui = new LoginUserImpl();
	/***
	 * 用户登陆
	 * @param newUser
	 * @return
	 */
	@RequestMapping("/check")
	public @ResponseBody String check(@RequestBody LoginUser newUser) {
		
		return lui.loginCheck(newUser);
	}
	
	/***
	 * 用户注册
	 * @param newUser
	 * @return
	 */
	@RequestMapping("/checkRegister")
	public @ResponseBody String checkRegister(@RequestBody LoginUser newUser){
		return lui.regisCheck(newUser);
	}
	
	/***
	 * 用户修改密码
	 * @param newUser
	 * @return
	 */
	@RequestMapping("/modifyPassword")
	public @ResponseBody String modifyPassword(@RequestBody LoginUser newUser){
		return lui.modifyPassword(newUser);
	}
}
