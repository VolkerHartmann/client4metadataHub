
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
    "nameIdentifier",
    "nameIdentifierScheme",
    "schemeURI"
})
@Generated("jsonschema2pojo")
public class NameIdentifier {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameIdentifier")
    private String nameIdentifier;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameIdentifierScheme")
    private String nameIdentifierScheme;
    @JsonProperty("schemeURI")
    private URI schemeURI;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameIdentifier")
    public String getNameIdentifier() {
        return nameIdentifier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameIdentifier")
    public void setNameIdentifier(String nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameIdentifierScheme")
    public String getNameIdentifierScheme() {
        return nameIdentifierScheme;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nameIdentifierScheme")
    public void setNameIdentifierScheme(String nameIdentifierScheme) {
        this.nameIdentifierScheme = nameIdentifierScheme;
    }

    @JsonProperty("schemeURI")
    public URI getSchemeURI() {
        return schemeURI;
    }

    @JsonProperty("schemeURI")
    public void setSchemeURI(URI schemeURI) {
        this.schemeURI = schemeURI;
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
        sb.append(NameIdentifier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nameIdentifier");
        sb.append('=');
        sb.append(((this.nameIdentifier == null)?"<null>":this.nameIdentifier));
        sb.append(',');
        sb.append("nameIdentifierScheme");
        sb.append('=');
        sb.append(((this.nameIdentifierScheme == null)?"<null>":this.nameIdentifierScheme));
        sb.append(',');
        sb.append("schemeURI");
        sb.append('=');
        sb.append(((this.schemeURI == null)?"<null>":this.schemeURI));
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
        result = ((result* 31)+((this.nameIdentifierScheme == null)? 0 :this.nameIdentifierScheme.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.schemeURI == null)? 0 :this.schemeURI.hashCode()));
        result = ((result* 31)+((this.nameIdentifier == null)? 0 :this.nameIdentifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NameIdentifier) == false) {
            return false;
        }
        NameIdentifier rhs = ((NameIdentifier) other);
        return (((((this.nameIdentifierScheme == rhs.nameIdentifierScheme)||((this.nameIdentifierScheme!= null)&&this.nameIdentifierScheme.equals(rhs.nameIdentifierScheme)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.schemeURI == rhs.schemeURI)||((this.schemeURI!= null)&&this.schemeURI.equals(rhs.schemeURI))))&&((this.nameIdentifier == rhs.nameIdentifier)||((this.nameIdentifier!= null)&&this.nameIdentifier.equals(rhs.nameIdentifier))));
    }

}
