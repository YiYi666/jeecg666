package com.jeecg.task.service;
import com.jeecg.task.entity.FeedbackEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface FeedbackServiceI extends CommonService{
	
 	public void delete(FeedbackEntity entity) throws Exception;
 	
 	public Serializable save(FeedbackEntity entity) throws Exception;
 	
 	public void saveOrUpdate(FeedbackEntity entity) throws Exception;
 	
}
