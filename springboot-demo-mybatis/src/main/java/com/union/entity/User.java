package com.union.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2019/6/16
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -3110110708438915336L;
    /**id*/
    private String id;
    /**用户名*/
    private String username;
    /**密码*/
    private String password;
    /**别名*/
    private String nickname;
    /**问题*/
    private String question;
    /**答案*/
    private String answer;
    /**创建时间*/
    private Date gmtCreate;
    /**修改时间*/
    private Date gmtModified;
}
