
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
    "url",
    "html_url",
    "diff_url",
    "patch_url",
    "issue_url",
    "commits_url",
    "review_comments_url",
    "review_comment_url",
    "comments_url",
    "statuses_url",
    "number",
    "state",
    "title",
    "body",
    "assignee",
    "milestone",
    "locked",
    "created_at",
    "updated_at",
    "closed_at",
    "merged_at",
    "head",
    "base",
    "_links",
    "user"
})
public class GithubPullRequest {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("diff_url")
    private String diffUrl;
    @JsonProperty("patch_url")
    private String patchUrl;
    @JsonProperty("issue_url")
    private String issueUrl;
    @JsonProperty("commits_url")
    private String commitsUrl;
    @JsonProperty("review_comments_url")
    private String reviewCommentsUrl;
    @JsonProperty("review_comment_url")
    private String reviewCommentUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("statuses_url")
    private String statusesUrl;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("state")
    private String state;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body")
    private String body;
    @JsonProperty("assignee")
    private Assignee assignee;
    @JsonProperty("milestone")
    private Milestone milestone;
    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_at")
    private String closedAt;
    @JsonProperty("merged_at")
    private String mergedAt;
    @JsonProperty("head")
    private Head head;
    @JsonProperty("base")
    private Base base;
    @JsonProperty("_links")
    private Links links;
    @JsonProperty("user")
    private User user;
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
     *     The diffUrl
     */
    @JsonProperty("diff_url")
    public String getDiffUrl() {
        return diffUrl;
    }

    /**
     * 
     * @param diffUrl
     *     The diff_url
     */
    @JsonProperty("diff_url")
    public void setDiffUrl(String diffUrl) {
        this.diffUrl = diffUrl;
    }

    /**
     * 
     * @return
     *     The patchUrl
     */
    @JsonProperty("patch_url")
    public String getPatchUrl() {
        return patchUrl;
    }

    /**
     * 
     * @param patchUrl
     *     The patch_url
     */
    @JsonProperty("patch_url")
    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    /**
     * 
     * @return
     *     The issueUrl
     */
    @JsonProperty("issue_url")
    public String getIssueUrl() {
        return issueUrl;
    }

    /**
     * 
     * @param issueUrl
     *     The issue_url
     */
    @JsonProperty("issue_url")
    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
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
     *     The reviewCommentsUrl
     */
    @JsonProperty("review_comments_url")
    public String getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    /**
     * 
     * @param reviewCommentsUrl
     *     The review_comments_url
     */
    @JsonProperty("review_comments_url")
    public void setReviewCommentsUrl(String reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    /**
     * 
     * @return
     *     The reviewCommentUrl
     */
    @JsonProperty("review_comment_url")
    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    /**
     * 
     * @param reviewCommentUrl
     *     The review_comment_url
     */
    @JsonProperty("review_comment_url")
    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
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
     *     The number
     */
    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The body
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 
     * @return
     *     The assignee
     */
    @JsonProperty("assignee")
    public Assignee getAssignee() {
        return assignee;
    }

    /**
     * 
     * @param assignee
     *     The assignee
     */
    @JsonProperty("assignee")
    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    /**
     * 
     * @return
     *     The milestone
     */
    @JsonProperty("milestone")
    public Milestone getMilestone() {
        return milestone;
    }

    /**
     * 
     * @param milestone
     *     The milestone
     */
    @JsonProperty("milestone")
    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    /**
     * 
     * @return
     *     The locked
     */
    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 
     * @param locked
     *     The locked
     */
    @JsonProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
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
     *     The closedAt
     */
    @JsonProperty("closed_at")
    public String getClosedAt() {
        return closedAt;
    }

    /**
     * 
     * @param closedAt
     *     The closed_at
     */
    @JsonProperty("closed_at")
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    /**
     * 
     * @return
     *     The mergedAt
     */
    @JsonProperty("merged_at")
    public String getMergedAt() {
        return mergedAt;
    }

    /**
     * 
     * @param mergedAt
     *     The merged_at
     */
    @JsonProperty("merged_at")
    public void setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
    }

    /**
     * 
     * @return
     *     The head
     */
    @JsonProperty("head")
    public Head getHead() {
        return head;
    }

    /**
     * 
     * @param head
     *     The head
     */
    @JsonProperty("head")
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 
     * @return
     *     The base
     */
    @JsonProperty("base")
    public Base getBase() {
        return base;
    }

    /**
     * 
     * @param base
     *     The base
     */
    @JsonProperty("base")
    public void setBase(Base base) {
        this.base = base;
    }

    /**
     * 
     * @return
     *     The links
     */
    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The _links
     */
    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
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
