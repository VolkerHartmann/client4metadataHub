
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
    "date",
    "dateType",
    "dateInformation"
})
@Generated("jsonschema2pojo")
public class Date {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    private String date;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dateType")
    private Date.DateType dateType;
    @JsonProperty("dateInformation")
    private String dateInformation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dateType")
    public Date.DateType getDateType() {
        return dateType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dateType")
    public void setDateType(Date.DateType dateType) {
        this.dateType = dateType;
    }

    @JsonProperty("dateInformation")
    public String getDateInformation() {
        return dateInformation;
    }

    @JsonProperty("dateInformation")
    public void setDateInformation(String dateInformation) {
        this.dateInformation = dateInformation;
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
        sb.append(Date.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("dateType");
        sb.append('=');
        sb.append(((this.dateType == null)?"<null>":this.dateType));
        sb.append(',');
        sb.append("dateInformation");
        sb.append('=');
        sb.append(((this.dateInformation == null)?"<null>":this.dateInformation));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.dateInformation == null)? 0 :this.dateInformation.hashCode()));
        result = ((result* 31)+((this.dateType == null)? 0 :this.dateType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Date) == false) {
            return false;
        }
        Date rhs = ((Date) other);
        return (((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.dateInformation == rhs.dateInformation)||((this.dateInformation!= null)&&this.dateInformation.equals(rhs.dateInformation))))&&((this.dateType == rhs.dateType)||((this.dateType!= null)&&this.dateType.equals(rhs.dateType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    @Generated("jsonschema2pojo")
    public enum DateType {

        ACCEPTED("Accepted"),
        AVAILABLE("Available"),
        COPYRIGHTED("Copyrighted"),
        COLLECTED("Collected"),
        CREATED("Created"),
        ISSUED("Issued"),
        SUBMITTED("Submitted"),
        UPDATED("Updated"),
        VALID("Valid"),
        WITHDRAWN("Withdrawn"),
        OTHER("Other");
        private final String value;
        private final static Map<String, Date.DateType> CONSTANTS = new HashMap<String, Date.DateType>();

        static {
            for (Date.DateType c: values()) {
                CONSTANTS.put(c.value, c);
                CONSTANTS.put(c.name(), c);
            }
        }

        DateType(String value) {
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
        public static Date.DateType fromValue(String value) {
            Date.DateType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
