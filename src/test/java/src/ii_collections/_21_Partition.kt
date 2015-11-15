package ii_collections

import ii_collections.data.customers
import ii_collections.data.reka
import ii_collections.data.shop
import junit.framework.Assert
import org.junit.Test

class _21_Partition {
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        Assert.assertEquals(setOf(customers[reka]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
