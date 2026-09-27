package computer.app;

import computer.Computer;
import computer.di.SimpleContainer;
import computer.processor.IntelProcessor;
import computer.processor.Processor;
import computer.storage.SsdStorage;
import computer.storage.Storage;

public class Main {
    static void main(String[] args) {


        // Part 1: Manual constructor injection
        Storage storage = new SsdStorage();
        Processor processor = new IntelProcessor();

        Computer computer = new Computer(storage, processor);

        System.out.println("Manual contructor injection:");
        computer.runTask("Backup files");


        // Part 2: A Minimal DI Container
        SimpleContainer simpleContainer = new SimpleContainer();

        Computer computerFromContainer = simpleContainer.getInstance(Computer.class);

        System.out.println("Minimal DI Container:");
        computerFromContainer.runTask("Container backup");
    }


}
