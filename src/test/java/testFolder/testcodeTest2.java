package testFolder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class testcodeTest2 {
    @Test
    @DisplayName("깃헙 액션을 위한 성공 테스트3")
    void suc_Test() {
        assertThat(true).isEqualTo(true);
    }
}
