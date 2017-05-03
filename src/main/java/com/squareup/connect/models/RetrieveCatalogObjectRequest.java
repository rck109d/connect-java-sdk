/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class RetrieveCatalogObjectRequest {
  @JsonProperty("object_id")
  private String objectId = null;

  @JsonProperty("include_related_objects")
  private Boolean includeRelatedObjects = null;

  public RetrieveCatalogObjectRequest objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * The object ID of any type of [CatalogObject](#type-catalogobject)s to be retrieved.
   * @return objectId
  **/
  @ApiModelProperty(required = true, value = "The object ID of any type of [CatalogObject](#type-catalogobject)s to be retrieved.")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public RetrieveCatalogObjectRequest includeRelatedObjects(Boolean includeRelatedObjects) {
    this.includeRelatedObjects = includeRelatedObjects;
    return this;
  }

   /**
   * If `true`, the response will include additional objects that are related to the requested object, as follows:  If the `object` field of the response contains a [CatalogItem](#type-catalogitem), its associated [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax)es, and [CatalogModifierList](#type-catalogmodifierlist)s will be returned in the `related_objects` field of the response. If the `object` field of the response contains a [CatalogItemVariation](#type-catalogitemvariation), its parent [CatalogItem](#type-catalogitem) will be returned in the `related_objects` field of the response.
   * @return includeRelatedObjects
  **/
  @ApiModelProperty(value = "If `true`, the response will include additional objects that are related to the requested object, as follows:  If the `object` field of the response contains a [CatalogItem](#type-catalogitem), its associated [CatalogCategory](#type-catalogcategory), [CatalogTax](#type-catalogtax)es, and [CatalogModifierList](#type-catalogmodifierlist)s will be returned in the `related_objects` field of the response. If the `object` field of the response contains a [CatalogItemVariation](#type-catalogitemvariation), its parent [CatalogItem](#type-catalogitem) will be returned in the `related_objects` field of the response.")
  public Boolean getIncludeRelatedObjects() {
    return includeRelatedObjects;
  }

  public void setIncludeRelatedObjects(Boolean includeRelatedObjects) {
    this.includeRelatedObjects = includeRelatedObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveCatalogObjectRequest retrieveCatalogObjectRequest = (RetrieveCatalogObjectRequest) o;
    return Objects.equals(this.objectId, retrieveCatalogObjectRequest.objectId) &&
        Objects.equals(this.includeRelatedObjects, retrieveCatalogObjectRequest.includeRelatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, includeRelatedObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveCatalogObjectRequest {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    includeRelatedObjects: ").append(toIndentedString(includeRelatedObjects)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

