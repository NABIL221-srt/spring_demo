package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Capteur");
        double temp=6000;
        return temp;
    }
}
