package complex_tasks.homework.task_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager <T extends Entity> {
    private CopyOnWriteArrayList<T> entites = new CopyOnWriteArrayList<>();

    public void add(T entity) {
        entites.add(entity);
    }

    public boolean remove(T entity) {
        return entites.remove(entity);
    }

    public List<T> getAllElementsFromList() {
        return List.copyOf(entites);
    }

    public List<T> filterByAge(int minAge, int maxAge) {
        return entites.stream().filter(entity -> entity.getAge() >= minAge && entity.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String name) {
        return entites.stream().filter(entity -> entity.getName().equals(name))
                .collect(Collectors.toList());
    }

    public List<T> filterByActive() {
        return entites.stream().filter(entity -> entity.isActive())
                .collect(Collectors.toList());
    }
}
