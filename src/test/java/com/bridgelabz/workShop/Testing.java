package com.bridgelabz.workShop;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testing {
   @Test
    public void givenString(){
       RemoveDuplicateCharactor remove = new RemoveDuplicateCharactor();
       assertEquals(true,remove.removeDuplicates("BridgelabzCodingClub"));
   }
}
