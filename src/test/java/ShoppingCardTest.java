import org.junit.Assert;
import org.junit.Test;

public class ShoppingCardTest {

    @Test
    public void add_item_toShoppingCard(){
        ShoppingCard card = new ShoppingCard();
        Item item = new Item("item1");
        boolean addedItem = card.add(item);
        Assert.assertEquals("item1", item.getName());
        Assert.assertTrue(card.items.size() == 1);
        Assert.assertEquals("item1",card.items.get(0).getName());

    }
}
