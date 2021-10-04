package 模拟读写数据;

public class TestReadSaveData {
    public static void main(String[] args) {
        BusinessA bussiness = new BusinessA(new ReadSaveTextFile());
        bussiness.saveData("保存到文件中");
        BusinessB bussinessB = new BusinessB(new ReadSaveWordFile());
        bussinessB.saveData("保存到word文件中");
    }
}
