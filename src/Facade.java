/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/1914:35
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Facade {
    System1 s;
    System2 ss;
    System3 sss;
    public Facade() {
        s= new System1();
        ss = new System2();
        sss=new System3();

    }
    public void summethod(){
        s.A();
        ss.B();
        sss.C();
    }
}
