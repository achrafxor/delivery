package com.company.delivery.enmus;
import org.springframework.security.core.GrantedAuthority;
public enum AuthorityEnum implements GrantedAuthority {
    ADMIN_AUTHORITY, CUSTOMER_AUTHORITY , RESTAURANT_AUTHORITY, DELIVERY_AUTHORITY;


    public String getAuthority() {
        return name();
    }
}
