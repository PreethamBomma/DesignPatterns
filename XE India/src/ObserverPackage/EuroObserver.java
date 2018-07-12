package ObserverPackage;
class EuroObserver extends Observer {
    public EuroObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.println(" Inr value in GBP is " + subject.getState()*69);
    }
}
