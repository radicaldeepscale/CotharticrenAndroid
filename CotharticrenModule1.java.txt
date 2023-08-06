public class CotharticrenModule1 {
    private double rad;
    private double radt;

    public CotharticrenModule1(double rad, double radt) {
        this.rad = rad;
        this.radt = radt;
    }

    public double cotharticrenA() {
        return calculateCotharticren();
    }

    public double cotharticrenB() {
        return calculateCotharticren();
    }

    public double cotharticrenC() {
        return calculateCotharticren();
    }

    public double cotharticrenD() {
        return calculateCotharticren();
    }

    public double cotharticrenE() {
        return calculateCotharticren();
    }

    public double cotharticrenF() {
        return calculateCotharticren();
    }

    public double cotharticrenG() {
        return calculateCotharticren();
    }

    private double calculateCotharticren() {
        double d = Math.sqrt(rad*3);
        double c = Math.pow(d, 2);
        double a = Math.pow(c, 2);
        double v = Math.pow(c, 3);
        double s = Math.pow(c, 3)*.25;
        double d2 = Math.sqrt(radt*3);
        double c2 = Math.pow(d2, 2);
        double a2 = Math.pow(c2, 2);
        double v2 = Math.pow(c2, 3);
        double s2 = Math.pow(c2, 3)*.25;
        double u = v2/8;
        double f = v*u;
        double g = v/u;  
        return f; // or return g; depending on what you want to return
    }
}
