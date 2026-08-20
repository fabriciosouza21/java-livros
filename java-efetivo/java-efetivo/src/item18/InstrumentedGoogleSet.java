package item18;

import com.google.common.collect.ForwardingSet;
import org.jspecify.annotations.NullMarked;

import java.util.Collection;
import java.util.Set;

public class InstrumentedGoogleSet<E> extends ForwardingSet<E> {

    private final Set<E> s;

    private int addCount = 0;

    public InstrumentedGoogleSet(Set<E> s) {
        this.s = s;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    public int getAddCount() {
        return addCount;
    }

    @Override
    @NullMarked
    protected Set<E> delegate() {
        return s;
    }


}
