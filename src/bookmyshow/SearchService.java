package bookmyshow;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SearchService {
    public static SearchService searchService;
    public final List<Movie> moviesInCity;
    public final Search catalog;
    private SearchService(){
        moviesInCity = new CopyOnWriteArrayList<Movie>();
        catalog = new Catalog(moviesInCity);
    }

    public SearchService getSearchService(){
        if(searchService == null){
            synchronized (SearchService.class){
                if(searchService == null){
                    searchService = new SearchService();
                }
            }
        }
        return searchService;
    }

    public Search getCatalog(){
        return catalog;
    }


    public List<Movie> search(String query) {
        return moviesInCity;
        // stub for chatgpt to complete
    }




}
