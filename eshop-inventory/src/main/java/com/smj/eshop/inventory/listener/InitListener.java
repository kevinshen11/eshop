package com.smj.eshop.inventory.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.smj.eshop.inventory.thread.RequestProcessorThreadPool;

/**
 * 系统初始化监听器
 * @author Administrator
 *
 */
public class InitListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 初始化工作线程池和内存队列
		RequestProcessorThreadPool.init();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
