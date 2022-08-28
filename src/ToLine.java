public class ToLine {
    private int[][] data;

    public ToLine(int[][] iaPar) {
        this.data = iaPar;
    }

    public int[] resize(){
        int[] iao = new int[data.length * data[0].length];

        for (int vI = 0; vI < data.length; vI ++){
            for (int vJ = 0; vJ < data[0].length; vJ ++){
                iao[vI * data[0].length + vJ] = data[vI][vJ];
            }
        }
        return iao;
    }
}