class A{
    private  int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
public class Text_3_18 {
    public static void main(String[] args) {
        A sc=new A();
        sc.setData(520);
        System.out.println(sc.getData());
    }
}
