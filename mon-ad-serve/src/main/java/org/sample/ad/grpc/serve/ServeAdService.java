package org.sample.ad.grpc.serve;

import com.google.gson.JsonObject;
import redis.clients.jedis.*;
import com.google.gson.Gson;



public class ServeAdService {
  private Jedis jedis;
  private Gson gson;

  public ServeAdService(){
    this.jedis = new Jedis("localhost", 6379);
    this.gson = new Gson();
  }


  public void createAd(ServeAdModel serveAdModel){
    String creationId = serveAdModel.getAdId();
    jedis.set(creationId, gson.toJson(serveAdModel));
  }

  public ServeAdModel getServeAdModel(String id){
    String adResponse =  jedis.get(id);
    if (adResponse != null){
      return gson.fromJson(adResponse, ServeAdModel.class);
    }
    return null;
  }

  public Jedis getJedis() {
    return jedis;
  }

  public void setJedis(Jedis jedis) {
    this.jedis = jedis;
  }

  public Gson getJson() {
    return gson;
  }

  public void setJson(Gson json) {
    this.gson = json;
  }
}
