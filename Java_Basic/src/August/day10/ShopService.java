package August.day10;

public class ShopService {

    private static final ShopService instance = new ShopService();

    public static ShopService getInstance(){
        return instance;
    }

}
