import java.util.HashMap;
import java.util.Map;

public class ShapeCash {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        try {
            return (Shape) cachedShape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
    }

    public static void main(String[] args) {
        ShapeCash.loadCache();
        Shape clonedShape = ShapeCash.getShape("1");
        System.out.println("Shape : " + clonedShape.getClass().getSimpleName());
    }
}
