package class1.ex;

public class Clas1sEx1 {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        MovieReview review2 = new MovieReview();

        review1.title = "듄";
        review1.review = "쏘쏘";
        review2.title = "파묘";
        review2.review = "굿";

        System.out.println("영화 : " + review1.title + ", 리뷰 : " + review1.review);
        System.out.println("영화 : " + review2.title + ", 리뷰 : " + review2.review);
    }
}
