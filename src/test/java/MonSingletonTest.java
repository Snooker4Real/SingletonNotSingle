import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

class MonSingletonTest {
    @Test
    public void MonSingletonTest() throws Exception {
        Constructor<MonSingleton> constructor = MonSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        MonSingleton autreSingleton = constructor.newInstance();
        MonSingleton autreSingleton1 = constructor.newInstance();

        System.out.println(constructor);
        System.out.println("Memory adresses : ");
        System.out.println(autreSingleton);
        System.out.println(autreSingleton1);

    }
}