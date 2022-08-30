
package edu.kit.datacite.kernel_4;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rights",
    "rightsURI",
    "rightsIdentifier",
    "rightsIdentifierScheme",
    "schemeURI",
    "lang"
})
@Generated("jsonschema2pojo")
public class Rights {

    @JsonProperty("rights")
    private String rights;
    @JsonProperty("rightsURI")
    private URI rightsURI;
    @JsonProperty("rightsIdentifier")
    private String rightsIdentifier;
    @JsonProperty("rightsIdentifierScheme")
    private String rightsIdentifierScheme;
    @JsonProperty("schemeURI")
    private URI schemeURI;
    @JsonProperty("lang")
    private String lang;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rights")
    public String getRights() {
        return rights;
    }

    @JsonProperty("rights")
    public void setRights(String rights) {
        this.rights = rights;
    }

    @JsonProperty("rightsURI")
    public URI getRightsURI() {
        return rightsURI;
    }

    @JsonProperty("rightsURI")
    public void setRightsURI(URI rightsURI) {
        this.rightsURI = rightsURI;
    }

    @JsonProperty("rightsIdentifier")
    public String getRightsIdentifier() {
        return rightsIdentifier;
    }

    @JsonProperty("rightsIdentifier")
    public void setRightsIdentifier(String rightsIdentifier) {
        this.rightsIdentifier = rightsIdentifier;
    }

    @JsonProperty("rightsIdentifierScheme")
    public String getRightsIdentifierScheme() {
        return rightsIdentifierScheme;
    }

    @JsonProperty("rightsIdentifierScheme")
    public void setRightsIdentifierScheme(String rightsIdentifierScheme) {
        this.rightsIdentifierScheme = rightsIdentifierScheme;
    }

    @JsonProperty("schemeURI")
    public URI getSchemeURI() {
        return schemeURI;
    }

    @JsonProperty("schemeURI")
    public void setSchemeURI(URI schemeURI) {
        this.schemeURI = schemeURI;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rights.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rights");
        sb.append('=');
        sb.append(((this.rights == null)?"<null>":this.rights));
        sb.append(',');
        sb.append("rightsURI");
        sb.append('=');
        sb.append(((this.rightsURI == null)?"<null>":this.rightsURI));
        sb.append(',');
        sb.append("rightsIdentifier");
        sb.append('=');
        sb.append(((this.rightsIdentifier == null)?"<null>":this.rightsIdentifier));
        sb.append(',');
        sb.append("rightsIdentifierScheme");
        sb.append('=');
        sb.append(((this.rightsIdentifierScheme == null)?"<null>":this.rightsIdentifierScheme));
        sb.append(',');
        sb.append("schemeURI");
        sb.append('=');
        sb.append(((this.schemeURI == null)?"<null>":this.schemeURI));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.rightsIdentifierScheme == null)? 0 :this.rightsIdentifierScheme.hashCode()));
        result = ((result* 31)+((this.rightsURI == null)? 0 :this.rightsURI.hashCode()));
        result = ((result* 31)+((this.schemeURI == null)? 0 :this.schemeURI.hashCode()));
        result = ((result* 31)+((this.rights == null)? 0 :this.rights.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.rightsIdentifier == null)? 0 :this.rightsIdentifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rights) == false) {
            return false;
        }
        Rights rhs = ((Rights) other);
        return ((((((((this.rightsIdentifierScheme == rhs.rightsIdentifierScheme)||((this.rightsIdentifierScheme!= null)&&this.rightsIdentifierScheme.equals(rhs.rightsIdentifierScheme)))&&((this.rightsURI == rhs.rightsURI)||((this.rightsURI!= null)&&this.rightsURI.equals(rhs.rightsURI))))&&((this.schemeURI == rhs.schemeURI)||((this.schemeURI!= null)&&this.schemeURI.equals(rhs.schemeURI))))&&((this.rights == rhs.rights)||((this.rights!= null)&&this.rights.equals(rhs.rights))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.rightsIdentifier == rhs.rightsIdentifier)||((this.rightsIdentifier!= null)&&this.rightsIdentifier.equals(rhs.rightsIdentifier))));
    }

}
