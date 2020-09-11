package com.avocado.boot.starter.log.invalid;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 系统操作日志注解
 *
 * @author ： qiaoliang
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Log {

  /**功能**/
  String businessType() default "-";

  /**操作人类别**/
  String operatorType() default "-";

  /**方法描述**/
  String discription() default "-";

}