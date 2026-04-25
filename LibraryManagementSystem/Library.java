class Library{
    static String libraryName = "Smart Library";
    static int totalBorrowCount = 0;
    ArrayList <LibraryItem> catalog;
    
    Library(){
        this.libraryName = libraryName;
        catalog = new ArrayList<LibraryItem>();
    }
    
    public void addItem(LibraryItem item){
        catalog.add(item);
    }
    
    public LibraryItem searchByTitle(String title) {
        for(LibraryItem item : catalog) {
            if(item.getTitle().equalsIgnoreCase(title)) {
                return item;   // return the actual object
            }
        }
        return null;           // not found
    }
    
    public void printCatalog(){
        System.out.println("========== Catalog ===========");
        if(catalog.isEmpty()) {
            System.out.println("No items in stock.");
        } else {
            for(LibraryItem item : catalog) {
                System.out.println("- " + item.getTitle());
            }
        }
        System.out.println("=====================================");
    }
    public static int getTotalBorrowCount(){
        return totalBorrowCount;
    }
    
    public static void incrementBorrowCount(){
        totalBorrowCount++;
    }
}
