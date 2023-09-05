
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        int sum = 0;
        if (numberOfDays >= birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for (int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                count++;
            }

        }
        return count;
    }
}
