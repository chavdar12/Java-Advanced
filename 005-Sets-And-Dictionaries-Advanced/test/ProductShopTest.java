import org.junit.jupiter.api.Test;

import static support.Console.check;

class ProductShopTest {
    @Test
    void shopsSortedProductsInOrder() throws Exception {
        check("""
                fantastico->
                Product: apple, Price: 1.2
                Product: grape, Price: 2.2
                kaufland->
                Product: banana, Price: 1.1
                lidl->
                Product: juice, Price: 2.3
                """, () -> ProductShop.main(new String[0]), """
                lidl, juice, 2.30
                fantastico, apple, 1.20
                kaufland, banana, 1.10
                fantastico, grape, 2.20
                Revision
                """);
    }
}
