package testFolder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestcodeTest {

    @Test
    @DisplayName("깃헙 액션을 위한 성공 테스트")
    void suc_Test() {
        assertThat(true).isEqualTo(true);
    }

    @Test
    @DisplayName("깃헙 액션을 위한 성공 테스트2")
    void suc_Test2() {
        assertThat(true).isEqualTo(true);
    }

    @Test
    @DisplayName("깃헙 액션을 위한 실패 테스트")
    void fail_Test() {
        assertThat(true).isEqualTo(false);
    }
}
