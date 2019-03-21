public class student {
    int sum;

    public int zong(int score[]) {
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }


        public double avg ( int score[]){
            for (int i = 0; i < score.length; i++) {
                sum += score[i];
            }
            return sum / score.length * 1.0;
        }

}
