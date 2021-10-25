package flowers;
import lombok.Setter;
import lombok.Getter;


@Getter
@Setter
public class FLowerPack {
    private Flower flower;
    private int amount;



    public double price(){
        return flower.getPrice() * amount;
    }



}
