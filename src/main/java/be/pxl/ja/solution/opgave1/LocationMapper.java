package be.pxl.ja.solution.opgave1;

@FunctionalInterface
public interface LocationMapper<T> {

	Location<T> mapLocation(String city, String country, String lat, String lon);
}
