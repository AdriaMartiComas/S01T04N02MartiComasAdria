package exercici1;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

class LengthTest {

	String mordor = "Mordor";
	int mordorLength = 6;

	@Test
	void stringLenght() {

		assertThat(mordor, length(is(8)));

	}

	public static Matcher<String> length(Matcher<? super Integer> matcher) {
		return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {

			@Override
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}
		};
	}

}
