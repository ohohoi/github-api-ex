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

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public String getPublicMembersUrl() {
        return publicMembersUrl;
    }

    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
    }

    public Long getTotalPrivateRepos() {
        return totalPrivateRepos;
    }

    public void setTotalPrivateRepos(Long totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
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
