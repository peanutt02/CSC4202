blic class GroupProjectAlgo {
    static class Graph {
        private int[][] adjMatrix;
        private String[] vertexData;
        private int size;   
        
        public Graph(int size) {
            this.size = size;
            this.adjMatrix = new int[size][size];
            this.vertexDat
