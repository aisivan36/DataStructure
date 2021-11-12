import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrowseHistory {
  private List<String> urls = new ArrayList<>();
  // private String[] urls = new String[11];

  public void push(String url) {
    urls.add(url);
  }

  public String pop() {
    var lastIndex = urls.size() - 1;
    var lastUrl = urls.get(lastIndex);
    urls.remove(lastUrl);

    return lastUrl;
  }

  // public List<String> getUrls() {
  // return urls;
  // }
  public Iterators createIterator() {
    return new ListIterator(this);
  }

  // Nested Class
  public class ListIterator implements Iterators {
    private BrowseHistory history;
    private int index;

    public ListIterator(BrowseHistory history) {
      this.history = history;
    }

    @Override
    public boolean hasNext() {
      return (index < history.urls.size());
    }

    @Override
    public String current() {
      return history.urls.get(index);
    }

    @Override
    public void next() {
      index++;
    }

  }

}
