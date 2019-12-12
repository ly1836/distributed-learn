package com.sz.earlysummer.smsbombing.comm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 日志工具
 * @auther leiyang
 * @create 2019-04-13 14:53
 */
public class LogUtil {

    private static Logger logger = LoggerFactory.getLogger(LogUtil.class);

    public static void info(String log){
	logger.info(log);
    }
}
