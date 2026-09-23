package computer.app;

import computer.Computer;
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

        computer.runTask("\nBackup files\n");
    }
}
