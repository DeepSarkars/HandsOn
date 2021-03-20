package ObserverPattern;

public interface Subject {
	public void attach(Observer ob);
	public void detach(Observer ob);
	public abstract void notifyAllObservers();
}
