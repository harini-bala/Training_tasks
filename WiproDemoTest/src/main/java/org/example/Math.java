package org.example;
import org.junit.*;

public class Math {
    public static void main(String[] args) {
        @Test
        public void sumTest(){
            Assert.assertEquals(7, Math.sum(2,5));
        }
        public int divide(){
            try{
                throw new Exception("zero can't be in deno");
            }
            return a/b;
        catch(Exception e){

            }
    }
}
