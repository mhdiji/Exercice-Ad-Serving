package org.sample.ad.grpc.serve;

import com.google.gson.JsonElement;
import redis.clients.jedis.*;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.UUID;


public class ServeAdServlet extends HttpServlet {

  private ServeAdService serveAdService;

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    Gson gson = new Gson();
    JsonObject jsonData = gson.fromJson(request.getReader(), JsonObject.class);
    String adTitle = jsonData.get("title").getAsString();
    JsonElement adDescription = jsonData.get("description");
    String adUrl = jsonData.get("url").getAsString();
    String adId = UUID.randomUUID().toString();

    ServeAdModel serveAdModel;
    serveAdModel = adDescription != null ? new ServeAdModel(adId, adTitle, adDescription.getAsString(), adUrl) : new ServeAdModel(adId, adTitle, adUrl);
    serveAdService.createAd(serveAdModel);
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String adId = request.getParameter("adId");
    String serveAdResponse = serveAdService.getServeAdModel(adId);
  }


  }
