
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
    "login",
    "id",
    "avatar_url",
    "gravatar_id",
    "url",
    "html_url",
    "followers_url",
    "following_url",
    "gists_url",
    "starred_url",
    "subscriptions_url",
    "organizations_url",
    "repos_url",
    "events_url",
    "received_events_url",
    "type",
    "site_admin"
})
public class Owner {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("login")
    private String login;
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
    @JsonProperty("avatar_url")
    private String avatarUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gravatar_id")
    private String gravatarId;
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
    @JsonProperty("html_url")
    private String htmlUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("followers_url")
    private String followersUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("following_url")
    private String followingUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gists_url")
    private String gistsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("starred_url")
    private String starredUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("organizations_url")
    private String organizationsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("repos_url")
    private String reposUrl;
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
    @JsonProperty("received_events_url")
    private String receivedEventsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("site_admin")
    private Boolean siteAdmin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The login
     */
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    /**
     * 
     * (Required)
     * 
     * @param login
     *     The login
     */
    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

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
     *     The avatarUrl
     */
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param avatarUrl
     *     The avatar_url
     */
    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The gravatarId
     */
    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     * 
     * (Required)
     * 
     * @param gravatarId
     *     The gravatar_id
     */
    @JsonProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
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
     *     The followersUrl
     */
    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param followersUrl
     *     The followers_url
     */
    @JsonProperty("followers_url")
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The followingUrl
     */
    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param followingUrl
     *     The following_url
     */
    @JsonProperty("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The gistsUrl
     */
    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param gistsUrl
     *     The gists_url
     */
    @JsonProperty("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The starredUrl
     */
    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param starredUrl
     *     The starred_url
     */
    @JsonProperty("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The subscriptionsUrl
     */
    @JsonProperty("subscriptions_url")
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param subscriptionsUrl
     *     The subscriptions_url
     */
    @JsonProperty("subscriptions_url")
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The organizationsUrl
     */
    @JsonProperty("organizations_url")
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param organizationsUrl
     *     The organizations_url
     */
    @JsonProperty("organizations_url")
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The reposUrl
     */
    @JsonProperty("repos_url")
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param reposUrl
     *     The repos_url
     */
    @JsonProperty("repos_url")
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
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
     *     The receivedEventsUrl
     */
    @JsonProperty("received_events_url")
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param receivedEventsUrl
     *     The received_events_url
     */
    @JsonProperty("received_events_url")
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The siteAdmin
     */
    @JsonProperty("site_admin")
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    /**
     * 
     * (Required)
     * 
     * @param siteAdmin
     *     The site_admin
     */
    @JsonProperty("site_admin")
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
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
