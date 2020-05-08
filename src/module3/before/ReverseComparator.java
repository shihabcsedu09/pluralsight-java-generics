package module3.before;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

    private final Comparator<T> delegateComparator;

    public ReverseComparator(final Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(final T left, final T right) {
        return -1 * this.delegateComparator.compare(left, right);
    }
}
