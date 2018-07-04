package de.flapdoodle.bugs;

public class FactoryMethod<T, F extends AbstractComp> {

	public static <T, F extends AbstractComp & HasValue<T>> FactoryMethod<T, F> factory() {
		return null;
	}
}
