package de.flapdoodle.bugs;

public class DummyComp<T> extends AbstractComp implements HasValue<T> {

	@Override
	public boolean isReadOnly() {
		return false;
	}
}
