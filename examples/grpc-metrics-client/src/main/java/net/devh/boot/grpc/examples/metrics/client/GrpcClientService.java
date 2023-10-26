package net.devh.boot.grpc.examples.metrics.client;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.examples.lib.HelloReply;
import net.devh.boot.grpc.examples.lib.HelloRequest;
import net.devh.boot.grpc.examples.lib.SimpleGrpc.SimpleBlockingStub;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {

  @GrpcClient("grpc-metrics-server")
  private SimpleBlockingStub simpleStub;

  public String sendMessage(final String name) {
    try {
      final HelloReply response = this.simpleStub.sayHello(HelloRequest.newBuilder().setName(name).build());
      return response.getMessage();
    } catch (final StatusRuntimeException e) {
      return "FAILED with " + e.getStatus().getCode();
    }
  }

}
