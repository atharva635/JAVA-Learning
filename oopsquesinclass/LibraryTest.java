import java.util.ArrayList;

abstract class LibraryItem {
    protected int daysOverdue;

    public LibraryItem(int daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    // Each item calculates its own fee
    public abstract int calculateLateFee();
}

class Book extends LibraryItem {
    public Book(int daysOverdue) {
        super(daysOverdue);
    }

    @Override
    public int calculateLateFee() {
        if(daysOverdue < 7) return 0;
        else if(daysOverdue <= 14) return 20;
        else return 50;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int daysOverdue) {
        super(daysOverdue);
    }

    @Override
    public int calculateLateFee() {
        if(daysOverdue < 3) return 0;
        else if(daysOverdue <= 7) return 5;
        else return 10;
    }
}

class Newspaper extends LibraryItem {
    public Newspaper(int daysOverdue) {
        super(daysOverdue);
    }

    @Override
    public int calculateLateFee() {
        if(daysOverdue < 4) return 0;
        else if(daysOverdue <= 10) return 10;
        else return 20;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        // Create a list of items
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(new Book(10));
        items.add(new Magazine(8));
        items.add(new Newspaper(12));
        items.add(new Book(3));
        items.add(new Magazine(2));

        // Calculate total fees in one place
        int totalFees = 0;
        for(LibraryItem item : items) {
            totalFees += item.calculateLateFee();
        }

        System.out.println("Total late fees: $" + totalFees);
    }
}
    