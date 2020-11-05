package com.ohohoi.github_api_ex.controller;

import com.ohohoi.github_api_ex.service.OrgService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrgController {

    private final OrgService orgService;

    public OrgController(OrgService orgService) {
        this.orgService = orgService;
    }

    @PostMapping(path = "/org")
    public int registerOrg(@RequestBody String orgLogin) {
        return orgService.registerOrg(orgLogin);
    }

}
