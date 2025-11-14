package restaurant.threads;
import restaurant.core.*;

import java.util.List;

public class ReservationTask implements Runnable {
    private List<Table> tables;
    private Customer customer;

    public ReservationTask(List<Table> tables, Customer customer) {
        this.tables = tables;
        this.customer = customer;
    }

    @Override
    public void run() {
        synchronized (tables) {
            for (Table t : tables) {
                if (!t.isReserved()) {
                    t.reserve();
                    System.out.println(customer.getName() + " booked Table " + t);
                    return;
                }
            }
            System.out.println("No tables available for " + customer.getName());
        }
    }
}
