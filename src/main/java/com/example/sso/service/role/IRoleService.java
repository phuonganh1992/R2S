package com.example.sso.service.role;

import com.example.sso.domain.Role;
import com.example.sso.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
    Role create(String name);
}
