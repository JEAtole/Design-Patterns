public class MediaCompany {
    public static void main(String[] args) {

        Subscriber maria = new Subscriber("Maria");
        Subscriber juan = new Subscriber("Juan");
        Subscriber oliver = new Subscriber("Oliver");

        NewsLetter newsLetter = new NewsLetter();
        newsLetter.subscribe(maria);
        newsLetter.subscribe(juan);
        newsLetter.subscribe(oliver);

        newsLetter.addNewsUpdate("McDonald | New Deals Now Available!");

        newsLetter.unsubscribe(juan);

        newsLetter.addNewsUpdate("KathNiel confirmed breakup!");

    }


}
