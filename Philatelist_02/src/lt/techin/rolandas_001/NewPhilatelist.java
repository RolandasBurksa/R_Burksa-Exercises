package lt.techin.rolandas_001;

import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;

public class NewPhilatelist implements Philatelist {
    public static void main(String[] args) {

    }
    private final List<PostStamp> collection = new ArrayList<>();

    @Override
    public void addToCollection(PostStamp postStamp) {
        if ((postStamp == null) || (postStamp.getName() == null) || (postStamp.getName().equals(""))) {
            throw new IllegalArgumentException();
        }
        for (PostStamp PostStampInCollection : collection) {
            if (PostStampInCollection.equals(postStamp)) {
                return;
            }

        }
        collection.add(postStamp);

    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {
        if (collection.isEmpty()) {
            return null;
        }
        PostStamp mostExpensivePostStamp = collection.get(0);
        for(PostStamp postStamp : collection){
            if(postStamp.getMarketPrice() > mostExpensivePostStamp.getMarketPrice()){
                mostExpensivePostStamp = postStamp;
            }
        }
        return mostExpensivePostStamp;
    }

    @Override
    public double getAveragePostStampPrice() {
        if(collection.isEmpty()){
            return 0.0;
        }
        double totalPrice = 0.0;
        for(PostStamp postStamp : collection){
            totalPrice += postStamp.getMarketPrice();
        }
        return totalPrice /collection.size();

    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return collection.size();
    }
}
