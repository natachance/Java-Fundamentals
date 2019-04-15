package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01;

import java.util.ArrayList;

class LibraryController{
    public static void main(String[] args) {

        LibraryElement eBook = new eBook("Becoming", "November 13, 2018", 100,
                false, true, "Michelle Obama", 448, "Excellent",
                false);
        System.out.println(eBook);
        System.out.println();
        System.out.println("Is " + eBook.getTitle() + " by " + ((eBook) eBook).getAuthor() + " available for checkout?");
        eBook.requestDigitalVersion(101, true, true);
        System.out.println();

        LibraryElement newspaper = new Newspaper("The New York Times", "Sunday, April 14, 2019",
                201, false, true, "Daily",
                "journalism; reporting on national & international news", "Georgia");
        System.out.println(newspaper);
        System.out.println();
        System.out.println("Is the " + newspaper.getPublicationDate() + " edition of " + newspaper.getTitle() +
                " available for checkout?");
        newspaper.checkoutProcess(201, false);
    }
}

class Library{
    String name;
    String address;
    ArrayList<LibraryElement> collection;
}

public class LibraryElement {

    private String title;
    private String publicationDate;
    private int referenceNumber;
    private boolean checkedOut;
    private boolean digitalOption;

    public LibraryElement(String title, String publicationDate, int referenceNumber, boolean checkedOut, boolean digitalOption) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.referenceNumber = referenceNumber;
        this.checkedOut = checkedOut;
        this.digitalOption = digitalOption;
    }

    public void checkoutProcess(int referenceNumber, boolean checkedOut){
        if (checkedOut = true) {
            System.out.println("Item " + referenceNumber + " is checked out.");
        } else {
            System.out.println("Item " + referenceNumber + " is available.");
        }
    }

    public void requestDigitalVersion(int referenceNumber, boolean digitalOption, boolean checkedOut){
        if (digitalOption == true && checkedOut == false){
            System.out.println("Digital version available.");
        } else if (digitalOption == true && checkedOut == true){
            System.out.println("Digital version not available at this time, please check back later.");
        } else {
            System.out.println("Digital version not available.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public boolean isDigitalOption() {
        return digitalOption;
    }

    public void setDigitalOption(boolean digitalOption) {
        this.digitalOption = digitalOption;
    }

    @Override
    public String toString() {
        return "LibraryElement{" +
                "title='" + title + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", referenceNumber=" + referenceNumber +
                ", checkedOut=" + checkedOut +
                ", digitalOption=" + digitalOption +
                '}';
    }
}

class Book extends LibraryElement {

    private String author;
    private int numberOfPages;
    private String condition;
    private boolean hardcover;

    public Book(String title, String publicationDate, int referenceNumber, boolean checkedOut, boolean digitalOption,
                String author, int numberOfPages, String condition, boolean hardcover) {
        super(title, publicationDate, referenceNumber, checkedOut, digitalOption);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.condition = condition;
        this.hardcover = hardcover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Book{" +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", condition='" + condition + '\'' +
                ", hardcover=" + hardcover +
                '}';
    }
}

class Novel extends Book{

    private String genre;
    private boolean bestSeller;

    public Novel(String title, String publicationDate, int referenceNumber, boolean checkedOut, boolean digitalOption,
                 String author, int numberOfPages, String condition, boolean hardcover, String genre, boolean bestSeller) {
        super(title, publicationDate, referenceNumber, checkedOut, digitalOption, author, numberOfPages, condition, hardcover);
        this.genre = genre;
        this.bestSeller = bestSeller;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Novel{" +
                "genre='" + genre + '\'' +
                ", bestSeller=" + bestSeller +
                '}';
    }
}

class eBook extends Book{

    public eBook(String title, String publicationDate, int referenceNumber, boolean checkedOut, boolean digitalOption,
                 String author, int numberOfPages, String condition, boolean hardcover) {
        super(title, publicationDate, referenceNumber, checkedOut, digitalOption, author, numberOfPages, condition, hardcover);
    }

    @Override
    public void requestDigitalVersion(int referenceNumber, boolean digitalOption, boolean checkedOut){
        if (checkedOut == false){
            System.out.println("Available.");
        } else {
            System.out.println("Not available.");
        }
    }
}

class Periodical extends LibraryElement {
    private String frequency;

    public Periodical(String title, String publicationDate, int referenceNumber, boolean checkedOut, boolean digitalOption,
                      String frequency) {
        super(title, publicationDate, referenceNumber, checkedOut, digitalOption);
        this.frequency = frequency;
    }

    @Override
    public void checkoutProcess(int referenceNumber, boolean checkedOut) {
        System.out.println("Not available for checkout, in-library only item.");
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Periodical{" +
                "frequency='" + frequency + '\'' +
                '}';
    }
}

class Magazine extends Periodical{

    private String publisher;
    private String topic;

    public Magazine(String title, String publicationDate, int referenceNumber, boolean checkedOut, boolean digitalOption,
                    String frequency, String publisher, String topic) {
        super(title, publicationDate, referenceNumber, checkedOut, digitalOption, frequency);
        this.publisher = publisher;
        this.topic = topic;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Magazine{" +
                "publisher='" + publisher + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}

class Newspaper extends Periodical{

    private String reportingType;
    private String typeset;

    public Newspaper(String title, String publicationDate, int referenceNumber, boolean checkedOut, boolean digitalOption,
                     String frequency, String reportingType, String typeset) {
        super(title, publicationDate, referenceNumber, checkedOut, digitalOption, frequency);
        this.reportingType = reportingType;
        this.typeset = typeset;
    }

    public String getReportingType() {
        return reportingType;
    }

    public void setReportingType(String reportingType) {
        this.reportingType = reportingType;
    }

    public String getTypeset() {
        return typeset;
    }

    public void setTypeset(String typeset) {
        this.typeset = typeset;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Newspaper{" +
                "reportingType='" + reportingType + '\'' +
                ", typeset='" + typeset + '\'' +
                '}';
    }
}