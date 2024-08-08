package com.mrfurkisan.core.vulnerabilities;

import com.mrfurkisan.core.models.IDto;

public interface ISecurityTokenDto extends IDto<ISecurityTokenEntity> {
    
    public String getId();
    public String getAudit();
    public boolean isMatch(ISecurityTokenDto token);
    public boolean isMatch(ISecurityTokenEntity entity);
}
