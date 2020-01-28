import Clients.Client;
import Clients.IndividualEntrepreneur;
import Clients.Legal;
import Clients.PhysicalPerson;

import java.math.BigDecimal;

public class Loader {

    public static void main(String[] args) {

        System.out.println("ИП");
            Client client1 = new IndividualEntrepreneur("ИП Васильев", 1234567891011123L);
            client1.put(new BigDecimal("999"));
            client1.balance();

            client1.put(new BigDecimal("1000"));
            client1.balance();

            client1.take(new BigDecimal("1000"));
            client1.balance();

        System.out.println("Физ. лицо");
            Client client2 = new PhysicalPerson("Петр", 1234567891011124L);
            client2.put(new BigDecimal("999"));
            client2.balance();

            client2.put(new BigDecimal("1000"));
            client2.balance();

            client2.take(new BigDecimal("1000"));
            client2.balance();

        System.out.println("Юр. лицо");
            Client client3 = new Legal("OOO Ромашка", 1234567891011125L);
            client3.put(new BigDecimal("999.13"));
            client3.balance();

            client3.put(new BigDecimal("1100"));
            client3.balance();

            client3.take(new BigDecimal("1000"));
            client3.balance();
        }
    }

