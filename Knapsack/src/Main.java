public class Main {
    public static void main(String[] args) {
        int[] pesos = {3, 2, 5, 1};
        int[] valores = {60, 40, 100, 20};

        int capacidade = 10;

        int[][] dp = resolveKnapsack(pesos, valores, capacidade);

        imprimirSolucao(dp, pesos, valores, capacidade);
    }

    public static int[][] resolveKnapsack(int[] pesos, int[] valores, int capacidade) {
        int n = pesos.length;
        int[][] dp = new int[n + 1][capacidade + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacidade; j++) {
                if (pesos[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - pesos[i - 1]] + valores[i - 1]);
                }
            }
        }
        return dp;
    }

    public static void imprimirSolucao(int[][] dp, int[] pesos, int[] valores, int capacidade) {
        int n = pesos.length;
        int j = capacidade;

        System.out.println("Solução ótima:");
        for (int i = n; i > 0; i--) {
            if (dp[i][j] != dp[i - 1][j]) {
                System.out.println("Item " + i + ": peso = " + pesos[i - 1] + ", valor = " + valores[i - 1]);
                j -= pesos[i - 1];
            }
        }
    }
}