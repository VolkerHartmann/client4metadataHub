
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
    "pointLongitude",
    "pointLatitude"
})
@Generated("jsonschema2pojo")
public class GeoLocationPoint {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pointLongitude")
    private Double pointLongitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pointLatitude")
    private Double pointLatitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pointLongitude")
    public Double getPointLongitude() {
        return pointLongitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pointLongitude")
    public void setPointLongitude(Double pointLongitude) {
        this.pointLongitude = pointLongitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pointLatitude")
    public Double getPointLatitude() {
        return pointLatitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pointLatitude")
    public void setPointLatitude(Double pointLatitude) {
        this.pointLatitude = pointLatitude;
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
        sb.append(GeoLocationPoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pointLongitude");
        sb.append('=');
        sb.append(((this.pointLongitude == null)?"<null>":this.pointLongitude));
        sb.append(',');
        sb.append("pointLatitude");
        sb.append('=');
        sb.append(((this.pointLatitude == null)?"<null>":this.pointLatitude));
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
        result = ((result* 31)+((this.pointLatitude == null)? 0 :this.pointLatitude.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pointLongitude == null)? 0 :this.pointLongitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoLocationPoint) == false) {
            return false;
        }
        GeoLocationPoint rhs = ((GeoLocationPoint) other);
        return ((((this.pointLatitude == rhs.pointLatitude)||((this.pointLatitude!= null)&&this.pointLatitude.equals(rhs.pointLatitude)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pointLongitude == rhs.pointLongitude)||((this.pointLongitude!= null)&&this.pointLongitude.equals(rhs.pointLongitude))));
    }

}
