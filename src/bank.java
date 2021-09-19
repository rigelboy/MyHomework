public class bank {
    public static void main(String[] args){
        acount zhangsan=new acount("001","张三",1000);
        acount  lisi=new acount("002","李四",1000);
        zhangsan.deposite(60000);
        zhangsan.changeMoney(lisi,30000);
        lisi.withdraw(8000);
        System.out.println("张三余额"+zhangsan.getBalance());
        System.out.println("李四余额"+lisi.getBalance());

    }
}
