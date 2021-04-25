package calcS;


public class SumSimples {
    
       
    private String name;
    private String e_mail;
    private Double n1;
    private Double n2;
    private Float result;
    
    public Double sum1(){
        return n1 * n2;
    }
    public Double setSum(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
        return 0d;
    }
    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
