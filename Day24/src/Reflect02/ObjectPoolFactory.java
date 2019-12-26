package Reflect02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ObjectPoolFactory {
    private Map<String,Object> objectpool = new HashMap<>();
    private Object createObject(String clazzName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName(clazzName);
        return clazz.getConstructor().newInstance();
    }
    public void initPool(String fileName){
       /* try {
            FileInputStream fis = new FileInputStream(fileName)
            {
                Properties props = new Properties();
                //无法调用对象
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

    }
}
