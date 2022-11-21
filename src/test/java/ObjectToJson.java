import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ObjectToJson {
    public static void main(String[] a)
    {

        Product product = new Product();

        product = getObjectData(product);

        ObjectMapper Obj = new ObjectMapper();
        try {
            String jsonStr = Obj.writeValueAsString(product);
            System.out.println(jsonStr);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Product getObjectData(Product product)
    {
        product.setId(101);
        product.setName("Spark 131");
        product.setPrice(10000);

        return product;
    }
}  