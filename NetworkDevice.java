package 原型与享元模式;

public interface NetworkDevice {
    public String getType();
    public void use();
    public NetworkDevice clone() throws CloneNotSupportedException;
}
