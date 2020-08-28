package com.ling.findcar.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.ling.findcar.entity.WxUser;
import com.ling.findcar.mapper.WxUserDao;
import com.ling.findcar.utils.JsonUtil;

@Service
public class WxUserService {

    @Autowired
    WxUserDao wxUserDao;
    @Autowired
    JsonUtil util;

    public JSONObject insert(WxUser pojo){
        return util.updateJson(wxUserDao.insert(pojo));
    }

    public int insertList(List< WxUser> pojos){
        return wxUserDao.insertList(pojos);
    }

    public List<WxUser> select(WxUser pojo){
        return wxUserDao.select(pojo);
    }

    public JSONObject update(WxUser pojo){
        return util.updateJson(wxUserDao.update(pojo));
    }

    public WxUser selectByOpenId(String userId){
        return wxUserDao.selectByOpenId(userId);
    }

}
