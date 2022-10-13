package creators;

import creatures.Noble;
import creatures.Character;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {

    @SneakyThrows
    public static Character createCharacter(){
        Reflections reflections = new Reflections("characters");

        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());

        subTypes.remove(Noble.class);

        Class cls = (Class) subTypes.toArray()[new Random().nextInt(subTypes.size())];
        return (Character) cls.getDeclaredConstructor().newInstance();
    }
}
