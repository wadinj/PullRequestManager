
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
    "label",
    "ref",
    "sha",
    "user",
    "repo"
})
public class Base {

    @JsonProperty("label")
    private String label;
    @JsonProperty("ref")
    private String ref;
    @JsonProperty("sha")
    private String sha;
    @JsonProperty("user")
    private UserBase user;
    @JsonProperty("repo")
    private RepoBase repo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The ref
     */
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    /**
     * 
     * @param ref
     *     The ref
     */
    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * 
     * @return
     *     The sha
     */
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    /**
     * 
     * @param sha
     *     The sha
     */
    @JsonProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    public UserBase getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    public void setUser(UserBase user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The repo
     */
    @JsonProperty("repo")
    public RepoBase getRepo() {
        return repo;
    }

    /**
     * 
     * @param repo
     *     The repo
     */
    @JsonProperty("repo")
    public void setRepo(RepoBase repo) {
        this.repo = repo;
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
