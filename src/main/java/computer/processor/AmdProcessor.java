package computer.processor;

public class AmdProcessor implements Processor {

    @Override
    public void process(String task) {
        System.out.println("AMD processor processing task " + task);
    }
}
