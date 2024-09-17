import java.util.Random;

public class LightBoard {

    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        Random rand = new Random();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                lights[i][j] = rand.nextDouble() <= 0.4;
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        int count = 0;
        for (int i = 0; i < lights.length; i++) {
            if (lights[i][col]) {
                count++;
            }
        }

        if (lights[row][col]) {
            return count % 2 == 0;
        } else {
            return count % 3 == 0;
        }
    }

    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }
}