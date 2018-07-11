package ObserverPackage;
class GBPObserver extends Observer {
    public GBPObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.println(" Inr value in GBP is " + subject.getState()*80);
    }
}
