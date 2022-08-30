package edu.kit.datacite.kernel_4;

import java.net.URI;
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
  "relatedIdentifier",
  "relatedIdentifierType",
  "relationType",
  "relatedMetadataScheme",
  "schemeURI",
  "schemeType",
  "resourceTypeGeneral"
})
@Generated("jsonschema2pojo")
public class RelatedIdentifier {

  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relatedIdentifier")
  private String relatedIdentifier;
  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relatedIdentifierType")
  private RelatedIdentifier.RelatedIdentifierType relatedIdentifierType;
  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relationType")
  private RelatedIdentifier.RelationType relationType;
  @JsonProperty("relatedMetadataScheme")
  private String relatedMetadataScheme;
  @JsonProperty("schemeURI")
  private URI schemeURI;
  @JsonProperty("schemeType")
  private String schemeType;
  @JsonProperty("resourceTypeGeneral")
  private edu.kit.datacite.kernel_4.Types.ResourceTypeGeneral resourceTypeGeneral;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relatedIdentifier")
  public String getRelatedIdentifier() {
    return relatedIdentifier;
  }

  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relatedIdentifier")
  public void setRelatedIdentifier(String relatedIdentifier) {
    this.relatedIdentifier = relatedIdentifier;
  }

  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relatedIdentifierType")
  public RelatedIdentifier.RelatedIdentifierType getRelatedIdentifierType() {
    return relatedIdentifierType;
  }

  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relatedIdentifierType")
  public void setRelatedIdentifierType(RelatedIdentifier.RelatedIdentifierType relatedIdentifierType) {
    this.relatedIdentifierType = relatedIdentifierType;
  }

  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relationType")
  public RelatedIdentifier.RelationType getRelationType() {
    return relationType;
  }

  /**
   *
   * (Required)
   *
   */
  @JsonProperty("relationType")
  public void setRelationType(RelatedIdentifier.RelationType relationType) {
    this.relationType = relationType;
  }

  @JsonProperty("relatedMetadataScheme")
  public String getRelatedMetadataScheme() {
    return relatedMetadataScheme;
  }

  @JsonProperty("relatedMetadataScheme")
  public void setRelatedMetadataScheme(String relatedMetadataScheme) {
    this.relatedMetadataScheme = relatedMetadataScheme;
  }

  @JsonProperty("schemeURI")
  public URI getSchemeURI() {
    return schemeURI;
  }

  @JsonProperty("schemeURI")
  public void setSchemeURI(URI schemeURI) {
    this.schemeURI = schemeURI;
  }

  @JsonProperty("schemeType")
  public String getSchemeType() {
    return schemeType;
  }

  @JsonProperty("schemeType")
  public void setSchemeType(String schemeType) {
    this.schemeType = schemeType;
  }

  @JsonProperty("resourceTypeGeneral")
  public edu.kit.datacite.kernel_4.Types.ResourceTypeGeneral getResourceTypeGeneral() {
    return resourceTypeGeneral;
  }

