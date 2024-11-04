package lotto.domain.lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.lotto.Lotto;

public class LottoMachine {

    private final int LOTTO_START_INDEX = 1;
    private final int LOTTO_END_INDEX = 45;
    private final int LOTTO_SIZE = 6;

    public Lotto create() {
        return new Lotto(
            Randoms.pickUniqueNumbersInRange(LOTTO_START_INDEX, LOTTO_END_INDEX, LOTTO_SIZE));
    }
}