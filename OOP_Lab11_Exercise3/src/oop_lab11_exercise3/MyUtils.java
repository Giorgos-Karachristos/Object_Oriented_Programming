package oop_lab11_exercise3;

public class MyUtils {

    public int AnazitisiMeEpwnymo(Employee pinakas[], String epwnimo) {
        for (int i = 0; i < pinakas.length; i++) {
            if (pinakas[i].getEponimo().equals(epwnimo)) {
                return i;
            }
        }
        return -1;
    }

    public int AnazitisiMeKodiko(Employee pinakas[], int kodikos) {
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
                return mid;
            }
        }
        return found;
    }

    public void tajinomisiFysalidasStoKodiko(Employee pinakas[]) {
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

    public void tajinomisiEpilogisStoKodiko(Employee pinakas[]) {
        int n = pinakas.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (pinakas[j].getKodikos() < pinakas[min].getKodikos()) {
                    min = j;
                }
            }
            Employee temp = pinakas[i];
            pinakas[i] = pinakas[min];
            pinakas[min] = temp;
        }
    }

    public void tajinomisiEisagogisStoKodiko(Employee pinakas[]) {
        int n = pinakas.length;
        for (int i = 1; i < n; ++i) {
            Employee key = pinakas[i];
            int j = i - 1;
            while (j >= 0 && pinakas[j].getKodikos() > key.getKodikos()) {
                pinakas[j + 1] = pinakas[j];
                j = j - 1;
            }
            pinakas[j + 1] = key;
        }
    }
}
