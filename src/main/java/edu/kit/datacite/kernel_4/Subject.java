
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
    "subject",
    "subjectScheme",
    "schemeURI",
    "valueURI",
    "lang"
})
@Generated("jsonschema2pojo")
public class Subject {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("subjectScheme")
    private String subjectScheme;
    @JsonProperty("schemeURI")
    private URI schemeURI;
    @JsonProperty("valueURI")
    private URI valueURI;
    @JsonProperty("lang")
    private String lang;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("subjectScheme")
    public String getSubjectScheme() {
        return subjectScheme;
    }

    @JsonProperty("subjectScheme")
    public void setSubjectScheme(String subjectScheme) {
        this.subjectScheme = subjectScheme;
    }

    @JsonProperty("schemeURI")
    public URI getSchemeURI() {
        return schemeURI;
    }

    @JsonProperty("schemeURI")
    public void setSchemeURI(URI schemeURI) {
        this.schemeURI = schemeURI;
    }

    @JsonProperty("valueURI")
    public URI getValueURI() {
        return valueURI;
    }

    @JsonProperty("valueURI")
    public void setValueURI(URI valueURI) {
        this.valueURI = valueURI;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
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
        sb.append(Subject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("subjectScheme");
        sb.append('=');
        sb.append(((this.subjectScheme == null)?"<null>":this.subjectScheme));
        sb.append(',');
        sb.append("schemeURI");
        sb.append('=');
        sb.append(((this.schemeURI == null)?"<null>":this.schemeURI));
        sb.append(',');
        sb.append("valueURI");
        sb.append('=');
        sb.append(((this.valueURI == null)?"<null>":this.valueURI));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
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
        result = ((result* 31)+((this.schemeURI == null)? 0 :this.schemeURI.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.valueURI == null)? 0 :this.valueURI.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.subjectScheme == null)? 0 :this.subjectScheme.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subject) == false) {
            return false;
        }
        Subject rhs = ((Subject) other);
        return (((((((this.schemeURI == rhs.schemeURI)||((this.schemeURI!= null)&&this.schemeURI.equals(rhs.schemeURI)))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.valueURI == rhs.valueURI)||((this.valueURI!= null)&&this.valueURI.equals(rhs.valueURI))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.subjectScheme == rhs.subjectScheme)||((this.subjectScheme!= null)&&this.subjectScheme.equals(rhs.subjectScheme))));
    }

}
