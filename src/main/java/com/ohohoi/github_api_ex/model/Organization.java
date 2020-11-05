package com.ohohoi.github_api_ex.model;

import com.google.gson.annotations.SerializedName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORG")
public class Organization {

    @Id
    @Column(name = "id")
    private Long id;

    private String login;

    private String url;

    @Column(name = "repos_url")
    @SerializedName("repos_url")
    private String reposUrl;

    @Column(name = "members_url")
    @SerializedName("members_url")
    private String membersUrl;

    @Column(name = "public_members_url")
    @SerializedName("public_members_url")
    private String publicMembersUrl;

    private String description;

    private String name;

    @Column(name = "public_repos")
    @SerializedName("public_repos")
    private Long publicRepos;

    @Column(name = "total_private_repos")
    @SerializedName("total_private_repos")
    private Long totalPrivateRepos;

    public Organization() { };

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getUrl() {
        return url;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public String getMembersUrl() {
        return membersUrl;
    }

    public String getPublicMembersUrl() {
        return publicMembersUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Long getPublicRepos() {
        return publicRepos;
    }

    public Long getTotalPrivateRepos() {
        return totalPrivateRepos;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", url='" + url + '\'' +
                ", reposUrl='" + reposUrl + '\'' +
                ", membersUrl='" + membersUrl + '\'' +
                ", publicMembersUrl='" + publicMembersUrl + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", publicRepos=" + publicRepos +
                ", totalPrivateRepos=" + totalPrivateRepos +
                '}';
    }
}
