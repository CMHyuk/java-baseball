package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomBallNumberTest {

    RandomBallNumber randomBallNumber;

    @BeforeEach
    void init() {
        randomBallNumber = new RandomBallNumber();
    }

    @Test
    void 랜덤숫자_길이_테스트() {
        String randomNumber = randomBallNumber.createRandomNumber();
        assertThat(randomNumber.length()).isSameAs(3);
    }

    @Test
    void 랜덤숫자_클리어_테스트() {
        String clearRandomNumber = randomBallNumber.clearRandomNumber();
        assertThat(clearRandomNumber).isEqualTo("");
    }
}