import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static<T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static<T> int indexOf(List<T> source, T t) {
        return source.indexOf(t);
    }

    public static<T> List<T> limit(List<T> source, int size) {
        return source.stream().limit(size).collect(Collectors.toList());
    }

    public static<T> void add(List<? super T> source, T t) {
        source.add(t);
    }

    public static<T> void removeAll(List<T> removeFrom, List<T> c2) {
        removeFrom.removeAll(c2);
    }

    //true если первый лист содержит все элементы второго
    public static<T> boolean containsAll(List<T> c1, List<T> c2) {
        return new HashSet<>(c1).containsAll(c2);
    }

    //true если первый лист содержит хотя-бы 1 второго
    public static<T> boolean containsAny(List<T> c1, List<T> c2) {
        for (var item : c2) {
            if (c1.contains(item)) {
                return true;
            }
        }

        return false;
    }

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static<T> List<T> range(List<T> list, T min, T max) {
        Comparator comparator = Comparator.naturalOrder();
        list.sort(comparator);
        int minInd = list.indexOf(min);
        int maxInd = list.indexOf(max);

        return list.subList(minInd, maxInd + 1);
    }

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static<T> List range(List<T> list, T min, T max, Comparator comparator) {
        list.sort(comparator);
        int minInd = list.indexOf(min);
        int maxInd = list.indexOf(max);

        return list.subList(minInd, maxInd + 1);
    }
}