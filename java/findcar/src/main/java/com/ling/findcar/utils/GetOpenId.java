package com.ling.findcar.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author huhailong
 * get weixin openid
 */
@Component
@Slf4j
public class GetOpenId {
    @Autowired
    RestTemplate restTemplate;
    private String appId = "wx67e3bb2e8a7107fa";
    private String secretId = "8d96212fb104b1ad8776566068e9ea98";
    private String url = "https://api.weixin.qq.com/sns/jscode2session";

    public String getOpenId(String code){
        String requestUrl = url+"?appid="+appId+"&secret="+secretId+"&js_code="+code+"&grant_type=authorization_code";
        String result = restTemplate.getForObject(requestUrl,String.class);
        log.info("openid:"+result);
        return result;
    }
}
