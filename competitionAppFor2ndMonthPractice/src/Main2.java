import bean.User;
import bean.Users;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) throws NoSuchMethodException {
        Users users = new Users();
        Method[] declaredMethods = users.getClass().getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method declaredMethod = declaredMethods[i];

            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();

            for (int j = 0; j < declaredAnnotations.length; j++) {
                Annotation declaredAnnotation = declaredAnnotations[i];
                System.out.println(declaredAnnotation.annotationType());
            }
        }
    }
}
