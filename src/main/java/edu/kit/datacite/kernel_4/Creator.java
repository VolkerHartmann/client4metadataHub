
package edu.kit.datacite.kernel_4;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "nameType",
    "givenName",
    "familyName",
    "nameIdentifiers",
    "affiliations",
    "lang"
})
@Generated("jsonschema2pojo")
public class Creator {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameType")
    private Creator.NameType nameType;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("familyName")
    private String familyName;
    @JsonProperty("nameIdentifiers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<NameIdentifier> nameIdentifiers = new LinkedHashSet<NameIdentifier>();
    @JsonProperty("affiliations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<Affiliation> affiliations = new LinkedHashSet<Affiliation>();
    @JsonProperty("lang")
    private String lang;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nameType")
    public Creator.NameType getNameType() {
        return nameType;
    }

    @JsonProperty("nameType")
    public void setNameType(Creator.NameType nameType) {
        this.nameType = nameType;
    }

    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("nameIdentifiers")
    public Set<NameIdentifier> getNameIdentifiers() {
        return nameIdentifiers;
    }

    @JsonProperty("nameIdentifiers")
    public void setNameIdentifiers(Set<NameIdentifier> nameIdentifiers) {
        this.nameIdentifiers = nameIdentifiers;
    }

    @JsonProperty("affiliations")
    public Set<Affiliation> getAffiliations() {
        return affiliations;
    }

    @JsonProperty("affiliations")
    public void setAffiliations(Set<Affiliation> affiliations) {
        this.affiliations = affiliations;
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
        sb.append(Creator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameType");
        sb.append('=');
        sb.append(((this.nameType == null)?"<null>":this.nameType));
        sb.append(',');
        sb.append("givenName");
        sb.append('=');
        sb.append(((this.givenName == null)?"<null>":this.givenName));
        sb.append(',');
        sb.append("familyName");
        sb.append('=');
        sb.append(((this.familyName == null)?"<null>":this.familyName));
        sb.append(',');
        sb.append("nameIdentifiers");
        sb.append('=');
        sb.append(((this.nameIdentifiers == null)?"<null>":this.nameIdentifiers));
        sb.append(',');
        sb.append("affiliations");
        sb.append('=');
        sb.append(((this.affiliations == null)?"<null>":this.affiliations));
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
        result = ((result* 31)+((this.nameType == null)? 0 :this.nameType.hashCode()));
        result = ((result* 31)+((this.givenName == null)? 0 :this.givenName.hashCode()));
        result = ((result* 31)+((this.familyName == null)? 0 :this.familyName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.nameIdentifiers == null)? 0 :this.nameIdentifiers.hashCode()));
        result = ((result* 31)+((this.affiliations == null)? 0 :this.affiliations.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Creator) == false) {
            return false;
        }
        Creator rhs = ((Creator) other);
        return (((((((((this.nameType == rhs.nameType)||((this.nameType!= null)&&this.nameType.equals(rhs.nameType)))&&((this.givenName == rhs.givenName)||((this.givenName!= null)&&this.givenName.equals(rhs.givenName))))&&((this.familyName == rhs.familyName)||((this.familyName!= null)&&this.familyName.equals(rhs.familyName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.nameIdentifiers == rhs.nameIdentifiers)||((this.nameIdentifiers!= null)&&this.nameIdentifiers.equals(rhs.nameIdentifiers))))&&((this.affiliations == rhs.affiliations)||((this.affiliations!= null)&&this.affiliations.equals(rhs.affiliations))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))));
    }

    @Generated("jsonschema2pojo")
    public enum NameType {

        ORGANIZATIONAL("Organizational"),
        PERSONAL("Personal");
        private final String value;
        private final static Map<String, Creator.NameType> CONSTANTS = new HashMap<String, Creator.NameType>();

        static {
            for (Creator.NameType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        NameType(String value) {
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
        public static Creator.NameType fromValue(String value) {
            Creator.NameType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
