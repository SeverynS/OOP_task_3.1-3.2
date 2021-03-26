public class Driver extends Worker{
    private int driveExperience;
    private DriveCategory driveCategory;

    public int getDriveExperience() {
        return driveExperience;
    }

    public void setDriveExperience(int driveExperience) {
        this.driveExperience = driveExperience;
    }

    public DriveCategory getDriveCategory() {
        return driveCategory;
    }

    public void setDriveCategory(DriveCategory driveCategory) {
        this.driveCategory = driveCategory;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driveExperience=" + driveExperience +
                ", driveCategory=" + driveCategory +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
