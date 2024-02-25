package lt.techin.examRB;

import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;

public class PhilatelistImplementation implements Philatelist {

    private List<PostStamp> collection = new ArrayList<>();
    @Override
    public void addToCollection(PostStamp postStamp) {
        if ((postStamp == null) || (postStamp.getName() == null) || (postStamp.getName().isEmpty())) {
            throw new IllegalArgumentException();
        } else {
            for (PostStamp postStampInCollection : collection) {
                if (postStampInCollection.equals(postStamp)) {
                    return;
                }
            }
        }
        collection.add(postStamp);
    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {
        if(collection.isEmpty()){
            return null;
        }
        PostStamp mostExpensivePostStamp = collection.get(0);
        for(PostStamp postStamp : collection){
            if (postStamp.getMarketPrice() > mostExpensivePostStamp.getMarketPrice()){
                mostExpensivePostStamp = postStamp;
            }
        }
        return mostExpensivePostStamp;
    }

    @Override
    public double getAveragePostStampPrice() {
        if (collection.isEmpty()){
            return 0.0;
        }
        double totalPostStampsPrice = 0.0;
        for (PostStamp postStamp : collection){
            totalPostStampsPrice += postStamp.getMarketPrice();
        }
        return totalPostStampsPrice / collection.size();  // size() == kiek pasto zenklu yra kolekcijoje
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return collection.size();
    }
}
