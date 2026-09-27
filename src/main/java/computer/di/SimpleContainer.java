package computer.di;

import java.util.Map;

import computer.processor.IntelProcessor;
import computer.processor.Processor;
import computer.storage.SsdStorage;
import computer.storage.Storage;

public class SimpleContainer {

    public <T> T getInstance(Class<T> type) {

        Class<?> implementation = implementations.getOrDefault(type, type);
        var constructor = implementation.getDeclaredConstructors()[0];
        var parameterTypes = constructor.getParameterTypes();

        Object[] dependencies = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            dependencies[i] = getInstance(parameterTypes[i]);
        }

        try {
            return (T) constructor.newInstance(dependencies);
        }
        catch (Exception e) {
            throw new RuntimeException(
                    "Could not create instance of " + type.getName(),
                    e
            );
        }
    }

    private final Map<Class<?>, Class<?>> implementations = Map.of(
            Storage.class, SsdStorage.class,
            Processor.class, IntelProcessor.class
    );
}
