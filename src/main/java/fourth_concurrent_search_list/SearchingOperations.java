package fourth_concurrent_search_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class SearchingOperations {
    List<Integer> list = new ArrayList<>();
    Random random = new Random();
    private final AtomicBoolean found = new AtomicBoolean(false);

    public SearchingOperations(){
        fill();
    }

    public void fill(){
        for (int i = 0; i <= 100; i++) {
            list.add(random.nextInt(20));
        }
    }

    public void search (int valueToSearch,int listPart) {
        if (found.get()) return;
        int iterator = 0;
        int lenght = list.size()/4;
        switch (listPart){
            case 1:
                break;
            case 2:
                iterator=lenght+1;
                lenght=lenght*2;
                break;
            case 3:
                iterator=(lenght*2)+1;
                lenght=lenght*3;
                break;
            case 4:
                iterator=(lenght+3)+1;
                lenght=lenght*4;
                break;
        }
        for (int i = iterator; i <=lenght ; i++) {
            if (found.get()) return;
            if(list.get(i)==valueToSearch){
                if (found.compareAndSet(false, true)) {
                    System.out.println("Found by thread: " + listPart);
                }else {
                    System.out.println("Not Found");
                }
                return;
            }
        }

    }

    public List<Integer> getList() {
        return list;
    }
}
