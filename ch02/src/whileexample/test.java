package whileexample;



public class test {

	public static void main(String[] args) {
        int size = 5; // 행렬 크기
        int[][] matrix = new int[size][size]; // 행렬 생성
        int num = 1; // 숫자 변수

        int startRow = 0; // 시작 행 인덱스
        int endRow = size - 1; // 마지막 행 인덱스
        int startCol = 0; // 시작 열 인덱스
        int endCol = size - 1; // 마지막 열 인덱스

        while (startRow <= endRow && startCol <= endCol) {
            // 위쪽 행
            for (int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = num++;
            }
            startRow++;

            // 오른쪽 열
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = num++;
            }
            endCol--;

            // 아래쪽 행
            for (int i = endCol; i >= startCol; i--) {
                matrix[endRow][i] = num++;
            }
            endRow--;

            // 왼쪽 열
            for (int i = endRow; i >= startRow; i--) {
                matrix[i][startCol] = num++;
            }
            startCol++;
        }

        // 행렬 출력
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }

}
