
public class Time {

/*	1. 시, 분, 초는 모두 0보다 크거나 같아야 한다.
	2. 시의 범위는 0~23, 분과 초의 범위는 0~59이다.
*/	
	
	int hour = 0;
	int min = 0;
	double sec = 0;

	int getHour() {
		return hour;
	}

	void setHour(int h) {
		if (h < 0 || h > 23) {
			return;
		}
		hour = h;
	}

	int getMin() {
		return min;

	}

	void setMin(int m) {
		if (m < 0 || m > 59) {
			return;
		}
		min = m;
	}

	double getSec() {
		return sec;

	}

	void setSec(double s) {
		if (s < 0 || s > 59.59) {
			return;
		}
		sec = s;
	}

}
