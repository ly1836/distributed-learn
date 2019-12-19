package com.sz.earlysummer.smsbombing.module;

import com.alibaba.fastjson.JSONObject;
import com.sz.earlysummer.smsbombing.comm.HttpClientUtils;
import com.sz.earlysummer.smsbombing.comm.LogUtil;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @auther leiyang
 * @create 2019-04-09 20:43
 */
@Component
public class BlockchainMedia {

    /**
     * 巴比特财经
     * <p>
     * https://www.8btc.com/
     * </p>
     *
     * @return true:成功  false:失败
     */
    public boolean babite(String phone) {
	JSONObject jsonObject = new JSONObject();
	jsonObject.put("mobile", phone);
	JSONObject result =HttpClientUtils.httpPost("https://app.blockmeta.com/w1/n/sms", jsonObject);
	LogUtil.info(result.toJSONString());
	return result.isEmpty();
    }

    /**
     * 读币网
     * <p>
     * http://www.dubiwang.com/
     * </P>
     *
     * @return
     */
    public boolean dubiwang(String phone) {

	JSONObject result = HttpClientUtils.httpPost("http://www.dubiwang.com/Sms/send", "mobile="+phone);
	LogUtil.info("读币网:{}"+result.toJSONString());

	if(result.getInteger("status") == 1){
	    LogUtil.info("读币网:发送成功");
	}
	return result.isEmpty();
    }

    /**
     * 链头条
     * <p>
     * http://www.chaintiao.com/register/send-code.html
     * </P>
     *
     * @return
     */
    public boolean liantoutiao(String phone) {
        JSONObject param = new JSONObject();
	param.put("_csrf","SE5hMVRtUTAtLCxFHAkiAhs8KHojGjlVe3ZMXjcOA2MlBlBFOhxoRA==");
	param.put("codeType","register");
	param.put("phone",phone);

	JSONObject result = HttpClientUtils.httpPost("http://www.chaintiao.com/register/send-code.html",param);
	LogUtil.info("链头条:{}"+result.toJSONString());

	if(result.getInteger("status") == 1){
	    LogUtil.info("链头条:发送成功");
	}
	return result.isEmpty();
    }
}
