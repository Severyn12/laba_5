package flowers;
import lombok.Getter;
import java.util.ArrayList;



@Getter
public class FLowerBucket {

    private ArrayList<FLowerPack>flowers = new ArrayList();


    public double get_price(){
        double price = 0;
        for (FLowerPack flower_pack: flowers){
            price += flower_pack.price();

        }

        return price;
    }
    public void setFlowers(ArrayList<FLowerPack> flowers){
        this.flowers = flowers;
    }


}
