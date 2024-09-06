package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview review1 = new MovieReview();
        review1.title = "듄";
        review1.review = "쏘쏘";
        reviews[0] = review1;

        MovieReview review2 = new MovieReview();
        review2.title = "파묘";
        review2.review = "굿";
        reviews[1] = review2;

        for (MovieReview review : reviews) {
            System.out.println("영화 : " + review.title + ", 리뷰 : " + review.review);
        }
    }
}
