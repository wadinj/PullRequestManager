
package com.escowad.prm.github.entities.pullRequest;

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
    "owner",
    "name",
    "full_name",
    "description",
    "private",
    "fork",
    "url",
    "html_url",
    "archive_url",
    "assignees_url",
    "blobs_url",
    "branches_url",
    "clone_url",
    "collaborators_url",
    "comments_url",
    "commits_url",
    "compare_url",
    "contents_url",
    "contributors_url",
    "deployments_url",
    "downloads_url",
    "events_url",
    "forks_url",
    "git_commits_url",
    "git_refs_url",
    "git_tags_url",
    "git_url",
    "hooks_url",
    "issue_comment_url",
    "issue_events_url",
    "issues_url",
    "keys_url",
    "labels_url",
    "languages_url",
    "merges_url",
    "milestones_url",
    "mirror_url",
    "notifications_url",
    "pulls_url",
    "releases_url",
    "ssh_url",
    "stargazers_url",
    "statuses_url",
    "subscribers_url",
    "subscription_url",
    "svn_url",
    "tags_url",
    "teams_url",
    "trees_url",
    "homepage",
    "language",
    "forks_count",
    "stargazers_count",
    "watchers_count",
    "size",
    "default_branch",
    "open_issues_count",
    "has_issues",
    "has_wiki",
    "has_pages",
    "has_downloads",
    "pushed_at",
    "created_at",
    "updated_at",
    "permissions"
})
public class RepoHead {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("owner")
    private OwnerHead owner;
    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("fork")
    private Boolean fork;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("archive_url")
    private String archiveUrl;
    @JsonProperty("assignees_url")
    private String assigneesUrl;
    @JsonProperty("blobs_url")
    private String blobsUrl;
    @JsonProperty("branches_url")
    private String branchesUrl;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("commits_url")
    private String commitsUrl;
    @JsonProperty("compare_url")
    private String compareUrl;
    @JsonProperty("contents_url")
    private String contentsUrl;
    @JsonProperty("contributors_url")
    private String contributorsUrl;
    @JsonProperty("deployments_url")
    private String deploymentsUrl;
    @JsonProperty("downloads_url")
    private String downloadsUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("forks_url")
    private String forksUrl;
    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;
    @JsonProperty("git_refs_url")
    private String gitRefsUrl;
    @JsonProperty("git_tags_url")
    private String gitTagsUrl;
    @JsonProperty("git_url")
    private String gitUrl;
    @JsonProperty("hooks_url")
    private String hooksUrl;
    @JsonProperty("issue_comment_url")
    private String issueCommentUrl;
    @JsonProperty("issue_events_url")
    private String issueEventsUrl;
    @JsonProperty("issues_url")
    private String issuesUrl;
    @JsonProperty("keys_url")
    private String keysUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("languages_url")
    private String languagesUrl;
    @JsonProperty("merges_url")
    private String mergesUrl;
    @JsonProperty("milestones_url")
    private String milestonesUrl;
    @JsonProperty("mirror_url")
    private String mirrorUrl;
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    @JsonProperty("pulls_url")
    private String pullsUrl;
    @JsonProperty("releases_url")
    private String releasesUrl;
    @JsonProperty("ssh_url")
    private String sshUrl;
    @JsonProperty("stargazers_url")
    private String stargazersUrl;
    @JsonProperty("statuses_url")
    private String statusesUrl;
    @JsonProperty("subscribers_url")
    private String subscribersUrl;
    @JsonProperty("subscription_url")
    private String subscriptionUrl;
    @JsonProperty("svn_url")
    private String svnUrl;
    @JsonProperty("tags_url")
    private String tagsUrl;
    @JsonProperty("teams_url")
    private String teamsUrl;
    @JsonProperty("trees_url")
    private String treesUrl;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("language")
    private Object language;
    @JsonProperty("forks_count")
    private Integer forksCount;
    @JsonProperty("stargazers_count")
    private Integer stargazersCount;
    @JsonProperty("watchers_count")
    private Integer watchersCount;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("default_branch")
    private String defaultBranch;
    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;
    @JsonProperty("has_issues")
    private Boolean hasIssues;
    @JsonProperty("has_wiki")
    private Boolean hasWiki;
    @JsonProperty("has_pages")
    private Boolean hasPages;
    @JsonProperty("has_downloads")
    private Boolean hasDownloads;
    @JsonProperty("pushed_at")
    private String pushedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("permissions")
    private PermissionsHead permissions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
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
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The owner
     */
    @JsonProperty("owner")
    public OwnerHead getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    @JsonProperty("owner")
    public void setOwner(OwnerHead owner) {
        this.owner = owner;
    }

