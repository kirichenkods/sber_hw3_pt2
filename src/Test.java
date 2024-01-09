import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        System.out.println(CollectionUtils.containsAll( Arrays.asList(8,1,3,5,6,4), Arrays.asList(8,1,3,5,4) ));
        System.out.println(CollectionUtils.containsAll( Arrays.asList(8,1,3,5,6,4), Arrays.asList(8, 7) ));
        System.out.println(CollectionUtils.containsAny( Arrays.asList(8,1,3,5,6,4), Arrays.asList(8, 7) ));
        System.out.println(CollectionUtils.containsAny( Arrays.asList(8,1,3,5,6,4), Arrays.asList(7,9) ));


        System.out.println(CollectionUtils. range(Arrays.asList(8,1,3,5,6,4), 3, 6));
        System.out.println(CollectionUtils. range(Arrays.asList(8,1,3,5,6,4), 1, 5));
        Comparator comparator = Comparator.naturalOrder();
        System.out.println(CollectionUtils. range(Arrays.asList(8,1,3,5,6,4), 3, 6, comparator));
    }
}
