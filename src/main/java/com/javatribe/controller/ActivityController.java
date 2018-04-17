<<<<<<< HEAD
package com.javatribe.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javatribe.pojo.Activity;
import com.javatribe.service.ActivityService;

@Controller
@RequestMapping("/Activity")
public class ActivityController {
    
	@Resource
	ActivityService activityService;
	
	//活动查询
	@RequestMapping("/activity")
	public  String activity(Model model){
		//获取活动信息列表
		List<Activity> activityList = activityService.selectAll();
	
		model.addAttribute("activityList", activityList);
		return "Activity/activity";
	}

}
=======
package com.javatribe.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javatribe.pojo.Activity;
import com.javatribe.service.ActivityService;

@Controller
@RequestMapping("/Activity")
public class ActivityController {
    
	@Resource
	ActivityService activityService;
	
	//活动查询
	@RequestMapping("/activity")
	public  String activity(Model model){
		//获取活动信息列表
		List<Activity> activityList = activityService.selectAll();
	
		model.addAttribute("activityList", activityList);
		return "Activity/activity";
	}

}
>>>>>>> 606757e18a5290dc7b1c5524ce5edd08e14e318d
