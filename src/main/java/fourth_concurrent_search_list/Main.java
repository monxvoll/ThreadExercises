package fourth_concurrent_search_list;
public class Main {
    public static void main(String[] args) {
        SearchingOperations searcher = new SearchingOperations();
        int valueToSearch = 5;

        SearcherThread threadOne = new SearcherThread(searcher,valueToSearch,1);
        SearcherThread threadTwo = new SearcherThread(searcher,valueToSearch,2);
        SearcherThread threadThree = new SearcherThread(searcher,valueToSearch,3);
        SearcherThread threadFour = new SearcherThread(searcher,valueToSearch,4);

      threadOne.start();
      threadTwo.start();
      threadThree.start();
      threadFour.start();

        System.out.println(searcher.getList());
    }
}