    /**
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
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
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
     * @param fullName
     *     The full_name
     */
    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
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
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
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
     * @param _private
     *     The private
     */
    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
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
     * @param fork
     *     The fork
     */
    @JsonProperty("fork")
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    /**
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
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
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
     * @param htmlUrl
     *     The html_url
     */
    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
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
     * @param archiveUrl
     *     The archive_url
     */
    @JsonProperty("archive_url")
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    /**
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
     * @param assigneesUrl
     *     The assignees_url
     */
    @JsonProperty("assignees_url")
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    /**
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
     * @param blobsUrl
     *     The blobs_url
     */
    @JsonProperty("blobs_url")
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    /**
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
     * @param branchesUrl
     *     The branches_url
     */
    @JsonProperty("branches_url")
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    /**
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
     * @param cloneUrl
     *     The clone_url
     */
    @JsonProperty("clone_url")
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    /**
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
     * @param collaboratorsUrl
     *     The collaborators_url
     */
    @JsonProperty("collaborators_url")
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    /**
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
     * @param commentsUrl
     *     The comments_url
     */
    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
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
     * @param commitsUrl
     *     The commits_url
     */
    @JsonProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    /**
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
     * @param compareUrl
     *     The compare_url
     */
    @JsonProperty("compare_url")
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    /**
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
     * @param contentsUrl
     *     The contents_url
     */
    @JsonProperty("contents_url")
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    /**
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
     * @param contributorsUrl
     *     The contributors_url
     */
    @JsonProperty("contributors_url")
    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    /**
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
     * @param deploymentsUrl
     *     The deployments_url
     */
    @JsonProperty("deployments_url")
    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    /**
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
     * @param downloadsUrl
     *     The downloads_url
     */
    @JsonProperty("downloads_url")
    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    /**
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
     * @param eventsUrl
     *     The events_url
     */
    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
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
     * @param forksUrl
     *     The forks_url
     */
    @JsonProperty("forks_url")
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    /**
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
     * @param gitCommitsUrl
     *     The git_commits_url
     */
    @JsonProperty("git_commits_url")
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    /**
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
     * @param gitRefsUrl
     *     The git_refs_url
     */
    @JsonProperty("git_refs_url")
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    /**
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
     * @param gitTagsUrl
     *     The git_tags_url
     */
    @JsonProperty("git_tags_url")
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    /**
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
     * @param gitUrl
     *     The git_url
     */
    @JsonProperty("git_url")
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    /**
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
     * @param hooksUrl
     *     The hooks_url
     */
    @JsonProperty("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    /**
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
     * @param issueCommentUrl
     *     The issue_comment_url
     */
    @JsonProperty("issue_comment_url")
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
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
     * @param issueEventsUrl
     *     The issue_events_url
     */
    @JsonProperty("issue_events_url")
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    /**
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
     * @param issuesUrl
     *     The issues_url
     */
    @JsonProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    /**
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
     * @param keysUrl
     *     The keys_url
     */
    @JsonProperty("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    /**
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
     * @param labelsUrl
     *     The labels_url
     */
    @JsonProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    /**
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
     * @param languagesUrl
     *     The languages_url
     */
    @JsonProperty("languages_url")
    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    /**
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
     * @param mergesUrl
     *     The merges_url
     */
    @JsonProperty("merges_url")
    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    /**
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
     * @param milestonesUrl
     *     The milestones_url
     */
    @JsonProperty("milestones_url")
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    /**
     * 
     * @return
     *     The mirrorUrl
     */
    @JsonProperty("mirror_url")
    public String getMirrorUrl() {
        return mirrorUrl;
    }

    /**
     * 
     * @param mirrorUrl
     *     The mirror_url
     */
    @JsonProperty("mirror_url")
    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    /**
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
     * @param notificationsUrl
     *     The notifications_url
     */
    @JsonProperty("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    /**
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
     * @param pullsUrl
     *     The pulls_url
     */
    @JsonProperty("pulls_url")
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    /**
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
     * @param releasesUrl
     *     The releases_url
     */
    @JsonProperty("releases_url")
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    /**
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
     * @param sshUrl
     *     The ssh_url
     */
    @JsonProperty("ssh_url")
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    /**
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
     * @param stargazersUrl
     *     The stargazers_url
     */
    @JsonProperty("stargazers_url")
    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    /**
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
     * @param statusesUrl
     *     The statuses_url
     */
    @JsonProperty("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    /**
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
     * @param subscribersUrl
     *     The subscribers_url
     */
    @JsonProperty("subscribers_url")
    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    /**
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
     * @param subscriptionUrl
     *     The subscription_url
     */
    @JsonProperty("subscription_url")
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
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
     * @param svnUrl
     *     The svn_url
     */
    @JsonProperty("svn_url")
    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    /**
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
     * @param tagsUrl
     *     The tags_url
     */
    @JsonProperty("tags_url")
    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    /**
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
     * @param teamsUrl
     *     The teams_url
     */
    @JsonProperty("teams_url")
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    /**
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
     * @param treesUrl
     *     The trees_url
     */
    @JsonProperty("trees_url")
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    /**
     * 
     * @return
     *     The homepage
     */
    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    /**
     * 
     * @param homepage
     *     The homepage
     */
    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
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
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(Object language) {
        this.language = language;
    }

    /**
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
     * @param forksCount
     *     The forks_count
     */
    @JsonProperty("forks_count")
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    /**
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
     * @param stargazersCount
     *     The stargazers_count
     */
    @JsonProperty("stargazers_count")
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    /**
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
     * @param watchersCount
     *     The watchers_count
     */
    @JsonProperty("watchers_count")
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    /**
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
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
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
     * @param defaultBranch
     *     The default_branch
     */
    @JsonProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
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
     * @param openIssuesCount
     *     The open_issues_count
     */
    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    /**
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
     * @param hasIssues
     *     The has_issues
     */
    @JsonProperty("has_issues")
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    /**
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
     * @param hasWiki
     *     The has_wiki
     */
    @JsonProperty("has_wiki")
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    /**
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
     * @param hasPages
     *     The has_pages
     */
    @JsonProperty("has_pages")
    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    /**
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
     * @param hasDownloads
     *     The has_downloads
     */
    @JsonProperty("has_downloads")
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    /**
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
     * @param pushedAt
     *     The pushed_at
     */
    @JsonProperty("pushed_at")
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    /**
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
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
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
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The permissions
     */
    @JsonProperty("permissions")
    public PermissionsHead getPermissions() {
        return permissions;
    }

    /**
     * 
     * @param permissions
     *     The permissions
     */
    @JsonProperty("permissions")
    public void setPermissions(PermissionsHead permissions) {
        this.permissions = permissions;
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
