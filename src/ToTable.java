public class ToTable {
    private int[] data;
    private int x;
    private int y;

    public ToTable(int[] iaPar, int iX, int iY){
        this.data = iaPar;
        this.x = iX;
        this.y = iY;
    }

    public int[][] resize() {
        int[][] iaa = new int[this.x][this.y];

        for (int vI = 0; vI < this.x; vI ++){
            for (int vJ = 0; vJ < this.y; vJ ++){
                iaa[vI][vJ] = this.data[vI * this.y + vJ];
            }
        }
        return iaa;
    }
}
