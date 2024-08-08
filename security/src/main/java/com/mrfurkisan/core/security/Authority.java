package com.mrfurkisan.core.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.mrfurkisan.core.security.enums.DomainPermissions;
import com.mrfurkisan.core.security.enums.SecurityPermissions;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface Authority {

    SecurityPermissions security() default SecurityPermissions.Authenticated;

    DomainPermissions[] domains() default { DomainPermissions.USER };
    
}
