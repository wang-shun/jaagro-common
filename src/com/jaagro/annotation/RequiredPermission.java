package com.jaagro.annotation;

import java.lang.annotation.*;

/**
 * 权限验证注解，配合zuul拦截器使用
 *
 * @author tony
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface RequiredPermission {
    String value();
}
