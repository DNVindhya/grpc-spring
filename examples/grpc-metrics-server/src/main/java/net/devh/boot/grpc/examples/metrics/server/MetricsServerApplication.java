package net.devh.boot.grpc.examples.metrics.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetricsServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(MetricsServerApplication.class, args);
  }
}