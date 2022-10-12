//add reflections (cms)
public class CharacterFactory {
    
    @SneakyThrows
    public static Character createCharacter() {
        Reflections reflections = new Reflections(profix: “lotr”);

        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());

        Class cls = (Class) subTypes.toArray()[new Random().nextInt(subTypes.size())];
        return (Character) cls.getDeclaredConstructor().newInstance();
    }

}
