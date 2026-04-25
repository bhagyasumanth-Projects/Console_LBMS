public class Main {
    public static void main(String[] args){
        Library lib = new Library();
        System.out.println("====== WELCOME TO " +Library.libraryName + " =====================");
        
        Book b1 = new Book("HarryPotter", "J.K Rowling", "Book-001", "Fantasy");
        lib.addItem(b1);
        
        Book b2 = new Book("The AlChemist", "Paulo Coelho", "Book-002", "Fiction");
        lib.addItem(b2);
        
        Magazine m1 = new Magazine("National Geographic", "Various", "MAG-001", 42);
        lib.addItem(m1);
        
        lib.printCatalog();
        
        Member mem1 = new Member("Sumanth","mem-001");
        Member mem2 = new Member("Ravi","mem-002");
        b1.borrow(mem1);
        b2.borrow(mem2);
        m1.borrow(mem1);
        
        mem1.printBorrowedItems();
        mem2.printBorrowedItems();
        
        LibraryItem found = lib.searchByTitle("The Alchemist");
        if(found != null) {
            System.out.println("Found : " + found.getTitle());
        } else {
            System.out.println("Item not found");
        }
    }
}