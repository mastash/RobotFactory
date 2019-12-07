package example.singletroRepeat.singletonexample;

public class SingletonLazy {
    private SingletonLazy singletonLazy=null;

    private SingletonLazy() {
    }

    public SingletonLazy getSingletonLazy() {
        if (singletonLazy == null) {
            singletonLazy=new SingletonLazy();
        }
        return singletonLazy;
    }
}
