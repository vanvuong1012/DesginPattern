package com.example.designpatter_demo;

import com.example.designpatter_demo.builder.Computer;
import com.example.designpatter_demo.singleton.ThreadSafeSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class DesignPatterDemoApplication {

    public static void main(String[] args) throws
//    {
//        SpringApplication.run(DesignPatterDemoApplication.class, args);
//    }
        FileNotFoundException, IOException, ClassNotFoundException {
//        SerializedSingleton instanceOne =
//                SerializedSingleton.getInstance();
//        SerializedSingleton instanceTwo =
//                SerializedSingleton.getInstance();

//        EagerInitializedSingleton instanceOne =
//                EagerInitializedSingleton.getInstance();
//        EagerInitializedSingleton instanceTwo =
//                EagerInitializedSingleton.getInstance();

//        LazyInitializedSingleton instanceOne =
//                LazyInitializedSingleton.getInstance();
//        LazyInitializedSingleton instanceTwo =
//                LazyInitializedSingleton.getInstance();

//        StaticBlockSingleton instanceOne =
//                StaticBlockSingleton.getInstance();
//        StaticBlockSingleton instanceTwo =
//                StaticBlockSingleton.getInstance();

    ThreadSafeSingleton instanceOne =
            ThreadSafeSingleton.getInstanceUsingDoubleLocking();
    ThreadSafeSingleton instanceTwo =
            ThreadSafeSingleton.getInstanceUsingDoubleLocking();
    System.out.println("instanceOne hashCode="+instanceOne.hashCode());
    System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());


    Computer comp = new Computer.ComputerBuilder(
            "500 GB", "2 GB")
            .setGraphicsCardEnabled(true).build();
    System.out.println(comp);
}
}

