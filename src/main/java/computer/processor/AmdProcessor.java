package computer.processor;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AmdProcessor implements Processor {

    @Override
    public void process(String task) {
        System.out.println("AMD processor processing task " + task + "\n");
    }
}
