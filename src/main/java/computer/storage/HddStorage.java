package computer.storage;

public class HddStorage implements Storage {

    @Override
    public void store(String data) {
        System.out.print("Stored" + data);
    }
}
