package 原型与享元模式;

public class Swich implements NetworkDevice,Cloneable{

    private String type;

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by switch,type is"+this.type);
    }

    @Override
    public NetworkDevice clone() throws CloneNotSupportedException {
        return (NetworkDevice) super.clone();
    }
    public Swich(String type){
        this.type=type;
    }
}
