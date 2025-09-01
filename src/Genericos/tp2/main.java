package Genericos.tp2;
import java.lang.reflect.*;

public class main {
    public static void main(String[] args) {
        try {
            Class<?> personaClass = Persona.class;

            Constructor<?>[] constructores = personaClass.getDeclaredConstructors();
            System.out.println("Constructores:");
            for (Constructor<?> constructor : constructores) {
                System.out.println(constructor);
            }

            Constructor<?> constructor = personaClass.getConstructor(String.class, int.class);
            Object persona = constructor.newInstance("Juan", 30);

            Field nombreField = personaClass.getDeclaredField("nombre");
            nombreField.setAccessible(true);
            nombreField.set(persona, "Pedro");

            Method mostrarInfoMethod = personaClass.getMethod("mostrarInfo");
            mostrarInfoMethod.invoke(persona);

            Method saludarMethod = personaClass.getMethod("saludar");
            saludarMethod.setAccessible(true);

            String saludo = (String) saludarMethod.invoke(persona);
            System.out.println(saludo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}