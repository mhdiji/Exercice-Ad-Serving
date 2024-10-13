package org.sample.ad.grpc.serve;

public class ServeAdModel {
  private String adId;
  private String adTitle;
  private String adDescription;
  private String adUrl;

  public ServeAdModel(String adId, String adTitle, String adDescription, String adUrl){
    this.adTitle = adTitle;
    this.adDescription = adDescription;
    this.adUrl = adUrl;
  }
  public ServeAdModel(String adId, String adTitle, String adUrl){
    this(adId,adTitle, "none", adUrl);
  }

  public String getAdTitle() {
    return adTitle;
  }

  public String getAdDescription() {
    return adDescription;
  }
  public void setAdTitle(String adTitle) {
    this.adTitle = adDescription;
  }

  public void setAdDescription(String adDescription) {
    this.adDescription = adDescription;
  }

  public String getAdUrl() {
    return adUrl;
  }

  public void setAdUrl(String adUrl) {
    this.adUrl = adUrl;
  }
}
