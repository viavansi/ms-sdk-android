package com.viafirma.mobile.services.android.model;

import com.viafirma.mobile.services.android.model.Item;
import com.viafirma.mobile.services.android.model.EvidenceSignature;
import com.viafirma.mobile.services.android.model.EvidenceFingerPrint;
import com.viafirma.mobile.services.android.model.EvidenceGeneric;
import java.util.*;
import com.viafirma.mobile.services.android.model.EvidenceImage;

import com.wordnik.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


@ApiModel(description = "")
public class MessageData  implements Serializable {
  
  @SerializedName("messageCode")
  private String messageCode = null;
  @SerializedName("items")
  private List<Item> items = new ArrayList<Item>() ;
  @SerializedName("biometricSignaturesData")
  private List<EvidenceSignature> biometricSignaturesData = new ArrayList<EvidenceSignature>() ;
  @SerializedName("fingerPrintsData")
  private List<EvidenceFingerPrint> fingerPrintsData = new ArrayList<EvidenceFingerPrint>() ;
  @SerializedName("imagesData")
  private List<EvidenceImage> imagesData = new ArrayList<EvidenceImage>() ;
  @SerializedName("genericData")
  private List<EvidenceGeneric> genericData = new ArrayList<EvidenceGeneric>() ;

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<EvidenceSignature> getBiometricSignaturesData() {
    return biometricSignaturesData;
  }
  public void setBiometricSignaturesData(List<EvidenceSignature> biometricSignaturesData) {
    this.biometricSignaturesData = biometricSignaturesData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<EvidenceFingerPrint> getFingerPrintsData() {
    return fingerPrintsData;
  }
  public void setFingerPrintsData(List<EvidenceFingerPrint> fingerPrintsData) {
    this.fingerPrintsData = fingerPrintsData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<EvidenceImage> getImagesData() {
    return imagesData;
  }
  public void setImagesData(List<EvidenceImage> imagesData) {
    this.imagesData = imagesData;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<EvidenceGeneric> getGenericData() {
    return genericData;
  }
  public void setGenericData(List<EvidenceGeneric> genericData) {
    this.genericData = genericData;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageData {\n");
    
    sb.append("  messageCode: ").append(messageCode).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  biometricSignaturesData: ").append(biometricSignaturesData).append("\n");
    sb.append("  fingerPrintsData: ").append(fingerPrintsData).append("\n");
    sb.append("  imagesData: ").append(imagesData).append("\n");
    sb.append("  genericData: ").append(genericData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
