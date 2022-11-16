public class DemoStrategyComplex {
    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean ---");
        ContextComplex context = new ContextComplex(new ClassifierKnn(), new DistanceEuclidean());
        context.run();
        System.out.println("---  KNN with Manhattan  ---");
        context.setDistanceStrategy(new DistanceManhattan());
        context.run();
        System.out.println("--- K-means with Manhattan---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.run();
        System.out.println("--- SOM with Euclidean---");
        context.setClassifierStrategy(new ClassifierSOM());
        context.setDistanceStrategy(new DistanceEuclidean());
        context.run();
    }
}
