public class ContextComplex {
    private Classifier classifier;
    private Distance distance;

    public ContextComplex(Classifier classifier, Distance distance){
        this.classifier=classifier;
        this.distance=distance;
    }

    public void setClassifierStrategy(Classifier classifier){
        this.classifier=classifier;
    }

    public void setDistanceStrategy(Distance distance){
        this.distance=distance;
    }

    public void run(){
        distance.compute();
        classifier.classify();
    }
}
