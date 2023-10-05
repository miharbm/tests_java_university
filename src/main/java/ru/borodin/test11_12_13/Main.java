package ru.borodin.test11_12_13;

//Здесь написаны лабы с 11 по 13

/*
* 11.  Создать собственное проверяемое исключение и метод, выбрасывающий его.
*
* 12.  Реализовать метод, позволяющий другим методам узнать, откуда их вызвали.
*  Этот метод должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный метод.
*  Или null, если метод, вызвавший этот метод, является точкой входа в программу.
*
* 13. Создать собственный класс, объекты которого можно использовать в блоке try-with-resources.
*     Продемонстрировать использование объектов этого класса в try-with-resources.
*/
public class Main {
    public static void main(String[] args) {


        Car car1 = new Car(9, true);

        try (TestClass yup = new TestClass()) {
            car1.move();
            yup.print( "метод из автоклосбл класса" );
        }
        catch (CarIsNotReadyException a) {
            System.out.println(a.getMessage());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }
        catch (Error error) {
            System.out.print( error );
        }

    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = new Exception().getStackTrace();

        if (ste.length < 3 ) {
            return null;
        } else {
            return ste[2].getClassName() + "#" + ste[2].getMethodName();
        }
    }

}


class TestClass implements AutoCloseable {
    public void print(String s){
        System.out.println(s);
    }

    @Override
    public void close() throws Exception {
            System.out.println("ОНО ЗАКРЫЛОСЬ");
    }
}




