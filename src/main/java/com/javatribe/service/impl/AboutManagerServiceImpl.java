<<<<<<< HEAD
package com.javatribe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javatribe.dao.AboutManagerCustomMapper;
import com.javatribe.dao.AboutManagerMapper;
import com.javatribe.pojo.AboutManager;
import com.javatribe.service.AboutManagerService;

@Service("aboutManagerService")
public class AboutManagerServiceImpl implements AboutManagerService {

	 @Resource
	 AboutManagerCustomMapper aboutManagerCustomMapper;
	 
	public List<AboutManager> selectAll() {

        //返回管理层列表
		return aboutManagerCustomMapper.selectAll();
	}

}
=======
package com.javatribe.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javatribe.dao.AboutManagerCustomMapper;
import com.javatribe.dao.AboutManagerMapper;
import com.javatribe.pojo.AboutManager;
import com.javatribe.service.AboutManagerService;

@Service("aboutManagerService")
public class AboutManagerServiceImpl implements AboutManagerService {

	 @Resource
	 AboutManagerCustomMapper aboutManagerCustomMapper;
	 
	public List<AboutManager> selectAll() {

        //返回管理层列表
		return aboutManagerCustomMapper.selectAll();
	}

}
>>>>>>> 606757e18a5290dc7b1c5524ce5edd08e14e318d
