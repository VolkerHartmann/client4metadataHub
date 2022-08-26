
package edu.kit.datacite.kernel_4;

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
    "resourceType",
    "resourceTypeGeneral"
})
@Generated("jsonschema2pojo")
public class Types {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    private String resourceType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resourceTypeGeneral")
    private Types.ResourceTypeGeneral resourceTypeGeneral;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resourceTypeGeneral")
    public Types.ResourceTypeGeneral getResourceTypeGeneral() {
        return resourceTypeGeneral;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resourceTypeGeneral")
    public void setResourceTypeGeneral(Types.ResourceTypeGeneral resourceTypeGeneral) {
        this.resourceTypeGeneral = resourceTypeGeneral;
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
        sb.append(Types.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
        sb.append(',');
        sb.append("resourceTypeGeneral");
        sb.append('=');
        sb.append(((this.resourceTypeGeneral == null)?"<null>":this.resourceTypeGeneral));
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
        result = ((result* 31)+((this.resourceTypeGeneral == null)? 0 :this.resourceTypeGeneral.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Types) == false) {
            return false;
        }
        Types rhs = ((Types) other);
        return ((((this.resourceTypeGeneral == rhs.resourceTypeGeneral)||((this.resourceTypeGeneral!= null)&&this.resourceTypeGeneral.equals(rhs.resourceTypeGeneral)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

    @Generated("jsonschema2pojo")
    public enum ResourceTypeGeneral {

        AUDIOVISUAL("Audiovisual"),
        COLLECTION("Collection"),
        DATA_PAPER("DataPaper"),
        DATASET("Dataset"),
        EVENT("Event"),
        IMAGE("Image"),
        INTERACTIVE_RESOURCE("InteractiveResource"),
        MODEL("Model"),
        PHYSICAL_OBJECT("PhysicalObject"),
        SERVICE("Service"),
        SOFTWARE("Software"),
        SOUND("Sound"),
        TEXT("Text"),
        WORKFLOW("Workflow"),
        OTHER("Other");
        private final String value;
        private final static Map<String, Types.ResourceTypeGeneral> CONSTANTS = new HashMap<String, Types.ResourceTypeGeneral>();

        static {
            for (Types.ResourceTypeGeneral c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ResourceTypeGeneral(String value) {
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
        public static Types.ResourceTypeGeneral fromValue(String value) {
            Types.ResourceTypeGeneral constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
