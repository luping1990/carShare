package com.ling.findcar.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class WxUser {
    private Integer id;
    private String userName;
    private String openId;
    private String avatarUrl;
    private String loginDate;
    private String sex;
    private String bornDate;
    private String wxNumber;
    private String qqNumber;
    private String localAddress;
    private String workAddress;
    private String constellation;
}
