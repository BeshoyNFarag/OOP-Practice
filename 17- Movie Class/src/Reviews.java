import java.util.ArrayList;

public class Reviews <T, K>{


    public T reviewerName;
    public K reviewerRating;

    public Reviews (T reviewerName,K reviewerRating){
        this.reviewerName = reviewerName;
        this.reviewerRating = reviewerRating;
    }


    public static ArrayList<Reviews> reviewsList = new ArrayList<>();
    public static void addReview(Reviews review){
        reviewsList.add(review);
    }
}
