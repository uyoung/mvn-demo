package me.young.demo.mvn.util;

/**
 * Created by flybe on 2018/11/14.
 */
public class ObjectUtil {
    /**
     * 读取输入类的最末尾子类
     *
     * @param clazz 父类
     * @param intf  子类需要实现的接口
     * @return 最末尾子类
     */
    public Class readLeafClass(Class clazz, Class intf) {
        Reflections reflections = new Reflections("java.util");
        Set<Class<? extends List>> classes = reflections.getSubTypesOf(java.util.List.class);
        for (Class<? extends List> aClass : classes) {
            System.out.println(aClass.getName());
            if(aClass == ArrayList.class) {
                List list = aClass.newInstance();
                list.add("test");
                System.out.println(list.getClass().getName() + ": " + list.size());
            }
        }
    }
}
