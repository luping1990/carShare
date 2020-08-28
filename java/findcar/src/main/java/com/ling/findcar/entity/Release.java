package com.ling.findcar.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class Release {
    private Integer id;
    private String userId;
    private String startAddress;
    private String endAddress;
    private String goDate;
    private String tel;
    private String peopleCount;
    private String mark;
    private String releaseDate;
    private Boolean isShow;
    private String ftype;
    private Integer pageNum;
    private Integer pageSize;
    private List<WxUser> list;

}
