package lt.techin.exam_02;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewsServiceImplementation implements NewsService {

    private static final String[] COMMON_SWEARINGS = {"rupūs miltai", "velniai rautų", "velnias", "velniais"};
    private List<String> swearings = new ArrayList<>(Arrays.asList(COMMON_SWEARINGS));

    private NewsService newsService = new NewsServiceImpl();
    @Override
    public List<Article> getArticles() {
        return getChildSafeArticles(newsService.getArticles());
    }

    private List<Article> getChildSafeArticles(List<Article> articles) {
        List<Article> childSafeArticles = new ArrayList<>();
        for(Article article : articles){
            if(isChildSafeHeading(article)){
                childSafeArticles.add(maskSwearings(article));
            }
        }
        return  childSafeArticles;
    }

    private Article maskSwearings(Article article) {
        String maskedBrief = article.getBrief();
        for (String swearing : swearings){
            maskedBrief = maskedBrief.replaceAll("(?i)" + swearing,  "***");
        }
        return new MaskedArticle(article.getHeading(), maskedBrief);
    }

    private boolean isChildSafeHeading(Article article) {
        if (swearings.isEmpty()){
            return true;
        }
        for (String swearing : swearings){
            if(article.getHeading().toLowerCase().contains(swearing)){
                return false;
            }
        }
        return true;
    }
}
