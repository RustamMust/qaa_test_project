package practice_8.homework.extra_tasks;

public class SingleContainer<T> implements Сontainer<T> {
    private T element;

    @Override
    public void add(T item) {
        this.element = item;
    }

    @Override
    public T get() {
        return element;
    }
}
