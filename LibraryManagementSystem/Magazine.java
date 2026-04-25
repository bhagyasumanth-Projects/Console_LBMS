class Magazine extends LibraryItem implements Borrowable{
    int issueNumber;
    Magazine(String title,String author,String itemId, int issueNumber){
        super(title,author,itemId);
        this.issueNumber = issueNumber;
    }
    public String getType(){
        return "Magazine";
    }
    public void borrow(Member member){
        if(isAvailable()){
            setAvailable(false);
            member.borrowItem(this);
            Library.incrementBorrowCount();
            System.out.println(title + " borrowed by " + member.name);
        }
        else{
            System.out.println(title + " is not Available !");
        }
    }
    public void returnItem(Member member){
        setAvailable(true);
        System.out.println(member.name + "has returned the Magazine : " + title);
    }
}
