abstract class LibraryItem{
    String title;
    String author;
    String itemId;
    boolean available;
    
    LibraryItem(String title,String author,String itemId){
        this.title = title;
        this.author = author;
        this.itemId = itemId;
        this.available = true;
    }
    
    abstract String getType();
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getitemId(){
        return itemId;
    }
    
    public void setAvailable(boolean available){
        this.available = available;
    }
    public boolean isAvailable(){
        return available;
    }
}
