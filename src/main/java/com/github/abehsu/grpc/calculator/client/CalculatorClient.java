package com.github.abehsu.grpc.calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.SquareRootRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class CalculatorClient {

    public void run(){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        doErrorCall(channel);
        System.out.println("Shuting down the channel");
        channel.shutdown();

    }

    private void doErrorCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub blockingStub = CalculatorServiceGrpc.newBlockingStub(channel);

        int number = -1;

        try {
            blockingStub.squareRoot(SquareRootRequest.newBuilder()
                    .setNumber(number)
                    .build()
            );
        } catch (StatusRuntimeException e) {
            System.out.println("Got an exception for square root !");
            e.printStackTrace();
        }




    }


    public static void main(String[] args) {
        CalculatorClient main = new CalculatorClient();
        main.run();
    }
}