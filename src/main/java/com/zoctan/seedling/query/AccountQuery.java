package com.zoctan.seedling.query;

import lombok.Builder;

import java.io.Serializable;

/**
 * 账户查询实体
 *
 * @author Zoctan
 * @date 2018/07/15
 */
@Builder
public class AccountQuery implements Serializable {
  /** 账户Id */
  private final Long id;

  /** 邮箱 */
  private final String email;

  /** 账户名 */
  private final String name;

  /** 密码 */
  private final String password;
}
