package racingcar.Model;

import java.util.List;
import java.util.Map;
import racingcar.View.InputView;

public class RacingData {
    private String carName; //자동차 이름
    private static Map<String,Integer> racingCar; //사용자가 입력할 자동차 이름을 저장할 리스트
    private String moveNumber; //이동 횟수 -> 추후에 정수형으로 변환
    private List<Integer> moveValidationNumber; //전진과 멈춤을 판단하는 난수를 저장 할 리스트

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public static Map<String,Integer> getRacingCar() {
        return racingCar;
    }

    public void setRacingCar(Map<String,Integer> racingCar) {
        this.racingCar = InputView.storeCarName();
    }

    public String getMoveNumber() {
        return moveNumber;
    }

    public void setMoveNumber(String moveNumber) {
        this.moveNumber = moveNumber;
    }

    public List<Integer> getMoveValidationNumber() {
        return moveValidationNumber;
    }

    public void setMoveValidationNumber(List<Integer> moveValidationNumber) {
        this.moveValidationNumber = moveValidationNumber;
    }
}
