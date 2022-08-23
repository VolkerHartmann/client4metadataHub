
package edu.kit.metadatahub.doip.rest;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import edu.kit.datacite.kernel_4.Datacite43Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "clientId",
    "datacite",
    "attributes",
    "elements",
    "header"
})
@Generated("jsonschema2pojo")
public class RestDoip {

    @JsonProperty("id")
    private String id;
    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("token")
    private String token;
    @JsonProperty("datacite")
    private Datacite43Schema datacite;
    @JsonProperty("attributes")
    private List<Content> attributes = new ArrayList<Content>();
    @JsonProperty("elements")
    private List<Content> elements = new ArrayList<Content>();
    @JsonProperty("header")
    private List<Content> header = new ArrayList<Content>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("datacite")
    public Datacite43Schema getDatacite() {
        return datacite;
    }

    @JsonProperty("datacite")
    public void setDatacite(Datacite43Schema datacite) {
        this.datacite = datacite;
    }

    @JsonProperty("attributes")
    public List<Content> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Content> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("elements")
    public List<Content> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(List<Content> elements) {
        this.elements = elements;
    }

    @JsonProperty("header")
    public List<Content> getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(List<Content> header) {
        this.header = header;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RestDoip.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("datacite");
        sb.append('=');
        sb.append(((this.datacite == null)?"<null>":this.datacite));
        sb.append(',');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null)?"<null>":this.attributes));
        sb.append(',');
        sb.append("elements");
        sb.append('=');
        sb.append(((this.elements == null)?"<null>":this.elements));
        sb.append(',');
        sb.append("header");
        sb.append('=');
        sb.append(((this.header == null)?"<null>":this.header));
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
        result = ((result* 31)+((this.header == null)? 0 :this.header.hashCode()));
        result = ((result* 31)+((this.attributes == null)? 0 :this.attributes.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.elements == null)? 0 :this.elements.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestDoip) == false) {
            return false;
        }
        RestDoip rhs = ((RestDoip) other);
        return (((((this.header == rhs.header)||((this.header!= null)&&this.header.equals(rhs.header)))&&((this.attributes == rhs.attributes)||((this.attributes!= null)&&this.attributes.equals(rhs.attributes))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.elements == rhs.elements)||((this.elements!= null)&&this.elements.equals(rhs.elements))));
    }

}
