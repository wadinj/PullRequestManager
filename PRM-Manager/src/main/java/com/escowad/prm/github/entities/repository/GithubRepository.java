
package com.escowad.prm.github.entities.repository;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "name",
    "full_name",
    "owner",
    "private",
    "html_url",
    "description",
    "fork",
    "url",
    "forks_url",
    "keys_url",
    "collaborators_url",
    "teams_url",
    "hooks_url",
    "issue_events_url",
    "events_url",
    "assignees_url",
    "branches_url",
    "tags_url",
    "blobs_url",
    "git_tags_url",
    "git_refs_url",
    "trees_url",
    "statuses_url",
    "languages_url",
    "stargazers_url",
    "contributors_url",
    "subscribers_url",
    "subscription_url",
    "commits_url",
    "git_commits_url",
    "comments_url",
    "issue_comment_url",
    "contents_url",
    "compare_url",
    "merges_url",
    "archive_url",
    "downloads_url",
    "issues_url",
    "pulls_url",
    "milestones_url",
    "notifications_url",
    "labels_url",
    "releases_url",
    "deployments_url",
    "created_at",
    "updated_at",
    "pushed_at",
    "git_url",
    "ssh_url",
    "clone_url",
    "svn_url",
    "homepage",
    "size",
    "stargazers_count",
    "watchers_count",
    "language",
    "has_issues",
    "has_downloads",
    "has_wiki",
    "has_pages",
    "forks_count",
    "mirror_url",
    "open_issues_count",
    "forks",
    "open_issues",
    "watchers",
    "default_branch"
})
public class GithubRepository {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("full_name")
    private String fullName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("owner")
    private Owner owner;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("private")
    private Boolean _private;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html_url")
    private String htmlUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fork")
    private Boolean fork;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    private String url;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_url")
    private String forksUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keys_url")
    private String keysUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams_url")
    private String teamsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hooks_url")
    private String hooksUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_events_url")
    private String issueEventsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("events_url")
    private String eventsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignees_url")
    private String assigneesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("branches_url")
    private String branchesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags_url")
    private String tagsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blobs_url")
    private String blobsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_tags_url")
    private String gitTagsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_refs_url")
    private String gitRefsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("trees_url")
    private String treesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statuses_url")
    private String statusesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("languages_url")
    private String languagesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_url")
    private String stargazersUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contributors_url")
    private String contributorsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscribers_url")
    private String subscribersUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscription_url")
    private String subscriptionUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commits_url")
    private String commitsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments_url")
    private String commentsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_comment_url")
    private String issueCommentUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contents_url")
    private String contentsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("compare_url")
    private String compareUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merges_url")
    private String mergesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("archive_url")
    private String archiveUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("downloads_url")
    private String downloadsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issues_url")
    private String issuesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pulls_url")
    private String pullsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("milestones_url")
    private String milestonesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("labels_url")
    private String labelsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("releases_url")
    private String releasesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deployments_url")
    private String deploymentsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushed_at")
    private String pushedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_url")
    private String gitUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssh_url")
    private String sshUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clone_url")
    private String cloneUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("svn_url")
    private String svnUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("homepage")
    private Object homepage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    private Integer size;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_count")
    private Integer stargazersCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("watchers_count")
    private Integer watchersCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    private Object language;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_issues")
    private Boolean hasIssues;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_downloads")
    private Boolean hasDownloads;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_wiki")
    private Boolean hasWiki;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_pages")
    private Boolean hasPages;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_count")
    private Integer forksCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mirror_url")
    private Object mirrorUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks")
    private Integer forks;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_issues")
    private Integer openIssues;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("watchers")
    private Integer watchers;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("default_branch")
    private String defaultBranch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fullName
     */
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * (Required)
     * 
     * @param fullName
     *     The full_name
     */
    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The owner
     */
    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    /**
     * 
     * (Required)
     * 
     * @param owner
     *     The owner
     */
    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The _private
     */
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * 
     * (Required)
     * 
     * @param _private
     *     The private
     */
    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The htmlUrl
     */
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param htmlUrl
     *     The html_url
     */
    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fork
     */
    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    /**
     * 
     * (Required)
     * 
     * @param fork
     *     The fork
     */
    @JsonProperty("fork")
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The forksUrl
     */
    @JsonProperty("forks_url")
    public String getForksUrl() {
        return forksUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param forksUrl
     *     The forks_url
     */
    @JsonProperty("forks_url")
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The keysUrl
     */
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param keysUrl
     *     The keys_url
     */
    @JsonProperty("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The collaboratorsUrl
     */
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param collaboratorsUrl
     *     The collaborators_url
     */
    @JsonProperty("collaborators_url")
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The teamsUrl
     */
    @JsonProperty("teams_url")
    public String getTeamsUrl() {
        return teamsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param teamsUrl
     *     The teams_url
     */
    @JsonProperty("teams_url")
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The hooksUrl
     */
    @JsonProperty("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param hooksUrl
     *     The hooks_url
     */
    @JsonProperty("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The issueEventsUrl
     */
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param issueEventsUrl
     *     The issue_events_url
     */
    @JsonProperty("issue_events_url")
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The eventsUrl
     */
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param eventsUrl
     *     The events_url
     */
    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The assigneesUrl
     */
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param assigneesUrl
     *     The assignees_url
     */
    @JsonProperty("assignees_url")
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The branchesUrl
     */
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param branchesUrl
     *     The branches_url
     */
    @JsonProperty("branches_url")
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The tagsUrl
     */
    @JsonProperty("tags_url")
    public String getTagsUrl() {
        return tagsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param tagsUrl
     *     The tags_url
     */
    @JsonProperty("tags_url")
    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The blobsUrl
     */
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param blobsUrl
     *     The blobs_url
     */
    @JsonProperty("blobs_url")
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The gitTagsUrl
     */
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param gitTagsUrl
     *     The git_tags_url
     */
    @JsonProperty("git_tags_url")
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The gitRefsUrl
     */
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param gitRefsUrl
     *     The git_refs_url
     */
    @JsonProperty("git_refs_url")
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The treesUrl
     */
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param treesUrl
     *     The trees_url
     */
    @JsonProperty("trees_url")
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The statusesUrl
     */
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param statusesUrl
     *     The statuses_url
     */
    @JsonProperty("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The languagesUrl
     */
    @JsonProperty("languages_url")
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param languagesUrl
     *     The languages_url
     */
    @JsonProperty("languages_url")
    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The stargazersUrl
     */
    @JsonProperty("stargazers_url")
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param stargazersUrl
     *     The stargazers_url
     */
    @JsonProperty("stargazers_url")
    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The contributorsUrl
     */
    @JsonProperty("contributors_url")
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param contributorsUrl
     *     The contributors_url
     */
    @JsonProperty("contributors_url")
    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The subscribersUrl
     */
    @JsonProperty("subscribers_url")
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param subscribersUrl
     *     The subscribers_url
     */
    @JsonProperty("subscribers_url")
    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The subscriptionUrl
     */
    @JsonProperty("subscription_url")
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param subscriptionUrl
     *     The subscription_url
     */
    @JsonProperty("subscription_url")
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The commitsUrl
     */
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param commitsUrl
     *     The commits_url
     */
    @JsonProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The gitCommitsUrl
     */
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param gitCommitsUrl
     *     The git_commits_url
     */
    @JsonProperty("git_commits_url")
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The commentsUrl
     */
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param commentsUrl
     *     The comments_url
     */
    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The issueCommentUrl
     */
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param issueCommentUrl
     *     The issue_comment_url
     */
    @JsonProperty("issue_comment_url")
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The contentsUrl
     */
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param contentsUrl
     *     The contents_url
     */
    @JsonProperty("contents_url")
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The compareUrl
     */
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param compareUrl
     *     The compare_url
     */
    @JsonProperty("compare_url")
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mergesUrl
     */
    @JsonProperty("merges_url")
    public String getMergesUrl() {
        return mergesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param mergesUrl
     *     The merges_url
     */
    @JsonProperty("merges_url")
    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The archiveUrl
     */
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param archiveUrl
     *     The archive_url
     */
    @JsonProperty("archive_url")
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The downloadsUrl
     */
    @JsonProperty("downloads_url")
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param downloadsUrl
     *     The downloads_url
     */
    @JsonProperty("downloads_url")
    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The issuesUrl
     */
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param issuesUrl
     *     The issues_url
     */
    @JsonProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The pullsUrl
     */
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param pullsUrl
     *     The pulls_url
     */
    @JsonProperty("pulls_url")
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The milestonesUrl
     */
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param milestonesUrl
     *     The milestones_url
     */
    @JsonProperty("milestones_url")
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The notificationsUrl
     */
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param notificationsUrl
     *     The notifications_url
     */
    @JsonProperty("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The labelsUrl
     */
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param labelsUrl
     *     The labels_url
     */
    @JsonProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The releasesUrl
     */
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param releasesUrl
     *     The releases_url
     */
    @JsonProperty("releases_url")
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The deploymentsUrl
     */
    @JsonProperty("deployments_url")
    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param deploymentsUrl
     *     The deployments_url
     */
    @JsonProperty("deployments_url")
    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * (Required)
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The pushedAt
     */
    @JsonProperty("pushed_at")
    public String getPushedAt() {
        return pushedAt;
    }

    /**
     * 
     * (Required)
     * 
     * @param pushedAt
     *     The pushed_at
     */
    @JsonProperty("pushed_at")
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The gitUrl
     */
    @JsonProperty("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param gitUrl
     *     The git_url
     */
    @JsonProperty("git_url")
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sshUrl
     */
    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param sshUrl
     *     The ssh_url
     */
    @JsonProperty("ssh_url")
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The cloneUrl
     */
    @JsonProperty("clone_url")
    public String getCloneUrl() {
        return cloneUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param cloneUrl
     *     The clone_url
     */
    @JsonProperty("clone_url")
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The svnUrl
     */
    @JsonProperty("svn_url")
    public String getSvnUrl() {
        return svnUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param svnUrl
     *     The svn_url
     */
    @JsonProperty("svn_url")
    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The homepage
     */
    @JsonProperty("homepage")
    public Object getHomepage() {
        return homepage;
    }

    /**
     * 
     * (Required)
     * 
     * @param homepage
     *     The homepage
     */
    @JsonProperty("homepage")
    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * (Required)
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The stargazersCount
     */
    @JsonProperty("stargazers_count")
    public Integer getStargazersCount() {
        return stargazersCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param stargazersCount
     *     The stargazers_count
     */
    @JsonProperty("stargazers_count")
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The watchersCount
     */
    @JsonProperty("watchers_count")
    public Integer getWatchersCount() {
        return watchersCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param watchersCount
     *     The watchers_count
     */
    @JsonProperty("watchers_count")
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public Object getLanguage() {
        return language;
    }

    /**
     * 
     * (Required)
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(Object language) {
        this.language = language;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The hasIssues
     */
    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    /**
     * 
     * (Required)
     * 
     * @param hasIssues
     *     The has_issues
     */
    @JsonProperty("has_issues")
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The hasDownloads
     */
    @JsonProperty("has_downloads")
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    /**
     * 
     * (Required)
     * 
     * @param hasDownloads
     *     The has_downloads
     */
    @JsonProperty("has_downloads")
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The hasWiki
     */
    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    /**
     * 
     * (Required)
     * 
     * @param hasWiki
     *     The has_wiki
     */
    @JsonProperty("has_wiki")
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The hasPages
     */
    @JsonProperty("has_pages")
    public Boolean getHasPages() {
        return hasPages;
    }

    /**
     * 
     * (Required)
     * 
     * @param hasPages
     *     The has_pages
     */
    @JsonProperty("has_pages")
    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The forksCount
     */
    @JsonProperty("forks_count")
    public Integer getForksCount() {
        return forksCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param forksCount
     *     The forks_count
     */
    @JsonProperty("forks_count")
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mirrorUrl
     */
    @JsonProperty("mirror_url")
    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param mirrorUrl
     *     The mirror_url
     */
    @JsonProperty("mirror_url")
    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The openIssuesCount
     */
    @JsonProperty("open_issues_count")
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    /**
     * 
     * (Required)
     * 
     * @param openIssuesCount
     *     The open_issues_count
     */
    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The forks
     */
    @JsonProperty("forks")
    public Integer getForks() {
        return forks;
    }

    /**
     * 
     * (Required)
     * 
     * @param forks
     *     The forks
     */
    @JsonProperty("forks")
    public void setForks(Integer forks) {
        this.forks = forks;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The openIssues
     */
    @JsonProperty("open_issues")
    public Integer getOpenIssues() {
        return openIssues;
    }

    /**
     * 
     * (Required)
     * 
     * @param openIssues
     *     The open_issues
     */
    @JsonProperty("open_issues")
    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The watchers
     */
    @JsonProperty("watchers")
    public Integer getWatchers() {
        return watchers;
    }

    /**
     * 
     * (Required)
     * 
     * @param watchers
     *     The watchers
     */
    @JsonProperty("watchers")
    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The defaultBranch
     */
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * 
     * (Required)
     * 
     * @param defaultBranch
     *     The default_branch
     */
    @JsonProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
