class Book extends LibraryItem implements Borrowable{
    String genre;
    Book(String title,String author,String itemId,String genre){
        super(title,author,itemId);
        this.genre = genre;
    }
    public String getType(){
        return "book";
    }
    public void borrow(Member member){
        if(isAvailable()){
            setAvailable(false);
            member.borrowItem(this);
            Library.incrementBorrowCount();
            System.out.println(title + " borrowed by " + member.name);
        }
        else{
            System.out.println(title + " is not Available");
        }
    }
    public void returnItem(Member member){
        setAvailable(true);
        System.out.println(member.name + "has returned the book : " + title);
    }
}
