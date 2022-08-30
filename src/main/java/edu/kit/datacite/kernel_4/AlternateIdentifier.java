
package edu.kit.datacite.kernel_4;

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
    "alternateIdentifier",
    "alternateIdentifierType"
})
@Generated("jsonschema2pojo")
public class AlternateIdentifier {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alternateIdentifier")
    private String alternateIdentifier;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alternateIdentifierType")
    private String alternateIdentifierType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alternateIdentifier")
    public String getAlternateIdentifier() {
        return alternateIdentifier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alternateIdentifier")
    public void setAlternateIdentifier(String alternateIdentifier) {
        this.alternateIdentifier = alternateIdentifier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alternateIdentifierType")
    public String getAlternateIdentifierType() {
        return alternateIdentifierType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("alternateIdentifierType")
    public void setAlternateIdentifierType(String alternateIdentifierType) {
        this.alternateIdentifierType = alternateIdentifierType;
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
        sb.append(AlternateIdentifier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("alternateIdentifier");
        sb.append('=');
        sb.append(((this.alternateIdentifier == null)?"<null>":this.alternateIdentifier));
        sb.append(',');
        sb.append("alternateIdentifierType");
        sb.append('=');
        sb.append(((this.alternateIdentifierType == null)?"<null>":this.alternateIdentifierType));
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
        result = ((result* 31)+((this.alternateIdentifier == null)? 0 :this.alternateIdentifier.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.alternateIdentifierType == null)? 0 :this.alternateIdentifierType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlternateIdentifier) == false) {
            return false;
        }
        AlternateIdentifier rhs = ((AlternateIdentifier) other);
        return ((((this.alternateIdentifier == rhs.alternateIdentifier)||((this.alternateIdentifier!= null)&&this.alternateIdentifier.equals(rhs.alternateIdentifier)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.alternateIdentifierType == rhs.alternateIdentifierType)||((this.alternateIdentifierType!= null)&&this.alternateIdentifierType.equals(rhs.alternateIdentifierType))));
    }

}
