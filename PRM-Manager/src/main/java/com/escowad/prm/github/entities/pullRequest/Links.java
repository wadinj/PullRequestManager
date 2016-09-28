
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
    "self",
    "html",
    "issue",
    "comments",
    "review_comments",
    "review_comment",
    "commits",
    "statuses"
})
public class Links {

    @JsonProperty("self")
    private Self self;
    @JsonProperty("html")
    private Html html;
    @JsonProperty("issue")
    private Issue issue;
    @JsonProperty("comments")
    private Comments comments;
    @JsonProperty("review_comments")
    private ReviewComments reviewComments;
    @JsonProperty("review_comment")
    private ReviewComment reviewComment;
    @JsonProperty("commits")
    private Commits commits;
    @JsonProperty("statuses")
    private Statuses statuses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The self
     */
    @JsonProperty("self")
    public Self getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    @JsonProperty("self")
    public void setSelf(Self self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The html
     */
    @JsonProperty("html")
    public Html getHtml() {
        return html;
    }

    /**
     * 
     * @param html
     *     The html
     */
    @JsonProperty("html")
    public void setHtml(Html html) {
        this.html = html;
    }

    /**
     * 
     * @return
     *     The issue
     */
    @JsonProperty("issue")
    public Issue getIssue() {
        return issue;
    }

    /**
     * 
     * @param issue
     *     The issue
     */
    @JsonProperty("issue")
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    /**
     * 
     * @return
     *     The comments
     */
    @JsonProperty("comments")
    public Comments getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    @JsonProperty("comments")
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    /**
     * 
     * @return
     *     The reviewComments
     */
    @JsonProperty("review_comments")
    public ReviewComments getReviewComments() {
        return reviewComments;
    }

    /**
     * 
     * @param reviewComments
     *     The review_comments
     */
    @JsonProperty("review_comments")
    public void setReviewComments(ReviewComments reviewComments) {
        this.reviewComments = reviewComments;
    }

    /**
     * 
     * @return
     *     The reviewComment
     */
    @JsonProperty("review_comment")
    public ReviewComment getReviewComment() {
        return reviewComment;
    }

    /**
     * 
     * @param reviewComment
     *     The review_comment
     */
    @JsonProperty("review_comment")
    public void setReviewComment(ReviewComment reviewComment) {
        this.reviewComment = reviewComment;
    }

    /**
     * 
     * @return
     *     The commits
     */
    @JsonProperty("commits")
    public Commits getCommits() {
        return commits;
    }

    /**
     * 
     * @param commits
     *     The commits
     */
    @JsonProperty("commits")
    public void setCommits(Commits commits) {
        this.commits = commits;
    }

    /**
     * 
     * @return
     *     The statuses
     */
    @JsonProperty("statuses")
    public Statuses getStatuses() {
        return statuses;
    }

    /**
     * 
     * @param statuses
     *     The statuses
     */
    @JsonProperty("statuses")
    public void setStatuses(Statuses statuses) {
        this.statuses = statuses;
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
