import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrowseHistory {
  // private List<String> urls = new ArrayList<>();
  private String[] urls = new String[11];
  private int count;

  public void push(String url) {
    urls[count++] = url;

  }

  public String pop() {
    count--;
    return urls[--count];
  }

  // public List<String> getUrls() {
  // return urls;
  // }
  public Iterators createIterator() {
    return new ArrayIterator(this);// 'this' keyword is hitory on this object
  }

  public class ArrayIterator implements Iterators {
    private BrowseHistory history;
    private int index;

    public ArrayIterator(BrowseHistory history) {
      this.history = history;
    }

    @Override
    public boolean hasNext() {
      return (index < history.count);
    }

    @Override
    public String current() {
      return history.urls[index];
    }

    @Override
    public void next() {
      index++;
    }

  }

  // Nested Class
  // public class ListIterator implements Iterators {
  // private BrowseHistory history;
  // private int index;

  // public ListIterator(BrowseHistory history) {
  // this.history = history;
  // }

  // @Override
  // public boolean hasNext() {
  // return (index < history.urls.size());
  // }

  // @Override
  // public String current() {
  // return history.urls.get(index);
  // }

  // @Override
  // public void next() {
  // index++;
  // }

  // }

}
