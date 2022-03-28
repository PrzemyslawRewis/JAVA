import java.util.*;

class Vector3D<T> implements List<T> {
    private T obj1;
    private T obj2;
    private T obj3;

    Vector3D(T x,T y,T z) {
        obj1=x;
        obj2=y;
        obj3=z;

    }
    public String toString() {
        return "("+obj1.toString()+","+obj2.toString()+","+obj3.toString()+")";

    }
    public T x()
    {
        return obj1;
    }
    public T y()
    {
        return obj2;
    }
    public T z()
    {
        return obj3;
    }
    public Vector3D<?> add(Vector3D<? extends Number> vec)
    {
        Number x=vec.x();
        Number y=vec.y();
        Number z=vec.z();
        Number x1=(Number)this.x();
        Number y1=(Number) this.y();
        Number z1=(Number) this.z();
        if (x1 instanceof Integer)
        {
            int a=x.intValue();
            int b=y.intValue();
            int c=z.intValue();
            int d=x1.intValue();
            int e=y1.intValue();
            int f=z1.intValue();
            Integer wsp1=a+d;
            Integer wsp2=b+e;
            Integer wsp3=c+f;
            return new Vector3D<Integer>(wsp1,wsp2,wsp3);
        }
        else
        {
            double a=x.doubleValue();
            double b=y.doubleValue();
            double c=z.doubleValue();
            double d=x1.doubleValue();
            double e=y1.doubleValue();
            double f=z1.doubleValue();
            Double wsp1=a+d;
            Double wsp2=b+e;
            Double wsp3=c+f;
            return new Vector3D<Double>(wsp1,wsp2,wsp3);

        }


    }
    public List<T> getList()
    {
        List<T> list = new ArrayList<T>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        return list;

    }

    @Override
    public int size() {
        return 3;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
