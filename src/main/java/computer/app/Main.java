package computer.app;

import computer.Computer;
import computer.di.SimpleContainer;
import computer.processor.IntelProcessor;
import computer.processor.Processor;
import computer.storage.SsdStorage;
import computer.storage.Storage;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    static void main(String[] args) {


        // Part 1: Manual constructor injection
        Storage storage = new SsdStorage();
        Processor processor = new IntelProcessor();

        Computer computer = new Computer(storage, processor);

        System.out.println("Manual constructor  injection:");
        computer.runTask("Backup files");


        // Part 2: A Minimal DI Container
        SimpleContainer simpleContainer = new SimpleContainer();

        Computer computerFromContainer = simpleContainer.getInstance(Computer.class);

        System.out.println("Minimal DI Container:");
        computerFromContainer.runTask("Container backup");

        // Part 3: Using Weld CDI
        Weld weld = new Weld();

        WeldContainer container = weld.initialize();
        Computer computerFromWeld = container.select(Computer.class).get();

        System.out.println("Weld CDI:");
        computerFromWeld.runTask("weld backup\n");

        container.shutdown();
    }


}
