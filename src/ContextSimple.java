public class ContextSimple {

    private Classifier classifier;

    public ContextSimple(Classifier classifier){
        this.classifier=classifier;
    }

    public void setClassifierStrategy(Classifier classifier){
        this.classifier=classifier;
    }

    public void run(){
        classifier.classify();
    }
}
