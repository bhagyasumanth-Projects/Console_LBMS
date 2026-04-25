class Member{
    String name;
    String memId;
    ArrayList<LibraryItem> borrowedItems;
    
    Member(String name, String memId){
        this.name = name;
        this.memId = memId;
        borrowedItems = new ArrayList<LibraryItem>();
    }
    
    public String getName(){
        return name;
    }
    
    public String getMemId(){
        return memId;
    }
    
    public void borrowItem(LibraryItem item){
        borrowedItems.add(item);
    }
    
    public void returnItem(LibraryItem item){
        borrowedItems.remove(item);
    }
    
    public void printBorrowedItems() {
        System.out.println("===== " + name + "'s Borrowed Items =====");
        if(borrowedItems.isEmpty()) {
            System.out.println("No items borrowed.");
        } else {
            for(LibraryItem item : borrowedItems) {
                System.out.println("- " + item.getTitle());
            }
        }
        System.out.println("=====================================");
    }
}
