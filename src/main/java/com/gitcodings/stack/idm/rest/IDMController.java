package com.gitcodings.stack.idm.rest;

import com.gitcodings.stack.idm.component.IDMAuthenticationManager;
import com.gitcodings.stack.idm.component.IDMJwtManager;
import com.gitcodings.stack.idm.util.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IDMController
{
    private final IDMAuthenticationManager authManager;
    private final IDMJwtManager            jwtManager;
    private final Validate                 validate;

    @Autowired
    public IDMController(IDMAuthenticationManager authManager,
                         IDMJwtManager jwtManager,
                         Validate validate)
    {
        this.authManager = authManager;
        this.jwtManager = jwtManager;
        this.validate = validate;
    }
}
