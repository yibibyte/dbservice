package ru.db.generic;

import java.util.ArrayList;

/**
 * Стирание происходит в класс Object
 *
 * @param <T>
 */
public class MyClass<T> {
    private void handle(T arg) {

    }

    //    private void handle(Object operand) {
//
//    }


/*   Нет в Exception так как после компиляции трудно определить в какой тип превращается наш Exception
    try {

    } catch (MyException<String> e){

    }catch (MyException<String> e){

    }
*/


//    ArrayList<Integer> arrayList = new ArrayList<>(Integer.class);

    public static class MyClassWithList<T> {
        private ArrayList<T> list = new ArrayList<>();

        public MyClassWithList(Class<T> myClass) {
            T t  = null;
//            for(int i = 0;i <10;i++ ) {
//                list.add(mew T());
//            }
//            t = (T)myClass.getDeclaredConstructors(null)
        }

        public ArrayList<T> getList() {
            return list;
        }
    }


}