package com.ohohoi.github_api_ex.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrgController {
    @PostMapping(path = "/org")
    public void registerOrg(@RequestBody String orgName) {

    }

}
