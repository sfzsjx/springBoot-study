package com.gree.bdc.aspect.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 日志记录对象
 */
@Data
@ToString
public class OperationLog {
    /**
     * 自增id
     */
    private String id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 日志等级
     */
    private Integer level;

    /**
     * 被操作的对象
     */
    private String operationUnit;

    /**
     * 方法名
     */
    private String method;

    /**
     * 参数
     */
    private String args;

    /**
     * 操作人id
     */
    private String userId;

    /**
     * 操作人
     */
    private String userName;

    /**
     * 日志描述
     */
    private String describe;

    /**
     * 操作类型
     */
    private String operationType;

    /**
     * 方法运行时间
     */
    private Long runTime;

    /**
     * 方法返回值
     */
    private String returnValue;

}
