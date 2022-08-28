public class LimitingRectangle {
    private int vXmin = 0;
    private int vXmax = 0;
    private int vYmin = 0;
    private int vYmax = 0;

    public LimitingRectangle(int[][] paArr) {
        for (int vI = 0; vI < paArr.length; vI ++) {
            if (paArr[vI][0] < this.vXmin) this.vXmin = paArr[vI][0];
            if (paArr[vI][1] < this.vYmin) this.vYmin = paArr[vI][1];
            if (paArr[vI][0] > this.vXmax) this.vXmax = paArr[vI][0];
            if (paArr[vI][1] > this.vYmax) this.vYmax = paArr[vI][1];
        }
    }

    public int getWidth() {
        return this.vXmax - this.vXmin;
    }

    public int getHeight() {
        return this.vYmax - this.vYmin;
    }

    public String getBorders(){
        return "" + vYmin + ", " + vYmax + ", " + vXmin + ", " + vXmax;
    }
}

