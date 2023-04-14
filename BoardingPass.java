public class BoardingPass {
    private String name = "No name";
    private int passNumber = 0;
    
    //Creates a BoardingPass object using a name and number value
    //Check the about file for a potential improvement
    public BoardingPass(String name, int passNumber) {
        this.name = name;
        this.passNumber = passNumber;
    }

    public BoardingPass(String name, BoardingPass[] arr) {
        this.name = name;
        boolean uniqueNum = false;
        int tempNum = (int) (Math.random() * 999999) + 100000;
        while(!uniqueNum) {
            uniqueNum = true;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].passNumber == tempNum) {
                    uniqueNum = false;
                    tempNum = (int) (Math.random() * 999999) + 100000;
                    break;
                }
            }
        }
        this.passNumber = tempNum;
    }

    //Returns the name of the pass holder
    public String getName() {
        return this.name;
    }
    //Sets or overwrites the name of the pass holder
    public void setName(String name) {
        this.name = name;
    }
    //Returns the pass holder's pass number
    public int getPassNumber() {
        return this.passNumber;
    }
    //Sets or overwrites the pass holder's pass number
    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }
    //Prints out the name of the pass holder followed by their pass number (John Doe, 12345)
    public String toString() {
        return (
            this.getName() + ", " + this.getPassNumber()
        );
    }
}
