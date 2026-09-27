package computer;

import computer.storage.Storage;
import computer.processor.Processor;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class Computer {

    private final Storage storage;
    private final Processor processor;

    @Inject
    public Computer(Storage storage, Processor processor) {
        this.storage = storage;
        this.processor = processor;
    }

    public void runTask(String task) {
        storage.store(task);
        processor.process(task);
    }
}
