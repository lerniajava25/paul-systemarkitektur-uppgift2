package computer;

import computer.storage.Storage;
import computer.processor.Processor;

public class Computer {

    private final Storage storage;
    private final Processor processor;

    public Computer(Storage storage, Processor processor) {
        this.storage = storage;
        this.processor = processor;
    }

    public void runTask(String task) {
        storage.store(task);
        processor.process(task);
    }
}
