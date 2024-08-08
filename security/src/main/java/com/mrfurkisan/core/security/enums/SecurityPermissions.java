package com.mrfurkisan.core.security.enums;

public enum SecurityPermissions {
    //Yukarıdan aşağıya doğru seviyeler
    
    Admin(4),Intern(3),Authorized(2),Authenticated(1);

    private final int level;
    
    SecurityPermissions(int level){
        this.level = level;
    }
    public int level(){
        return this.level;
    }
}
