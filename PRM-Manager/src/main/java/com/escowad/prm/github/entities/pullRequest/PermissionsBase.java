
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
    "admin",
    "push",
    "pull"
})
public class PermissionsBase {

    @JsonProperty("admin")
    private Boolean admin;
    @JsonProperty("push")
    private Boolean push;
    @JsonProperty("pull")
    private Boolean pull;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The admin
     */
    @JsonProperty("admin")
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * 
     * @param admin
     *     The admin
     */
    @JsonProperty("admin")
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * 
     * @return
     *     The push
     */
    @JsonProperty("push")
    public Boolean getPush() {
        return push;
    }

    /**
     * 
     * @param push
     *     The push
     */
    @JsonProperty("push")
    public void setPush(Boolean push) {
        this.push = push;
    }

    /**
     * 
     * @return
     *     The pull
     */
    @JsonProperty("pull")
    public Boolean getPull() {
        return pull;
    }

    /**
     * 
     * @param pull
     *     The pull
     */
    @JsonProperty("pull")
    public void setPull(Boolean pull) {
        this.pull = pull;
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
