package com.huang.springclouscommonapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HUANG
 * @date 2020/4/21 18:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * 主键
     */
    private String userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话号
     */
    private String phone;
}
