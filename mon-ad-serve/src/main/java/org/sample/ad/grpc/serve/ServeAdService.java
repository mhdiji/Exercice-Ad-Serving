package org.sample.ad.grpc.serve;

import redis.clients.jedis.*;


public class ServeAdService {
  private Jedis jedis;

  public void ServeAdModel(){
    this.jedis = new Jedis("localhost", 6379);
  }


  public void createAd(ServeAdModel serveAdModel){
    String creationId = serveAdModel.getAdId();
    jedis.set(creationId, serveAdModel.toString());
  }

  public String getServeAdModel(String id){
    return jedis.get(id);
  }

  public Jedis getJedis() {
    return jedis;
  }

  public void setJedis(Jedis jedis) {
    this.jedis = jedis;
  }
}
