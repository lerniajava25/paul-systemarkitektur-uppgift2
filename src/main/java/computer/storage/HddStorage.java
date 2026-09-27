package computer.storage;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HddStorage implements Storage {

    @Override
    public void store(String data) {
        System.out.print("Stored on hdd: " + data);
    }
}
