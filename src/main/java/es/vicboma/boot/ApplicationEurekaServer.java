package es.vicboma.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApplicationEurekaServer {

  /**
   * Constructor
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    SpringApplication.run(ApplicationEurekaServer.class, args);
  }

}