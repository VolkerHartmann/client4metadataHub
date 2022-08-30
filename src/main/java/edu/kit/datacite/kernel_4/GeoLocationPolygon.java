
package edu.kit.datacite.kernel_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "polygonPoints",
    "inPolygonPoint"
})
@Generated("jsonschema2pojo")
public class GeoLocationPolygon {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("polygonPoints")
    private List<GeoLocationPoint> polygonPoints = new ArrayList<GeoLocationPoint>();
    @JsonProperty("inPolygonPoint")
    private GeoLocationPoint inPolygonPoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("polygonPoints")
    public List<GeoLocationPoint> getPolygonPoints() {
        return polygonPoints;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("polygonPoints")
    public void setPolygonPoints(List<GeoLocationPoint> polygonPoints) {
        this.polygonPoints = polygonPoints;
    }

    @JsonProperty("inPolygonPoint")
    public GeoLocationPoint getInPolygonPoint() {
        return inPolygonPoint;
    }

    @JsonProperty("inPolygonPoint")
    public void setInPolygonPoint(GeoLocationPoint inPolygonPoint) {
        this.inPolygonPoint = inPolygonPoint;
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
        sb.append(GeoLocationPolygon.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("polygonPoints");
        sb.append('=');
        sb.append(((this.polygonPoints == null)?"<null>":this.polygonPoints));
        sb.append(',');
        sb.append("inPolygonPoint");
        sb.append('=');
        sb.append(((this.inPolygonPoint == null)?"<null>":this.inPolygonPoint));
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
        result = ((result* 31)+((this.polygonPoints == null)? 0 :this.polygonPoints.hashCode()));
        result = ((result* 31)+((this.inPolygonPoint == null)? 0 :this.inPolygonPoint.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoLocationPolygon) == false) {
            return false;
        }
        GeoLocationPolygon rhs = ((GeoLocationPolygon) other);
        return ((((this.polygonPoints == rhs.polygonPoints)||((this.polygonPoints!= null)&&this.polygonPoints.equals(rhs.polygonPoints)))&&((this.inPolygonPoint == rhs.inPolygonPoint)||((this.inPolygonPoint!= null)&&this.inPolygonPoint.equals(rhs.inPolygonPoint))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
