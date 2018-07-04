package de.flapdoodle.javacbug;

import java.util.Optional;
import java.util.function.Consumer;

import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Component;

public class Components {

	static abstract class Common<T extends Component> {

	}
	
	static abstract class Ordered<T extends AbstractOrderedLayout> extends Common<T> {
		protected abstract Optional<Boolean> spacing();

		protected abstract Optional<Boolean> margin();

		protected Consumer<T> changes() {
			return instance -> {
				spacing().ifPresent(instance::setSpacing);
				margin().ifPresent(instance::setMargin);
			};
		}
	}

}
