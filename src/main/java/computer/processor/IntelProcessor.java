package computer.processor;

public class IntelProcessor implements Processor {

    @Override
    public void process(String task) {
        System.out.println("Intel processor processing task: " + task);
    }
}
