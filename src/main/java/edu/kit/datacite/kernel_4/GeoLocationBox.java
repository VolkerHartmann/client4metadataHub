
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
    "westBoundLongitude",
    "eastBoundLongitude",
    "southBoundLatitude",
    "northBoundLatitude"
})
@Generated("jsonschema2pojo")
public class GeoLocationBox {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("westBoundLongitude")
    private Double westBoundLongitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eastBoundLongitude")
    private Double eastBoundLongitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("southBoundLatitude")
    private Double southBoundLatitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("northBoundLatitude")
    private Double northBoundLatitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("westBoundLongitude")
    public Double getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("westBoundLongitude")
    public void setWestBoundLongitude(Double westBoundLongitude) {
        this.westBoundLongitude = westBoundLongitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eastBoundLongitude")
    public Double getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eastBoundLongitude")
    public void setEastBoundLongitude(Double eastBoundLongitude) {
        this.eastBoundLongitude = eastBoundLongitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("southBoundLatitude")
    public Double getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("southBoundLatitude")
    public void setSouthBoundLatitude(Double southBoundLatitude) {
        this.southBoundLatitude = southBoundLatitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("northBoundLatitude")
    public Double getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("northBoundLatitude")
    public void setNorthBoundLatitude(Double northBoundLatitude) {
        this.northBoundLatitude = northBoundLatitude;
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
        sb.append(GeoLocationBox.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("westBoundLongitude");
        sb.append('=');
        sb.append(((this.westBoundLongitude == null)?"<null>":this.westBoundLongitude));
        sb.append(',');
        sb.append("eastBoundLongitude");
        sb.append('=');
        sb.append(((this.eastBoundLongitude == null)?"<null>":this.eastBoundLongitude));
        sb.append(',');
        sb.append("southBoundLatitude");
        sb.append('=');
        sb.append(((this.southBoundLatitude == null)?"<null>":this.southBoundLatitude));
        sb.append(',');
        sb.append("northBoundLatitude");
        sb.append('=');
        sb.append(((this.northBoundLatitude == null)?"<null>":this.northBoundLatitude));
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
        result = ((result* 31)+((this.northBoundLatitude == null)? 0 :this.northBoundLatitude.hashCode()));
        result = ((result* 31)+((this.southBoundLatitude == null)? 0 :this.southBoundLatitude.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.westBoundLongitude == null)? 0 :this.westBoundLongitude.hashCode()));
        result = ((result* 31)+((this.eastBoundLongitude == null)? 0 :this.eastBoundLongitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoLocationBox) == false) {
            return false;
        }
        GeoLocationBox rhs = ((GeoLocationBox) other);
        return ((((((this.northBoundLatitude == rhs.northBoundLatitude)||((this.northBoundLatitude!= null)&&this.northBoundLatitude.equals(rhs.northBoundLatitude)))&&((this.southBoundLatitude == rhs.southBoundLatitude)||((this.southBoundLatitude!= null)&&this.southBoundLatitude.equals(rhs.southBoundLatitude))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.westBoundLongitude == rhs.westBoundLongitude)||((this.westBoundLongitude!= null)&&this.westBoundLongitude.equals(rhs.westBoundLongitude))))&&((this.eastBoundLongitude == rhs.eastBoundLongitude)||((this.eastBoundLongitude!= null)&&this.eastBoundLongitude.equals(rhs.eastBoundLongitude))));
    }

}
