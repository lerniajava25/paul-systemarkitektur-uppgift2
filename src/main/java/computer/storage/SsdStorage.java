package computer.storage;

public class SsdStorage implements Storage {

    @Override
    public void store(String data) {
        System.out.println("Stored on SSD: " + data);
    }
}
