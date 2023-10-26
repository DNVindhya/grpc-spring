package net.devh.boot.grpc.examples.metrics.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

  @Autowired
  private GrpcClientService grpcClientService;

  @RequestMapping("/")
  public String printMessage(@RequestParam(defaultValue = "gRPC") final String name) {
    return this.grpcClientService.sendMessage(name);
  }

}
