package ObserverPackage;
class USDObserver extends Observer {
    public USDObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.println(" Inr value in" + subject.getState()*65);
    }
}
