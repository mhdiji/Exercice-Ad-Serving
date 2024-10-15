package org.sample.ad.grpc.serve;

import com.google.gson.JsonElement;
import jakarta.servlet.annotation.WebServlet;
import redis.clients.jedis.*;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.UUID;

@WebServlet(name = "ServeAdServlet", urlPatterns = {"/ads/*"})
public class ServeAdServlet extends HttpServlet {

  private ServeAdService serveAdService;


  @Override
  public void init() throws ServletException {
    super.init();
    // Initialisation du service
    serveAdService = new ServeAdService();
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    Gson gson = new Gson();
    JsonObject jsonData = gson.fromJson(request.getReader(), JsonObject.class);
    String adTitle = jsonData.get("title").getAsString();
    JsonElement adDescription = jsonData.get("description");
    String adUrl = jsonData.get("url").getAsString();
    String adId = UUID.randomUUID().toString();

    ServeAdModel serveAdModel;
    serveAdModel = adDescription != null && !adDescription.isJsonNull() ? new ServeAdModel(adId, adTitle, adDescription.getAsString(), adUrl) : new ServeAdModel(adId, adTitle, adUrl);
    serveAdService.createAd(serveAdModel);
    response.setStatus(HttpServletResponse.SC_CREATED);
    response.getWriter().println(gson.toJson(serveAdModel));
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String adId = request.getParameter("adId");
    ServeAdModel serveAdModel = serveAdService.getServeAdModel(adId);
    response.getWriter().println(new Gson().toJson(serveAdModel));
  }


  }
