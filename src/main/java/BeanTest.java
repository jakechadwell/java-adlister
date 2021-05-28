import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album thriller = new Album();
        Album backInBlack = new Album();
        Album bad = new Album();
        Author douglasAdams = new Author();
        Author markTwain = new Author();
        Author kurtVonnegut = new Author();
        Quote quoteOne= new Quote();
        Quote quoteTwo = new Quote();
        Quote quoteThree = new Quote();
        quoteOne.setAuthor("Douglas Adams");
        quoteOne.setContent("I love deadlines. I love the whooshing noise they make as they go by.");
        quoteTwo.setAuthor("Mark Twain");
        quoteTwo.setContent("Clothes make the man. Naked people have little or no influence on society.");
        quoteThree.setAuthor("Kurt Vonnegut");
        quoteThree.setContent("The universe is a big place, perhaps the biggest.");
        ArrayList<Quote> quoteArrayList = new ArrayList<>();
        quoteArrayList.add(quoteOne);
        quoteArrayList.add(quoteTwo);
        quoteArrayList.add(quoteThree);
        for(Quote quote: quoteArrayList){
            System.out.println(quote.getAuthor());
            System.out.println(quote.getContent());
        }
    }
}
