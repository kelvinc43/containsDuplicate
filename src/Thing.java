public class Thing {

    public Thing() {

    }
    public boolean containsDupes(int[][] array) {
        int count = 0;
        int columns = array[0].length;
        for (int c = 0; c < array[0].length; c++) {
            for (int r = 0; r < array.length; r++) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i][c] == array[r][c]) {
                        count++;
                    }
                }
                if (count > 1) {
                    return true;
                } else count = 0;
            }
        }
        return false;
    }
}
