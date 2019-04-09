package com.sz.earlysummer.smsbombing.module;

import com.alibaba.fastjson.JSONObject;
import com.sz.earlysummer.smsbombing.comm.HttpClientUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @auther leiyang
 * @create 2019-04-09 20:43
 */
@Component
public class BlockchainMedia {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 巴比特财经
     *
     * @return true:成功  false:失败
     */
    public boolean babite(String phone) {
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("mobile", phone);
	JSONObject result = HttpClientUtils.httpPost("https://app.blockmeta.com/w1/n/sms", jsonObject);
	logger.info(result.toJSONString());
	return result.isEmpty();
    }

    /**
     * 共享财经
     *
     * @return true:成功  false:失败
     */
    public boolean gongxiangcaijing(String phone) {
        //先获取cookie
	HttpClientUtils.httpGet("http://new.gongxiangcj.com/user_info");

	String url = "http://new.gongxiangcj.com/sendcode?remobile=Yu0olF&mobile=" + phone;
	JSONObject result = HttpClientUtils.httpGet(url);
	logger.info(result.toJSONString());
	return result.isEmpty();
    }
}
