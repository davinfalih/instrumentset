public class playinstrument {
    public static void main(String[] args) {
        instrument a = new instrument();
        instrument b = new instrument("Piano", 200.0);
        instrument c = new instrument("Violin", 150.9);


        a.setType("Guitar");
        a.setPrice(101.5);
        a.print(); 
        b.print(); 
        c.print(); 




    }
}