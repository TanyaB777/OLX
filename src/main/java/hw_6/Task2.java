package hw_6;

public class Task2 {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        //кладемо 5 елементів
        array.put("1st");
        array.put("2nd");
        array.put("3rd");
        array.put("4rd");
        array.put("5rd");
        System.out.println("Довжина: " + array.length());
        System.out.println(array.get()); //виводимо перший елемент
        System.out.println(array.get()); //виводимо 2й елемент
        System.out.println(array.get()); //виводимо 3й елемент
        System.out.println(array.get()); //виводимо 4й елемент
        System.out.println(array.get()); //виводимо 5й елемент
        System.out.println("Довжина: " + array.length());
        //двічі перевіримо, що немає елементів
        System.out.println(array.get());
        System.out.println(array.get());
        System.out.println("Довжина перед тим як покласти елемент: " + array.length());
        array.put("new Elem");
        System.out.println("Довжина після того, як поклали: " + array.length());
        System.out.println(array.get()); //виводимо перший елемент

    }
}
