import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MultiSet {
     /*
       An abstract class representing the MultiSet ADT, which supports the
    add, remove, is_empty, count, and contains operations.

    This class itself does not handle how the underlying data is stored,
    so it just inherits Object.__init__.
    */
    public boolean add(Object args) throws NotImplementedException {
        throw new NotImplementedException();
    }
    public void remove(Object args) throws Exception {
        throw new Exception("This method has not been implemented.");
    }
    public boolean contains(Object args) throws NotImplementedException{
        throw new NotImplementedException();
    }
    public boolean is_empty(Object args) throws NotImplementedException{
        throw new NotImplementedException();
    }
    public int count(Object args) throws NotImplementedException{
        throw new NotImplementedException();
    }
    public int size(Object args) throws NotImplementedException {
        throw new NotImplementedException();
    }
}
