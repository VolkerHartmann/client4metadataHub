
package edu.kit.datacite.kernel_4;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "geoLocationPlace",
    "geoLocationPoint",
    "geoLocationBox",
    "geoLocationPolygons"
})
@Generated("jsonschema2pojo")
public class GeoLocation {

    @JsonProperty("geoLocationPlace")
    private String geoLocationPlace;
    @JsonProperty("geoLocationPoint")
    private GeoLocationPoint geoLocationPoint;
    @JsonProperty("geoLocationBox")
    private GeoLocationBox geoLocationBox;
    @JsonProperty("geoLocationPolygons")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<GeoLocationPolygon> geoLocationPolygons = new LinkedHashSet<GeoLocationPolygon>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("geoLocationPlace")
    public String getGeoLocationPlace() {
        return geoLocationPlace;
    }

    @JsonProperty("geoLocationPlace")
    public void setGeoLocationPlace(String geoLocationPlace) {
        this.geoLocationPlace = geoLocationPlace;
    }

    @JsonProperty("geoLocationPoint")
    public GeoLocationPoint getGeoLocationPoint() {
        return geoLocationPoint;
    }

    @JsonProperty("geoLocationPoint")
    public void setGeoLocationPoint(GeoLocationPoint geoLocationPoint) {
        this.geoLocationPoint = geoLocationPoint;
    }

    @JsonProperty("geoLocationBox")
    public GeoLocationBox getGeoLocationBox() {
        return geoLocationBox;
    }

    @JsonProperty("geoLocationBox")
    public void setGeoLocationBox(GeoLocationBox geoLocationBox) {
        this.geoLocationBox = geoLocationBox;
    }

    @JsonProperty("geoLocationPolygons")
    public Set<GeoLocationPolygon> getGeoLocationPolygons() {
        return geoLocationPolygons;
    }

    @JsonProperty("geoLocationPolygons")
    public void setGeoLocationPolygons(Set<GeoLocationPolygon> geoLocationPolygons) {
        this.geoLocationPolygons = geoLocationPolygons;
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
        sb.append(GeoLocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geoLocationPlace");
        sb.append('=');
        sb.append(((this.geoLocationPlace == null)?"<null>":this.geoLocationPlace));
        sb.append(',');
        sb.append("geoLocationPoint");
        sb.append('=');
        sb.append(((this.geoLocationPoint == null)?"<null>":this.geoLocationPoint));
        sb.append(',');
        sb.append("geoLocationBox");
        sb.append('=');
        sb.append(((this.geoLocationBox == null)?"<null>":this.geoLocationBox));
        sb.append(',');
        sb.append("geoLocationPolygons");
        sb.append('=');
        sb.append(((this.geoLocationPolygons == null)?"<null>":this.geoLocationPolygons));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.geoLocationPlace == null)? 0 :this.geoLocationPlace.hashCode()));
        result = ((result* 31)+((this.geoLocationBox == null)? 0 :this.geoLocationBox.hashCode()));
        result = ((result* 31)+((this.geoLocationPoint == null)? 0 :this.geoLocationPoint.hashCode()));
        result = ((result* 31)+((this.geoLocationPolygons == null)? 0 :this.geoLocationPolygons.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoLocation) == false) {
            return false;
        }
        GeoLocation rhs = ((GeoLocation) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.geoLocationPlace == rhs.geoLocationPlace)||((this.geoLocationPlace!= null)&&this.geoLocationPlace.equals(rhs.geoLocationPlace))))&&((this.geoLocationBox == rhs.geoLocationBox)||((this.geoLocationBox!= null)&&this.geoLocationBox.equals(rhs.geoLocationBox))))&&((this.geoLocationPoint == rhs.geoLocationPoint)||((this.geoLocationPoint!= null)&&this.geoLocationPoint.equals(rhs.geoLocationPoint))))&&((this.geoLocationPolygons == rhs.geoLocationPolygons)||((this.geoLocationPolygons!= null)&&this.geoLocationPolygons.equals(rhs.geoLocationPolygons))));
    }

}
