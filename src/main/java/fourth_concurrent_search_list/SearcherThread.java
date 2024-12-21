package fourth_concurrent_search_list;

public class SearcherThread extends Thread {
    private  final SearchingOperations searcher;
    private final int numberToSearch;
    private final int listPart;
    public SearcherThread(SearchingOperations searcher, int numberToSearch, int listPart) {
        this.searcher = searcher;
        this.numberToSearch = numberToSearch;
        this.listPart = listPart;
    }

    @Override
    public void run() {
        searcher.search(numberToSearch,listPart);
    }

}
