package oop_lab04_exercise1;

public class MyUtils {

    public int AnazitisiMeEpwnymo(Employee pinakas[], String epwnimo) {
        for (int i = 0; i < pinakas.length; i++) {
            if (pinakas[i].getEponimo().equals(epwnimo)) {
                return i;
            }
        }
        return -1;
    }

    public int AnazitisiMeKodikos(Employee pinakas[], int kodikos) {
        int left = 0;
        int right = pinakas.length - 1;
        int found = -1;
        int mid;
        while (found == -1 && left <= right) {
            mid = (left + right) / 2;
            if (kodikos < pinakas[mid].getKodikos()) {
                right = mid - 1;
            } else if (kodikos > pinakas[mid].getKodikos()) {
                left = mid + 1;
            } else {
                found = mid;
            }
        }
        return found;
    }

    public void TajinomisiStoKodiko(Employee pinakas[]) {
        Employee temp;
        for (int i = 0; i < pinakas.length; i++) {
            for (int j = 1; j < pinakas.length - i; j++) {
                if (pinakas[j - 1].getKodikos() > pinakas[j].getKodikos()) {
                    temp = pinakas[j - 1];
                    pinakas[j - 1] = pinakas[j];
                    pinakas[j] = temp;
                }
            }
        }
    }
}
