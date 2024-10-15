package org.sample.ad.grpc.serve;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServer {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);

    ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
    handler.setContextPath("/");

    ServletHolder servletHolder = handler.addServlet(ServeAdServlet.class, "/ads/*");
    servletHolder.setInitOrder(0);

    server.setHandler(handler);

    server.start();
    server.join();
  }
}
