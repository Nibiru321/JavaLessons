class DataSet {
    private double[] data;
    private int dataSize;
    private double sum;

    public DataSet() {
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }

    public void add(double value) {
        data[dataSize] = value;
        dataSize++;
        sum += value;
    }

    public double getAverage() {
        return (dataSize == 0) ? 0 : sum / dataSize;
    }

    public double getStandardDeviation() {
        double mean = getAverage();
        double sumOfSquares = 0.0;
        for (int i = 0; i < dataSize; i++) {
            double diff = data[i] - mean;
            sumOfSquares += diff * diff;
        }
        return Math.sqrt(sumOfSquares / dataSize);
    }

    public static double calculateAverage(DataSet[] dataSets) {
        double total = 0.0;
        for (DataSet ds : dataSets) {
            total += ds.getAverage();
        }
        return total / dataSets.length;
    }

    public String toString() {
        return "DataSet [Size=" + dataSize + ", Avg= " + getAverage() + "]";
    }
}

class Main {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        dataSet.add(10);
        dataSet.add(12);
        dataSet.add(14);
        dataSet.add(16);
        dataSet.add(18);
        System.out.println("Standard Deviation: " + dataSet.getStandardDeviation());

        DataSet[] dataSets = new DataSet[3];

        DataSet ds1 = new DataSet();
        ds1.add(2);
        ds1.add(4);
        ds1.add(6);

        DataSet ds2 = new DataSet();
        ds2.add(1);
        ds2.add(3);
        ds2.add(5);

        DataSet ds3 = new DataSet();
        ds2.add(10);
        ds2.add(20);

        dataSets[0] = ds1;
        dataSets[1] = ds2;
        dataSets[2] = ds3;

        System.out.println("Average of Averages: " + DataSet.calculateAverage(dataSets));
    }
    
}