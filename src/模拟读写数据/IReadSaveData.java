package 模拟读写数据;

public interface IReadSaveData {
    public abstract void saveData(String data);//保存数据的方法
    public abstract String getData(); //读取数据的方法
}
