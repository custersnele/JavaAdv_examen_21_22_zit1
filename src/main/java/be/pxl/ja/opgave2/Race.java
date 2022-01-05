package be.pxl.ja.opgave2;

public interface Race<T> {

	double getDistance();
	void register(T racer);
	void finish(T racer);

}
