
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
    "contributorType",
    "name",
    "nameType",
    "givenName",
    "familyName",
    "nameIdentifiers",
    "affiliations",
    "lang"
})
@Generated("jsonschema2pojo")
public class Contributor {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contributorType")
    private Contributor.ContributorType contributorType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameType")
    private edu.kit.datacite.kernel_4.Creator.NameType nameType;
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
    @JsonProperty("contributorType")
    public Contributor.ContributorType getContributorType() {
        return contributorType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contributorType")
    public void setContributorType(Contributor.ContributorType contributorType) {
        this.contributorType = contributorType;
    }

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
    public edu.kit.datacite.kernel_4.Creator.NameType getNameType() {
        return nameType;
    }

    @JsonProperty("nameType")
    public void setNameType(edu.kit.datacite.kernel_4.Creator.NameType nameType) {
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
        sb.append(Contributor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contributorType");
        sb.append('=');
        sb.append(((this.contributorType == null)?"<null>":this.contributorType));
        sb.append(',');
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
        result = ((result* 31)+((this.contributorType == null)? 0 :this.contributorType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contributor) == false) {
            return false;
        }
        Contributor rhs = ((Contributor) other);
        return ((((((((((this.nameType == rhs.nameType)||((this.nameType!= null)&&this.nameType.equals(rhs.nameType)))&&((this.givenName == rhs.givenName)||((this.givenName!= null)&&this.givenName.equals(rhs.givenName))))&&((this.familyName == rhs.familyName)||((this.familyName!= null)&&this.familyName.equals(rhs.familyName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.nameIdentifiers == rhs.nameIdentifiers)||((this.nameIdentifiers!= null)&&this.nameIdentifiers.equals(rhs.nameIdentifiers))))&&((this.affiliations == rhs.affiliations)||((this.affiliations!= null)&&this.affiliations.equals(rhs.affiliations))))&&((this.contributorType == rhs.contributorType)||((this.contributorType!= null)&&this.contributorType.equals(rhs.contributorType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))));
    }

    @Generated("jsonschema2pojo")
    public enum ContributorType {

        CONTACT_PERSON("ContactPerson"),
        DATA_COLLECTOR("DataCollector"),
        DATA_CURATOR("DataCurator"),
        DATA_MANAGER("DataManager"),
        DISTRIBUTOR("Distributor"),
        EDITOR("Editor"),
        HOSTING_INSTITUTION("HostingInstitution"),
        PRODUCER("Producer"),
        PROJECT_LEADER("ProjectLeader"),
        PROJECT_MANAGER("ProjectManager"),
        PROJECT_MEMBER("ProjectMember"),
        REGISTRATION_AGENCY("RegistrationAgency"),
        REGISTRATION_AUTHORITY("RegistrationAuthority"),
        RELATED_PERSON("RelatedPerson"),
        RESEARCHER("Researcher"),
        RESEARCH_GROUP("ResearchGroup"),
        RIGHTS_HOLDER("RightsHolder"),
        SPONSOR("Sponsor"),
        SUPERVISOR("Supervisor"),
        WORK_PACKAGE_LEADER("WorkPackageLeader"),
        OTHER("Other");
        private final String value;
        private final static Map<String, Contributor.ContributorType> CONSTANTS = new HashMap<String, Contributor.ContributorType>();

        static {
            for (Contributor.ContributorType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ContributorType(String value) {
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
        public static Contributor.ContributorType fromValue(String value) {
            Contributor.ContributorType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
