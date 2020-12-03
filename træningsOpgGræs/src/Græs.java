public class Græs {
    double startLength = 1;
    double maxLength = 5;
    double growth = 0.8;
    int days = 2;
    double currentLength=startLength+(growth*days);


    public double getCurrentLength() {
            return currentLength;
    }

    public void setCurrentLength(double currentLength) {
        this.currentLength = currentLength;
    }

    public double getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(double maxLength) {
        this.maxLength = maxLength;
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }
}