  @JsonProperty("resourceTypeGeneral")
  public void setResourceTypeGeneral(edu.kit.datacite.kernel_4.Types.ResourceTypeGeneral resourceTypeGeneral) {
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
    sb.append(RelatedIdentifier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
    sb.append("relatedIdentifier");
    sb.append('=');
    sb.append(((this.relatedIdentifier == null) ? "<null>" : this.relatedIdentifier));
    sb.append(',');
    sb.append("relatedIdentifierType");
    sb.append('=');
    sb.append(((this.relatedIdentifierType == null) ? "<null>" : this.relatedIdentifierType));
    sb.append(',');
    sb.append("relationType");
    sb.append('=');
    sb.append(((this.relationType == null) ? "<null>" : this.relationType));
    sb.append(',');
    sb.append("relatedMetadataScheme");
    sb.append('=');
    sb.append(((this.relatedMetadataScheme == null) ? "<null>" : this.relatedMetadataScheme));
    sb.append(',');
    sb.append("schemeURI");
    sb.append('=');
    sb.append(((this.schemeURI == null) ? "<null>" : this.schemeURI));
    sb.append(',');
    sb.append("schemeType");
    sb.append('=');
    sb.append(((this.schemeType == null) ? "<null>" : this.schemeType));
    sb.append(',');
    sb.append("resourceTypeGeneral");
    sb.append('=');
    sb.append(((this.resourceTypeGeneral == null) ? "<null>" : this.resourceTypeGeneral));
    sb.append(',');
    sb.append("additionalProperties");
    sb.append('=');
    sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
    sb.append(',');
    if (sb.charAt((sb.length() - 1)) == ',') {
      sb.setCharAt((sb.length() - 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = ((result * 31) + ((this.relationType == null) ? 0 : this.relationType.hashCode()));
    result = ((result * 31) + ((this.resourceTypeGeneral == null) ? 0 : this.resourceTypeGeneral.hashCode()));
    result = ((result * 31) + ((this.schemeType == null) ? 0 : this.schemeType.hashCode()));
    result = ((result * 31) + ((this.relatedIdentifier == null) ? 0 : this.relatedIdentifier.hashCode()));
    result = ((result * 31) + ((this.schemeURI == null) ? 0 : this.schemeURI.hashCode()));
    result = ((result * 31) + ((this.relatedIdentifierType == null) ? 0 : this.relatedIdentifierType.hashCode()));
    result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.relatedMetadataScheme == null) ? 0 : this.relatedMetadataScheme.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof RelatedIdentifier) == false) {
      return false;
    }
    RelatedIdentifier rhs = ((RelatedIdentifier) other);
    return (((((((((this.relationType == rhs.relationType) || ((this.relationType != null) && this.relationType.equals(rhs.relationType))) && ((this.resourceTypeGeneral == rhs.resourceTypeGeneral) || ((this.resourceTypeGeneral != null) && this.resourceTypeGeneral.equals(rhs.resourceTypeGeneral)))) && ((this.schemeType == rhs.schemeType) || ((this.schemeType != null) && this.schemeType.equals(rhs.schemeType)))) && ((this.relatedIdentifier == rhs.relatedIdentifier) || ((this.relatedIdentifier != null) && this.relatedIdentifier.equals(rhs.relatedIdentifier)))) && ((this.schemeURI == rhs.schemeURI) || ((this.schemeURI != null) && this.schemeURI.equals(rhs.schemeURI)))) && ((this.relatedIdentifierType == rhs.relatedIdentifierType) || ((this.relatedIdentifierType != null) && this.relatedIdentifierType.equals(rhs.relatedIdentifierType)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.relatedMetadataScheme == rhs.relatedMetadataScheme) || ((this.relatedMetadataScheme != null) && this.relatedMetadataScheme.equals(rhs.relatedMetadataScheme))));
  }

  @Generated("jsonschema2pojo")
  public enum RelatedIdentifierType {

    ARK("ARK"),
    AR_XIV("arXiv"),
    BIBCODE("bibcode"),
    DOI("DOI"),
    EAN_13("EAN13"),
    EISSN("EISSN"),
    HANDLE("Handle"),
    IGSN("IGSN"),
    ISBN("ISBN"),
    ISSN("ISSN"),
    ISTC("ISTC"),
    LISSN("LISSN"),
    LSID("LSID"),
    PMID("PMID"),
    PURL("PURL"),
    UPC("UPC"),
    URL("URL"),
    URN("URN"),
    W_3_ID("w3id");
    private final String value;
    private final static Map<String, RelatedIdentifier.RelatedIdentifierType> CONSTANTS = new HashMap<String, RelatedIdentifier.RelatedIdentifierType>();

    static {
      for (RelatedIdentifier.RelatedIdentifierType c : values()) {
        CONSTANTS.put(c.value, c);
        CONSTANTS.put(c.name(), c);
      }
    }

    RelatedIdentifierType(String value) {
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
    public static RelatedIdentifier.RelatedIdentifierType fromValue(String value) {
      RelatedIdentifier.RelatedIdentifierType constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }

  @Generated("jsonschema2pojo")
  public enum RelationType {

    IS_CITED_BY("IsCitedBy"),
    CITES("Cites"),
    IS_SUPPLEMENT_TO("IsSupplementTo"),
    IS_SUPPLEMENTED_BY("IsSupplementedBy"),
    IS_CONTINUED_BY("IsContinuedBy"),
    CONTINUES("Continues"),
    IS_DESCRIBED_BY("IsDescribedBy"),
    DESCRIBES("Describes"),
    HAS_METADATA("HasMetadata"),
    IS_METADATA_FOR("IsMetadataFor"),
    HAS_VERSION("HasVersion"),
    IS_VERSION_OF("IsVersionOf"),
    IS_NEW_VERSION_OF("IsNewVersionOf"),
    IS_PREVIOUS_VERSION_OF("IsPreviousVersionOf"),
    IS_PART_OF("IsPartOf"),
    HAS_PART("HasPart"),
    IS_REFERENCED_BY("IsReferencedBy"),
    REFERENCES("References"),
    IS_DOCUMENTED_BY("IsDocumentedBy"),
    DOCUMENTS("Documents"),
    IS_COMPILED_BY("IsCompiledBy"),
    COMPILES("Compiles"),
    IS_VARIANT_FORM_OF("IsVariantFormOf"),
    IS_ORIGINAL_FORM_OF("IsOriginalFormOf"),
    IS_IDENTICAL_TO("IsIdenticalTo"),
    IS_REVIEWED_BY("IsReviewedBy"),
    REVIEWS("Reviews"),
    IS_DERIVED_FROM("IsDerivedFrom"),
    IS_SOURCE_OF("IsSourceOf"),
    IS_REQUIRED_BY("IsRequiredBy"),
    REQUIRES("Requires"),
    IS_OBSOLETED_BY("IsObsoletedBy"),
    OBSOLETES("Obsoletes");
    private final String value;
    private final static Map<String, RelatedIdentifier.RelationType> CONSTANTS = new HashMap<String, RelatedIdentifier.RelationType>();

    static {
      for (RelatedIdentifier.RelationType c : values()) {
        CONSTANTS.put(c.value, c);
        CONSTANTS.put(c.name(), c);
      }
    }

    RelationType(String value) {
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
    public static RelatedIdentifier.RelationType fromValue(String value) {
      RelatedIdentifier.RelationType constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }

}
