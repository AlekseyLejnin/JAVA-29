public class M4 {
    public static void main(String[] args) {
        LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}, {13, 24}, {-45, 4}});
        System.out.println(r.getWidth() + " "  + r.getHeight());
        System.out.println(r.getBorders());
    }
}
