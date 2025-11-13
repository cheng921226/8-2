import java.util.LinkedList;
class MyQueue<T> extends LinkedList<T> {


    public MyQueue() {
        super();
    }

    public void enqueue(T item) {
        this.addLast(item);
    }

    public T dequeue() {
        return this.removeFirst();
    }
    
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // 返回队列中的元素数量
    public int size() {
        return super.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        //do some test if needed
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

    }
}


//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------