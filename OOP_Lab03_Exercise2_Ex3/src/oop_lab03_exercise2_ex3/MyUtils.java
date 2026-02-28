package oop_lab03_exercise2_ex3;

public class MyUtils {

    public int AnazitisiMeEpwnymo(Employee pinakas[], String key) {
        for (int i = 0; i < pinakas.length; i++) {
            if (pinakas[i].getEponimo().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public int AnazitisiMeAFM(Employee pinakas[], long key) {
        int left = 0;
        int right = pinakas.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (key < pinakas[mid].getAfm()) {
                right = mid - 1;
            } else if (key > pinakas[mid].getAfm()) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int AnadromikiAnazitisiMeAFM(Employee pinakas[], long key, int left, int right) {
        if (right < left) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (key < pinakas[mid].getAfm()) {
            return AnadromikiAnazitisiMeAFM(pinakas, key, left, mid - 1);
        } else if (key > pinakas[mid].getAfm()) {
            return AnadromikiAnazitisiMeAFM(pinakas, key, mid + 1, right);
        } else {
            return mid;
        }
    }
}
