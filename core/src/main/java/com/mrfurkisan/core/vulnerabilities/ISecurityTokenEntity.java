package com.mrfurkisan.core.vulnerabilities;

import com.mrfurkisan.core.models.IEntity;

public interface ISecurityTokenEntity extends IEntity<String> {
    
    public String getAudit();
    public Integer getRoleId();
    public String getDeviceId();
    public ISecurityTokenDto mapToDto();
}
