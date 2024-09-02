public class instrument {
   

    private String Type;
    private double Price;

    public String getType() {
        return this.Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public double getPrice() {
        return this.Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
        
        public instrument(){
        Type = "null";
        Price = 0;
    }
        public instrument(String T, double P){
            Type= T;
            Price= P;
        }

        public void print(){
            System.out.println(Type +" Price:"+Price);
        }
    
    }
