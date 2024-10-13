package org.sample.ad.grpc.serve;

import redis.clients.jedis.*;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ServeAdServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    Gson gson = new Gson();
    JsonObject jsonData = gson.fromJson(request.getReader(), JsonObject.class);
    String adTitle = jsonData.get("title").getAsString();
    String adDescription = jsonData.get("description").getAsString();
    String adUrl = jsonData.get("url").getAsString();



  }

}
