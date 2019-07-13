public class Gradle {
    private Dependency dependency;

    public Gradle(Dependency dependency) {
        this.dependency = dependency;
    }

    public String beenCalled() {
        return dependency.say();
    }
}
