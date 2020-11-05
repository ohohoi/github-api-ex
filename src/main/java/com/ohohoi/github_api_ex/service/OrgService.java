package com.ohohoi.github_api_ex.service;

import com.ohohoi.github_api_ex.github.GithubClient;
import com.ohohoi.github_api_ex.model.Organization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrgService {
    private final GithubClient githubClient;

    public OrgService(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    public void registerOrg(String orgLogin) {
        Organization organization = githubClient.getOrg(orgLogin);

        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info(organization.toString());
    }
}
