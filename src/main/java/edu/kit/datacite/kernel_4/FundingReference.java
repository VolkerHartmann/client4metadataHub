
package edu.kit.datacite.kernel_4;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "funderName",
    "funderIdentifier",
    "funderIdentifierType",
    "awardNumber",
    "awardURI",
    "awardTitle"
})
@Generated("jsonschema2pojo")
public class FundingReference {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("funderName")
    private String funderName;
    @JsonProperty("funderIdentifier")
    private String funderIdentifier;
    @JsonProperty("funderIdentifierType")
    private FundingReference.FunderIdentifierType funderIdentifierType;
    @JsonProperty("awardNumber")
    private String awardNumber;
    @JsonProperty("awardURI")
    private URI awardURI;
    @JsonProperty("awardTitle")
    private String awardTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("funderName")
    public String getFunderName() {
        return funderName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("funderName")
    public void setFunderName(String funderName) {
        this.funderName = funderName;
    }

    @JsonProperty("funderIdentifier")
    public String getFunderIdentifier() {
        return funderIdentifier;
    }

    @JsonProperty("funderIdentifier")
    public void setFunderIdentifier(String funderIdentifier) {
        this.funderIdentifier = funderIdentifier;
    }

    @JsonProperty("funderIdentifierType")
    public FundingReference.FunderIdentifierType getFunderIdentifierType() {
        return funderIdentifierType;
    }

    @JsonProperty("funderIdentifierType")
    public void setFunderIdentifierType(FundingReference.FunderIdentifierType funderIdentifierType) {
        this.funderIdentifierType = funderIdentifierType;
    }

    @JsonProperty("awardNumber")
    public String getAwardNumber() {
        return awardNumber;
    }

    @JsonProperty("awardNumber")
    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    @JsonProperty("awardURI")
    public URI getAwardURI() {
        return awardURI;
    }

    @JsonProperty("awardURI")
    public void setAwardURI(URI awardURI) {
        this.awardURI = awardURI;
    }

    @JsonProperty("awardTitle")
    public String getAwardTitle() {
        return awardTitle;
    }

    @JsonProperty("awardTitle")
    public void setAwardTitle(String awardTitle) {
        this.awardTitle = awardTitle;
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
        sb.append(FundingReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("funderName");
        sb.append('=');
        sb.append(((this.funderName == null)?"<null>":this.funderName));
        sb.append(',');
        sb.append("funderIdentifier");
        sb.append('=');
        sb.append(((this.funderIdentifier == null)?"<null>":this.funderIdentifier));
        sb.append(',');
        sb.append("funderIdentifierType");
        sb.append('=');
        sb.append(((this.funderIdentifierType == null)?"<null>":this.funderIdentifierType));
        sb.append(',');
        sb.append("awardNumber");
        sb.append('=');
        sb.append(((this.awardNumber == null)?"<null>":this.awardNumber));
        sb.append(',');
        sb.append("awardURI");
        sb.append('=');
        sb.append(((this.awardURI == null)?"<null>":this.awardURI));
        sb.append(',');
        sb.append("awardTitle");
        sb.append('=');
        sb.append(((this.awardTitle == null)?"<null>":this.awardTitle));
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
        result = ((result* 31)+((this.funderIdentifierType == null)? 0 :this.funderIdentifierType.hashCode()));
        result = ((result* 31)+((this.funderName == null)? 0 :this.funderName.hashCode()));
        result = ((result* 31)+((this.funderIdentifier == null)? 0 :this.funderIdentifier.hashCode()));
        result = ((result* 31)+((this.awardNumber == null)? 0 :this.awardNumber.hashCode()));
        result = ((result* 31)+((this.awardTitle == null)? 0 :this.awardTitle.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.awardURI == null)? 0 :this.awardURI.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundingReference) == false) {
            return false;
        }
        FundingReference rhs = ((FundingReference) other);
        return ((((((((this.funderIdentifierType == rhs.funderIdentifierType)||((this.funderIdentifierType!= null)&&this.funderIdentifierType.equals(rhs.funderIdentifierType)))&&((this.funderName == rhs.funderName)||((this.funderName!= null)&&this.funderName.equals(rhs.funderName))))&&((this.funderIdentifier == rhs.funderIdentifier)||((this.funderIdentifier!= null)&&this.funderIdentifier.equals(rhs.funderIdentifier))))&&((this.awardNumber == rhs.awardNumber)||((this.awardNumber!= null)&&this.awardNumber.equals(rhs.awardNumber))))&&((this.awardTitle == rhs.awardTitle)||((this.awardTitle!= null)&&this.awardTitle.equals(rhs.awardTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.awardURI == rhs.awardURI)||((this.awardURI!= null)&&this.awardURI.equals(rhs.awardURI))));
    }

    @Generated("jsonschema2pojo")
    public enum FunderIdentifierType {

        ISNI("ISNI"),
        GRID("GRID"),
        CROSSREF_FUNDER_ID("Crossref Funder ID"),
        OTHER("Other");
        private final String value;
        private final static Map<String, FundingReference.FunderIdentifierType> CONSTANTS = new HashMap<String, FundingReference.FunderIdentifierType>();

        static {
            for (FundingReference.FunderIdentifierType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FunderIdentifierType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static FundingReference.FunderIdentifierType fromValue(String value) {
            FundingReference.FunderIdentifierType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
