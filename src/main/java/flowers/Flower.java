package flowers;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class Flower {
    public  Color color;
    public double price;
    public int sepalLength;
    private FlowerType flowerType;

}
