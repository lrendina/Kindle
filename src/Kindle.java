public class Kindle {

    private int numberOfPages, currentPage;

    public Kindle(int numPages) {
        currentPage = 1;
        this.numberOfPages = numPages;
    }

    public void turnPages(){
        turnPages(1);
    }
    public void turnPages(int pagesTurned){
        if((currentPage + pagesTurned) > numberOfPages){
            System.out.println("Turning " + pagesTurned + " pages would take you past the last page.");
            currentPage += 1;
        } else{
            currentPage += pagesTurned;
        }
    }
    public String toString(){
        return "Page " + currentPage + " of " + numberOfPages;
    }
}