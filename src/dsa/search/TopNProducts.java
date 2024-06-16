package dsa.search;

import java.util.*;

class OrderEvent {
    String orderId;
    int productId;
    String timestamp;

    public OrderEvent(String orderId, int productId, String timestamp) {
        this.orderId = orderId;
        this.productId = productId;
        this.timestamp = timestamp;
    }

    public int getProductId() {
        return productId;
    }
}

public class TopNProducts {

    public static Map<Integer, Integer> getProductFrequency(List<OrderEvent> orders) {
        Map<Integer, Integer> productFrequency = new HashMap<>();

        for (OrderEvent order : orders) {
            productFrequency.put(order.getProductId(),
                    productFrequency.getOrDefault(order.getProductId(), 0) + 1);
        }

        return productFrequency;
    }

    public static List<Map.Entry<Integer, Integer>> getTopNProducts(Map<Integer, Integer> productFrequency, int N) {
        List<Map.Entry<Integer, Integer>> productList = new ArrayList<>(productFrequency.entrySet());

        productList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        return productList.subList(0, Math.min(N, productList.size()));
    }

    public static void main(String[] args) {
        List<OrderEvent> orders = new ArrayList<>();
        orders.add(new OrderEvent("dfae23213", 123, "20232104"));
        orders.add(new OrderEvent("dfae23214", 544, "20232105"));
        orders.add(new OrderEvent("dfae23215", 123, "20232106"));
        orders.add(new OrderEvent("dfae23216", 123, "20232107"));
        orders.add(new OrderEvent("dfae23217", 334, "20232108"));

        int N = 2; // top N products

        Map<Integer, Integer> productFrequency = getProductFrequency(orders);
        List<Map.Entry<Integer, Integer>> topNProducts = getTopNProducts(productFrequency, N);

        System.out.println("Top " + N + " ordered products:");
        for (Map.Entry<Integer, Integer> entry : topNProducts) {
            System.out.println("Product ID: " + entry.getKey() + ", Orders: " + entry.getValue());
        }
    }
}

